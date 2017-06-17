//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

class d extends wClass {
    private q d = new q(0, 0);
    private q e = new q(0, 0);
    private ImageSize g = new ImageSize(0, 0);
    private ImageSize h = new ImageSize(256, 256);
    private int i = 0;
    private PNGImage image;
    private int k = -1;
    private int l = 0;
    private int m = 0;

    public d() {
    }

    public void a() {
        super.a();
        if((super.flags & 128) != 0) {
            this.l();
        }

    }

    public void a(Graphics graphics) {
        if((super.flags & 2) != 0) {
            q var2;
            if((super.flags & 1073741824) != 0) {
                var2 = Canvas.c();
            } else {
                var2 = new q();
            }

            int var3 = var2.a + super.a.a;
            int var6 = var2.b + super.a.b;
            var3 -= this.d.a;
            if(this.h.height != 256) {
                var6 -= this.d.b + 10;
            } else {
                var6 -= this.d.b;
            }

            int var4 = this.g.width * this.h.width >> 8;
            int var5 = this.g.height * this.h.height >> 8;
            if(var3 >= -var4 && var3 < var4 + 240 && var6 >= -var5 && var6 < var5 + 320) {
                if(this.image != null) {
                    Image var7 = this.image.image;
                    if((super.flags & 16) != 0) {
                        x.b(graphics, var7, this.e.a, this.e.b, this.g.width, this.g.height, this.i, wClass.c.a + var3, wClass.c.b + var6, 20);
                        return;
                    }

                    x.a(graphics, var7, this.e.a, this.e.b, this.g.width, this.g.height, this.i, wClass.c.a + var3, wClass.c.b + var6, 20);
                    return;
                }

                graphics.setColor(super.color);
                graphics.fillRect(wClass.c.a + var3, wClass.c.b + var6, var4, var5);
            }
        }

    }

    public final void a(int var1) {
        this.a(var1, 1);
    }

    public final void a(int imageId, int var2) {
        this.image = Canvas.getPNGImage(imageId);
        if(this.image != null) {
            Image var3 = this.image.image;
            if(this.image.image != null) {
                this.g.width = var3.getWidth();
                this.g.height = var3.getHeight();
                this.e.a = 0;
                this.e.b = 0;
                this.d.a(this.dMethod(var2));
            }
        } else {
            this.b(0, 0);
        }

    }

    public final void a(int imageId, int var2, z var3) {
        this.image = Canvas.getPNGImage(imageId);
        if(this.image != null) {
            this.e.a = var3.a;
            this.e.b = var3.b;
            this.g.width = var3.width;
            this.g.height = var3.height;
            this.d.a(this.dMethod(var2));
        }

    }

    private q dMethod(int var1) {
        q var2 = new q();
        if(var1 == 0) {
            var2.a(this.g.width >> 1, this.g.height >> 1);
        } else if(var1 == 1) {
            var2.a(0, 0);
        } else if(var1 == 8) {
            var2.a(this.g.width >> 1, this.g.height);
        } else if(var1 == 2) {
            var2.a(0, this.g.height);
        } else if(var1 == 3) {
            var2.a(this.g.width, 0);
        } else if(var1 == 4) {
            var2.a(this.g.width, this.g.height);
        } else if(var1 == 5) {
            var2.a(0, this.g.height >> 1);
        } else if(var1 == 6) {
            var2.a(this.g.width, this.g.height >> 1);
        } else if(var1 == 7) {
            var2.a(this.g.width >> 1, 0);
        }

        return var2;
    }

    public final void b(int var1, int var2) {
        this.g.width = var1;
        this.g.height = var2;
    }

    public final int b() {
        return this.g.width;
    }

    public final int c() {
        return this.g.height;
    }

    public final void c(int var1, int var2) {
        this.d.a = 0;
        this.d.b = 11;
    }

    public final void b(int var1) {
        this.i = var1;
    }

    public final void d(int var1, int var2) {
        this.h.width = var1;
        this.h.height = var2;
        if(this.h.width == 256 && this.h.height == 256) {
            super.flags &= -17;
        } else {
            super.flags |= 16;
        }
    }

    private void l() {
        am var1;
        if(this.k != -1 && --this.l <= 0 && (var1 = Canvas.k(this.k)) != null) {
            c var2;
            while((var2 = var1.a[this.m]).d == 0) {
                if(var2.c != 1) {
                    super.flags &= -129;
                    return;
                }

                this.m = var2.f;
            }

            this.l = var2.d;
            if(var2.a) {
                this.a(var2.c, var2.f, var2.b);
            } else if(var2.f == -1) {
                this.a(var2.c, 1);
            } else {
                this.a(var2.c, var2.f);
            }

            this.i = var2.e;
            ++this.m;
        }

    }

    public final void c(int var1) {
        this.e(var1, 0);
    }

    public final void e(int var1, int var2) {
        this.k = var1;
        this.l = var2;
        this.m = 0;
        super.flags |= 128;
        this.l();
    }

    public final int getK() {
        return this.k;
    }

    public final void e() {
        super.flags &= -129;
    }
}
