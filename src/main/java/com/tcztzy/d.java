//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

class d extends wClass {
    private Point dst = new Point(0, 0);
    private Point src = new Point(0, 0);
    private ImageSize start = new ImageSize(0, 0);
    private ImageSize end = new ImageSize(256, 256);
    private int transform = 0;
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
            Point point;
            if((super.flags & 1073741824) != 0) {
                point = MankeyManCanvas.getPoint();
            } else {
                point = new Point();
            }

            int x_shift = point.x + super.a.x;
            int y_shift = point.y + super.a.y;
            x_shift -= this.dst.x;
            if(this.end.height != 256) {
                y_shift -= this.dst.y + 10;
            } else {
                y_shift -= this.dst.y;
            }

            int var4 = this.start.width * this.end.width >> 8;
            int var5 = this.start.height * this.end.height >> 8;
            if(x_shift >= -var4 && x_shift < var4 + 240 && y_shift >= -var5 && y_shift < var5 + 320) {
                if(this.image != null) {
                    Image image = this.image.image;
                    if((super.flags & 16) != 0) {
                        RegionPainter.drawRegionB(graphics, image, this.src.x, this.src.y, this.start.width, this.start.height, this.transform, wClass.c.x + x_shift, wClass.c.y + y_shift, 20);
                        return;
                    }

                    RegionPainter.drawRegionA(graphics, image, this.src.x, this.src.y, this.start.width, this.start.height, this.transform, wClass.c.x + x_shift, wClass.c.y + y_shift, 20);
                    return;
                }

                graphics.setColor(super.color);
                graphics.fillRect(wClass.c.x + x_shift, wClass.c.y + y_shift, var4, var5);
            }
        }

    }

    public final void a(int imageId) {
        this.a(imageId, 1);
    }

    public final void a(int imageId, int transformType) {
        this.image = MankeyManCanvas.getPNGImage(imageId);
        if(this.image != null) {
            Image image = this.image.image;
            if(image != null) {
                this.start.width = image.getWidth();
                this.start.height = image.getHeight();
                this.src.x = 0;
                this.src.y = 0;
                this.dst.moveTo(this.transformPoint(transformType));
            }
        } else {
            this.setStart(0, 0);
        }

    }

    public final void a(int imageId, int transformType, z var3) {
        this.image = MankeyManCanvas.getPNGImage(imageId);
        if(this.image != null) {
            this.src.x = var3.x;
            this.src.y = var3.y;
            this.start.width = var3.width;
            this.start.height = var3.height;
            this.dst.moveTo(this.transformPoint(transformType));
        }

    }

    private Point transformPoint(int transform_type) {
        Point point = new Point();
        if(transform_type == 0) {
            point.moveTo(this.start.width >> 1, this.start.height >> 1);
        } else if(transform_type == 1) {
            point.moveTo(0, 0);
        } else if(transform_type == 8) {
            point.moveTo(this.start.width >> 1, this.start.height);
        } else if(transform_type == 2) {
            point.moveTo(0, this.start.height);
        } else if(transform_type == 3) {
            point.moveTo(this.start.width, 0);
        } else if(transform_type == 4) {
            point.moveTo(this.start.width, this.start.height);
        } else if(transform_type == 5) {
            point.moveTo(0, this.start.height >> 1);
        } else if(transform_type == 6) {
            point.moveTo(this.start.width, this.start.height >> 1);
        } else if(transform_type == 7) {
            point.moveTo(this.start.width >> 1, 0);
        }

        return point;
    }

    final void setStart(int var1, int var2) {
        this.start.width = var1;
        this.start.height = var2;
    }

    final int getStartWidth() {
        return this.start.width;
    }

    final int getStartHeight() {
        return this.start.height;
    }

    public final void c(int var1, int var2) {
        this.dst.x = 0;
        this.dst.y = 11;
    }

    final void changeTransform(int transform) {
        this.transform = transform;
    }

    final void setEnd(int var1, int var2) {
        this.end.width = var1;
        this.end.height = var2;
        if(this.end.width == 256 && this.end.height == 256) {
            super.flags &= -17;
        } else {
            super.flags |= 16;
        }
    }

    private void l() {
        am var1;
        if(this.k != -1 && --this.l <= 0 && (var1 = MankeyManCanvas.k(this.k)) != null) {
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

            this.transform = var2.e;
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
