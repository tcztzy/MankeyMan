//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.microedition.lcdui.Graphics;

final class at extends wClass {
    private ImageSize d = new ImageSize(12, 12);
    private ImageSize e = new ImageSize(240, 320);
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 8;
    private int l;
    private int m = 0;
    private boolean n = false;
    private String o = null;

    at() {
        super.flags |= 16;
    }

    public final void a() {
        if(this.o != null && !this.n) {
            if(this.o.length() > this.h) {
                if(this.i == 0) {
                    this.h = this.o.length();
                } else if(++this.j >= this.i) {
                    ++this.h;
                    this.j = 0;
                }
            } else {
                this.n = true;
            }
        }

        super.a();
    }

    public final void a(Graphics graphics) {
        if(this.o != null) {
            graphics.setFont(Canvas.a(this.k));
            graphics.setColor(super.color);
            int var2 = Canvas.a(this.k).getHeight();
            int var3 = super.a.a;
            int var4 = super.a.b + var2;
            int var5 = 0;
            int var6 = 0;
            if((super.flags & 16) != 0) {
                int var7 = 0;

                for(int var8 = 0; var8 < this.h; ++var8) {
                    if(this.o.charAt(var8) == 9661 || var8 == this.o.length() - 1) {
                        ++var6;
                        if(var8 > 0 && var3 >= 0 - var2 - (var8 - var7) * var2 && var3 <= var2 + 240 && var4 >= 0 - var2 && var4 <= var2 + 320 && 0 < this.e.width && var5 < this.e.height && var6 > this.m) {
                            if(this.o.charAt(var8) == 9661) {
                                graphics.drawString(this.o.substring(var7, var8), wClass.c.a + var3, wClass.c.b + var4, 68);
                            } else {
                                graphics.drawString(this.o.substring(var7, var8 + 1), wClass.c.a + var3, wClass.c.b + var4, 68);
                            }
                        }

                        var4 += this.d.height;
                        var5 += this.d.height;
                        var7 = var8 + 1;
                        if(var6 <= this.m) {
                            var5 = 0;
                            var4 = super.a.b + var2;
                        }
                    }
                }
            }
        }

    }

    private void a(String var1, int var2) {
        this.i = 0;
        this.j = 0;
        this.h = 0;
        this.g = 0;
        this.n = false;
        this.o = var1;
        this.m = 0;
        this.l = 0;
        if(this.o != null) {
            this.g = this.o.length();

            for(int var3 = 0; var3 < this.g; ++var3) {
                if(this.o.charAt(var3) == 9661) {
                    ++this.l;
                }
            }
        }

    }

    public final void a(String var1) {
        this.a(var1, 0);
    }

    public final void a(int var1) {
        this.a(Canvas.getMessage(var1), 0);
    }

    public final void a(int var1, int var2) {
        this.d.width = 12;
        this.d.height = var2;
    }

    public final void a(ImageSize var1) {
        this.e.width = var1.width;
        this.e.height = var1.height;
    }

    public final int b() {
        return this.l;
    }

    public final void b(int var1) {
        this.m = var1;
    }
}
