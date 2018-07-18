//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class ab extends DataStoreBase {
    private d[] a;
    private Point b;
    private Point c;
    private Point d;
    private int e;
    private int g;
    private int h;
    private int i;
    private int j;
    private int[] k;
    private int[] l;
    private int m;
    private static z[] n = new z[]{new z(24, 16, 10, 10), new z(24, 0, 20, 16), new z(0, 0, 24, 26), new z(88, 0, 30, 18), new z(48, 0, 40, 24), new z(0, 0, 48, 32), new z(24, 16, 10, 10), new z(24, 0, 20, 16), new z(0, 0, 24, 26), new z(41, 0, 41, 40), new z(0, 0, 41, 54), new z(0, 0, 240, 97), new z(30, 0, 15, 15), new z(15, 0, 15, 15), new z(0, 0, 15, 15), new z(10, 0, 5, 12), new z(10, 0, 5, 12), new z(0, 0, 10, 22), new z(66, 39, 8, 8), new z(47, 0, 27, 27), new z(0, 0, 47, 47), new z(0, 0, 40, 33), new z(40, 0, 20, 14), new z(40, 14, 22, 12), new z(60, 0, 16, 14), new z(62, 14, 24, 18)};
    private static int[] o = new int[]{174, 166, 168, 165, 162, 170, 167, 164, 175, 163, 175, 175, 169, 175, 175, 175, 171, 171, 171, 171, 172, 172, 172, 172, 173, 173, 173, 173};
    private static final int[] p = new int[]{768, 640, 512};
    private static final int[] q = new int[]{20, 30, 40};
    private static final int[] r = new int[]{9, 9, 8};

    ab() {
    }

    public final boolean a() {
        this.i(1792);
        this.b = new Point(0, 0);
        this.c = new Point(0, 0);
        this.d = new Point(0, 0);
        this.k = new int[4];
        this.l = new int[4];
        this.a = new d[4];
        MankeyManCanvas.a(this.a);
        return true;
    }

    public final void b() {
        MankeyManCanvas.b(this.a);
        this.a = null;
    }

    public final void c() {
        this.m = this.getC();
        if(this.getD() == 1) {
            if(this.i > 0 && --this.i == 0) {
                this.g(0);
                this.m = 0;
            }

            if(this.i == 0) {
                ab var1;
                int var2;
                int var3;
                switch(this.e) {
                    case 1:
                        if(this.m == 0) {
                            this.a[0].a(148, 8, n[3 + this.g]);
                            this.a[0].setFlagTrue(1073741824);
                            this.a[0].b(this.b);
                            this.a[0].g(this.j);
                            this.a[0].setFlag2(true);
                            this.c.x = this.b.x << 8;
                            this.c.y = this.b.y - 32 << 8;
                            this.d.x = 0;
                            this.d.y = 1536;
                        }

                        if(this.m < 60) {
                            this.d.y += 416;
                            if((this.c.y += this.d.y) > this.b.y << 8) {
                                this.c.y = this.b.y << 8;
                                this.d.y = this.d.y * -224 >> 8;
                            }

                            this.a[0].f(this.c.x >> 8, this.c.y >> 8);
                        }

                        return;
                    case 2:
                        var1 = this;
                        if(this.m == 0) {
                            this.h();
                            this.c.x = this.b.x << 8;
                            this.c.y = this.b.y << 8;
                        }

                        if(this.m < 15) {
                            this.c.y = (this.b.y << 8) - 30 * MankeyManCanvas.sin(6 * this.m);

                            for(var2 = 0; var2 < var1.h; ++var2) {
                                Point var5 = var1.a[var2].f();
                                var1.a[var2].f(var5.x, var1.c.y >> 8);
                                var1.a[var2].setFlagTrue(1073741824);
                            }

                            return;
                        } else {
                            if(this.m >= 25) {
                                if(this.m == 25) {
                                    this.d();
                                }

                                return;
                            }

                            for(var2 = 0; var2 < var1.h; ++var2) {
                                var1.a[var2].setFlag2(var1.m / 2 % 2 == 0);
                            }

                            return;
                        }
                    case 3:
                        var1 = this;
                        if(this.m == 0) {
                            for(var2 = 0; var2 < 2; ++var2) {
                                var1.a[var2].a(5, 0, n[6 + var1.g]);
                                var1.a[var2].setFlagTrue(1073741824);
                                var1.a[var2].b(var1.b);
                                var1.a[var2].g(var1.j);
                                var1.a[var2].setFlag2(true);
                            }
                        }

                        if(var1.m >= 12) {
                            if(var1.m == 12) {
                                var1.d();
                            }

                            return;
                        }

                        for(var2 = 0; var2 < 2; ++var2) {
                            var3 = p[var1.g] * MankeyManCanvas.sin(15 * var1.m) >> 8;
                            var1.a[var2].setEnd(var3, var3);
                            var3 = MankeyManCanvas.h() % 360;
                            int var4 = MankeyManCanvas.h() % q[var1.g];
                            var1.a[var2].f(var1.b.x + (MankeyManCanvas.cos(var3) * var4 >> 8), var1.b.y + (MankeyManCanvas.sin(var3) * var4 >> 8));
                        }

                        return;
                    case 4:
                        var1 = this;
                        if(this.m == 0) {
                            for(var2 = 0; var2 < 2; ++var2) {
                                var1.a[var2].a(6, 0);
                                var1.a[var2].b(var1.b);
                                var1.a[var2].g(var1.j);
                                var1.a[var2].setFlag2(true);
                                var1.k[var2] = 256 + MankeyManCanvas.h() % 768;
                                var1.l[var2] = 10 + MankeyManCanvas.h() % 30;
                            }
                        }

                        if(var1.m >= 12) {
                            if(var1.m == 12) {
                                var1.d();
                            }

                            return;
                        }

                        var2 = var1.b.y - (MankeyManCanvas.sin(14 * var1.m) * var1.l[0] >> 8);
                        var3 = var1.b.x + (var1.k[0] * var1.m >> 8);
                        var1.a[0].f(var3, var2);
                        var2 = var1.b.y - (MankeyManCanvas.sin(14 * var1.m) * var1.l[1] >> 8);
                        var3 = var1.b.x - (var1.k[1] * var1.m >> 8);
                        var1.a[1].f(var3, var2);
                        break;
                    case 5:
                        if(this.m == 0) {
                            this.a[0].a(r[this.g], 8, n[9 + this.g]);
                            this.a[0].f(120, 320);
                            this.a[0].g(this.j);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                            this.k[0] = 0;
                        }

                        if(this.m % 3 == 0) {
                            this.a[0].changeTransform((this.k[0] ^= 1) != 0?0:2);
                        }

                        return;
                    case 6:
                        if(this.m == 0) {
                            this.a[0].a(13, 0, n[12 + this.g]);
                            this.a[0].b(this.b);
                            this.a[0].g(this.j);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                            this.k[0] = 5 + MankeyManCanvas.h() % 10;
                            this.a[0].a(this.b.x + (MankeyManCanvas.cos(130) * 360 >> 8), this.b.y + (MankeyManCanvas.sin(130) * 360 >> 8), this.k[0], 0);
                        }

                        if(this.m == this.k[0]) {
                            this.g(0);
                        }

                        return;
                    case 7:
                        if(this.m == 0) {
                            this.a[0].a(13, 0, new z(45, 0, 15, 15));
                            this.a[0].b(this.b);
                            this.a[0].g(this.j);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                            this.k[0] = 20 + MankeyManCanvas.h() % 20;
                            this.k[1] = 80 + MankeyManCanvas.h() % 20;
                        }

                        if(this.m <= this.k[1]) {
                            this.a[0].f(this.b.x + (MankeyManCanvas.sin(18 * this.m) * this.k[0] >> 8), this.b.y + ('\uf000' / this.k[1] * this.m >> 8));
                            if(this.m == this.k[1]) {
                                this.g(0);
                            }
                        }

                        return;
                    case 8:
                        this.g();
                        return;
                    case 9:
                        this.g();
                        return;
                    case 10:
                        if(this.m == 0) {
                            this.a[0].a(19, 0, new z(0, 0, 49, 40));
                            this.a[0].b(this.b);
                            this.a[0].g(0);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                        }

                        var2 = this.b.x + (MankeyManCanvas.sin(12 * (this.m % 30)) << 3 >> 8);
                        var3 = this.b.y - (MankeyManCanvas.sin(3 * (this.m % 30)) * 24 >> 8);
                        if(this.m >= 30) {
                            var3 = this.b.y - 24;
                        }

                        this.a[0].f(var2, var3);
                        return;
                    case 11:
                    default:
                        break;
                    case 12:
                        if(this.m == 0) {
                            this.a[0].a(20, 0, n[18 + this.g]);
                            this.a[0].b(this.b);
                            this.a[0].g(this.j);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                        }

                        return;
                    case 13:
                        if(this.m == 0) {
                            this.a[0].a(10, 8);
                            this.a[0].g(this.j);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                        }

                        this.a[0].f(this.b.x, this.b.y + (12 * MankeyManCanvas.sin(24 * (this.m + this.g) % 360) >> 8) + 40);
                        return;
                    case 14:
                        if(this.m == 0) {
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                            this.a[0].b(this.b);
                            this.a[0].g(24576 - this.b.y * 10);
                        }

                        this.a[0].a(11, 8, new z(this.m / 3 % 2 * 20, 0, 20, 28));
                        return;
                    case 15:
                        var1 = this;
                        if(this.m == 0) {
                            this.h();
                            this.a[3].a(142, 7, new z(72, 0, 23, 8));
                            this.a[3].setFlagTrue(1073741824);
                            this.a[3].g(this.j);
                            this.a[3].setFlag2(true);
                        }

                        if(this.m >= 16) {
                            if(this.m == 20) {
                                this.d();
                            }

                            return;
                        }

                        var2 = MankeyManCanvas.sin(6 * this.m) * 3;

                        for(var3 = 0; var3 < var1.h; ++var3) {
                            var1.a[var3].setFlagTrue(1073741824);
                            var1.a[var3].setEnd(var2, var2);
                            var1.a[var3].f(var1.b.x + (var3 * 1792 * var2 >> 16) - ((var1.h - 1) * 896 * var2 >> 16), var1.b.y);
                        }

                        var2 = MankeyManCanvas.sin(6 * var1.m) << 1;
                        var1.a[3].setEnd(var2, var2);
                        var1.a[3].f(var1.b.x - 1, var1.b.y + 2);
                        break;
                    case 16:
                        if(this.m == 0) {
                            this.a[0].a(12, 8, n[21 + this.g]);
                            this.a[0].setFlag2(true);
                            this.a[0].b(this.b);
                            this.a[0].g(24576 - this.b.y * 10);
                        }

                        return;
                    case 17:
                        if(this.m == 0) {
                            this.a[0].a(22, 0, new z(42, 0, 13, 13));
                            this.a[0].g(this.j);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                        }

                        if(this.m >= 10) {
                            if(this.m == 10) {
                                this.d();
                            }

                            return;
                        }

                        this.a[0].f(this.b.x + (20 * MankeyManCanvas.a(10, this.m, 1) >> 8), this.b.y - (40 * MankeyManCanvas.sin(14 * this.m) >> 8));
                        break;
                    case 18:
                        if(this.m == 0) {
                            this.a[0].c(o[this.g]);
                            this.a[0].b(this.b);
                            this.a[0].g(0);
                            this.a[0].setFlag2(true);
                            this.a[0].setFlagFalse(1073741824);
                        }

                        if(this.m < 6) {
                            var2 = MankeyManCanvas.sin(18 * this.m);
                            this.a[0].setEnd(var2, var2);
                            this.a[0].f(this.b.x, this.b.y - (MankeyManCanvas.sin(18 * this.m) << 5 >> 8));
                        }

                        if(this.m >= 6) {
                            this.a[0].f(this.b.x, this.b.y - 32 - (MankeyManCanvas.sin(12 * ((this.m - 6) % 30)) << 3 >> 8));
                        }
                }
            }
        }

    }

    public final void a(int var1, int var2, int var3) {
        if(this.e >= 0) {
            this.e = var1;
            this.g = var2;
            this.i = var3;
            this.h(1);
        }

    }

    public final void d() {
        for(int var1 = 0; var1 < 4; ++var1) {
            this.a[var1].k();
            this.a[var1].f(0, 0);
            this.a[var1].setFlag2(false);
            this.a[var1].setEnd(256, 256);
            this.a[var1].changeTransform(0);
            this.a[var1].setFlagFalse(1073741824);
            this.a[var1].e();
        }

        this.h(0);
    }

    public final boolean e() {
        return this.getD() == 1;
    }

    public final void a(int var1, int var2) {
        this.b.x = var1;
        this.b.y = var2;
    }

    public final void a(int var1) {
        this.j = var1;

        for(var1 = 0; var1 < 4; ++var1) {
            this.a[var1].g(this.j);
        }

    }

    public final int f() {
        return this.e;
    }

    private void g() {
        if(this.m == 0) {
            this.a[0].a(14, 0, n[15 + this.g]);
            this.a[0].b(this.b);
            this.a[0].g(this.j);
            this.a[0].setFlag2(true);
            this.a[0].setFlagFalse(1073741824);
            this.k[0] = 8 + MankeyManCanvas.h() % 8;
            this.a[0].a(this.b.x + (MankeyManCanvas.cos(120) * 360 >> 8), this.b.y + (MankeyManCanvas.sin(120) * 360 >> 8), this.k[0], 0);
        }

        if(this.m == this.k[0]) {
            this.g(0);
        }

    }

    private void h() {
        this.h = 1;
        if(this.g >= 100) {
            this.h = 3;
        } else if(this.g >= 10) {
            this.h = 2;
        }

        int var1 = this.g;
        int var2 = 1;
        if(this.g >= 100) {
            var2 = 100;
        } else if(this.g >= 10) {
            var2 = 10;
        }

        for(int var3 = 0; var3 < this.h; var2 /= 10) {
            int var4 = var1 / var2;
            var1 -= var4 * var2;
            this.a[var3].a(142, 8, new z(var4 * 6, 0, 6, 8));
            this.a[var3].f(this.b.x + (var3 * 1792 >> 8) - ((this.h - 1) * 896 >> 8), this.b.y);
            this.a[var3].g(this.j);
            this.a[var3].setFlag2(true);
            ++var3;
        }

    }
}
