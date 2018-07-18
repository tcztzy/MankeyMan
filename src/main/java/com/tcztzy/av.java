//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class av extends DataStoreBase {
    private d[] a;
    private r[] b;
    private int c;
    private static Point[] e = new Point[]{new Point(110, 19), new Point(110, 37), new Point(110, 57), new Point(186, 19), new Point(186, 38), new Point(186, 57)};
    private static Point[] g = new Point[]{new Point(144, 18), new Point(144, 37), new Point(144, 56), new Point(220, 18), new Point(220, 37), new Point(220, 56)};
    private static z[] h = new z[]{new z(0, 0, 0, 0), new z(0, 0, 20, 20), new z(40, 0, 20, 20), new z(20, 40, 20, 20)};
    private static z[] i = new z[]{new z(0, 0, 26, 18), new z(26, 0, 26, 18), new z(52, 0, 26, 18), new z(26, 18, 26, 18), new z(52, 18, 26, 18), new z(0, 18, 26, 18), new z(78, 0, 26, 18), new z(78, 18, 26, 18), new z(26, 18, 26, 18)};
    private static z[] j = new z[]{new z(80, 0, 20, 20), new z(100, 0, 20, 20), new z(140, 0, 20, 20), new z(0, 0, 20, 20), new z(40, 0, 20, 20), new z(20, 40, 20, 20), new z(0, 40, 20, 20), new z(40, 40, 20, 20), new z(60, 40, 20, 20), new z(80, 40, 20, 20), new z(100, 40, 20, 20)};
    private static z[] k = new z[]{new z(0, 2, 10, 14), new z(10, 2, 8, 14), new z(18, 2, 12, 14), new z(30, 1, 12, 15), new z(42, 2, 12, 14), new z(54, 2, 12, 14), new z(66, 3, 12, 13), new z(78, 2, 13, 14), new z(91, 2, 11, 14), new z(102, 2, 12, 14)};
    private static z[] l = new z[]{new z(0, 3, 24, 24), new z(24, 0, 24, 27), new z(48, 7, 33, 20), new z(81, 2, 21, 25)};
    private static z[] m = new z[]{new z(80, 0, 20, 20), new z(40, 20, 20, 20), new z(20, 20, 20, 20), new z(0, 20, 20, 20), new z(140, 20, 20, 20), new z(80, 20, 20, 20), new z(60, 20, 20, 20), new z(100, 20, 20, 20)};
    private static int[] n = new int[]{0, 46, 76, 77, 78, 79, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 80, 81, 82, 83, 84, 85, 86};
    private static int[] o = new int[]{206, 205, 205, 204, 204, 203, 203, 202};
    private static int[] p = new int[6];

    av() {
    }

    public final boolean a() {
        this.i(768);
        this.c = 0;
        this.a = new d[87];
        MankeyManCanvas.a(this.a);

        int var1;
        for(var1 = 0; var1 < 87; ++var1) {
            this.a[var1].setFlagFalse(1073741824);
        }

        this.b = new r[6];

        for(var1 = 0; var1 < 6; ++var1) {
            this.b[var1] = (r) MankeyManCanvas.a(new r(1));
            this.b[var1].setFlagFalse(1073741824);
            this.b[var1].f(e[var1].x, e[var1].y - 120);
        }

        this.b(3);
        this.d(3);
        this.m(3);
        this.o(3);
        this.q(3);
        this.c(3, 0);
        return true;
    }

    public final void b() {
        for(int var1 = 0; var1 < 6; ++var1) {
            this.b[var1].i();
        }

        this.b = null;
        MankeyManCanvas.b(this.a);
        this.a = null;
    }

    public final void c() {
        int d = this.getC();
        if((this.c & 4) != 0 && MankeyManRecordStore.D != null && !MankeyManRecordStore.D.p()) {
            this.a[3].setFlag2(d / 2 % 2 == 0);
        }

    }

    public final void d() {
        this.a(5);
    }

    public final void a(int var1) {
        if((this.c & 2) != 0) {
            var1 = 0;
        }

        this.c |= 2;
        av var2 = this;
        this.a[0].a(199, 1);
        int var3;
        int var4;
        if(MankeyManRecordStore.B != null) {
            p[0] = MankeyManRecordStore.B.o();
            p[1] = MankeyManRecordStore.B.p();
            p[2] = MankeyManRecordStore.B.q();
            p[3] = MankeyManRecordStore.B.r();
            p[4] = MankeyManRecordStore.B.s();
            p[5] = MankeyManRecordStore.B.c[36];
            var3 = MankeyManRecordStore.B.a[0].getK();
            this.a[46].c(var3);
            this.a[46].e();
            String var8;
            var4 = (var8 = MankeyManRecordStore.B.h()).length();

            int var5;
            int var6;
            for(var5 = 0; var5 < var4; ++var5) {
                var6 = DataStore.charAt(var8.charAt(var5));
                var2.a[var5 + 76].a(164, 1, new z(var6 % 20 * 12, var6 / 20 * 13, 12, 13));
            }

            for(var5 = var4; var5 < 4; ++var5) {
                var2.a[var5 + 76].a(-1);
            }

            var5 = MankeyManRecordStore.B.wMethod();
            var6 = 1000;

            for(var3 = 0; var3 < 4; var6 /= 10) {
                var4 = var5 / var6;
                var5 -= var4 * var6;
                var2.a[var3 + 82].a(143, 1, new z(var4 << 3, 0, 8, 10));
                ++var3;
            }

            var2.a[86].a(143, 1, new z(80, 0, 14, 10));
            var3 = MankeyManRecordStore.B.c[18];
            var2.a[80].a(3, 3, new z(var3 / 10 * 6, 0, 6, 8));
            var2.a[81].a(3, 3, new z(var3 % 10 * 6, 0, 6, 8));

            for(var4 = 0; var4 < 6; ++var4) {
                var2.b[var4 + 0].d(p[var4]);
                var2.b[var4 + 0].e(99);
                var3 = p[var4] / 10;
                var5 = p[var4] % 10;
                var2.a[49 + (var4 << 1)].a(3, 1, new z(var3 * 6, 0, 6, 8));
                var2.a[49 + (var4 << 1) + 1].a(3, 1, new z(var5 * 6, 0, 6, 8));
            }
        }

        if(MankeyManRecordStore.B != null) {
            this.a[0].f(0, -120);
            this.a[0].a(0, 0, var1, 2);
            this.a[0].g(12288);
            this.a[0].setFlag2(true);
            this.a[46].f(46, -69);
            this.a[46].a(46, 51, var1, 2);
            this.a[46].g(12285);
            int var7;
            var3 = (var7 = MankeyManRecordStore.B.h().length()) * 10;

            for(var4 = 0; var4 < var7; ++var4) {
                this.a[var4 + 76].f(43 - var3 / 2 + var4 * 13, -68);
                this.a[var4 + 76].a(43 - var3 / 2 + var4 * 13, 52, var1, 2);
                this.a[var4 + 76].g(12286);
                this.a[77].setFlag2(true);
            }

            for(var4 = 0; var4 < 4; ++var4) {
                this.a[var4 + 82].f(28, -115);
                this.a[var4 + 82].a(28 + var4 * 7, 5, var1, 2);
                this.a[var4 + 82].g(12285);
                this.a[var4 + 82].setFlag2(true);
            }

            this.a[86].f(56, -115);
            this.a[86].a(56, 5, var1, 2);
            this.a[86].g(12285);
            this.a[86].setFlag2(true);
            this.a[80].setFlag2(false);
            this.a[81].setFlag2(false);
            var7 = (var4 = MankeyManRecordStore.B.c[18]) >= 10?2:1;
            var3 = var4 >= 10?12:6;

            for(var4 = 0; var4 < var7; ++var4) {
                this.a[81 - var4].f(48 + var3 / 2 - var4 * 7, -53);
                this.a[81 - var4].a(46 + var3 / 2 - var4 * 7, 67, var1, 2);
                this.a[81 - var4].g(12287);
                this.a[81 - var4].setFlag2(true);
            }

            for(var4 = 0; var4 < 6; ++var4) {
                this.b[var4 + 0].a(e[var4].x, e[var4].y, var1, 2);
                this.b[var4 + 0].g(12287);
                this.b[var4 + 0].setFlag2(true);
                this.a[49 + (var4 << 1)].f(g[var4].x, g[var4].y - 120);
                this.a[49 + (var4 << 1)].a(g[var4].x, g[var4].y, var1, 2);
                this.a[49 + (var4 << 1)].g(12286);
                this.a[49 + (var4 << 1)].setFlag2(true);
                this.a[49 + (var4 << 1) + 1].f(g[var4].x + 7, g[var4].y - 120);
                this.a[49 + (var4 << 1) + 1].a(g[var4].x + 7, g[var4].y, var1, 2);
                this.a[49 + (var4 << 1) + 1].g(12286);
                this.a[49 + (var4 << 1) + 1].setFlag2(true);
            }
        }

    }

    public final void e() {
        this.b(3);
    }

    public final void b(int var1) {
        if((this.c & 2) == 0) {
            var1 = 0;
        }

        this.c &= -3;

        int var2;
        Point var3;
        for(var2 = 0; var2 < 25; ++var2) {
            var3 = this.a[n[var2]].f();
            this.a[n[var2]].a(var3.x, var3.y - 120, var1, 1);
        }

        for(var2 = 0; var2 < 6; ++var2) {
            var3 = this.b[var2].f();
            this.b[var2].a(var3.x, var3.y - 120, var1, 1);
            this.b[var2].setFlag2(false);
        }

    }

    public final void c(int var1) {
        this.a(var1, 0);
    }

    public final void a(int var1, int var2) {
        if((this.c & 4) != 0) {
            var1 = 0;
        }

        this.c |= 4;
        b var4;
        int var5 = (var4 = MankeyManRecordStore.C.a(MankeyManRecordStore.f)) != null?var4.c[7]:0;
        this.a[1].a(2, 1, h[var5]);
        this.a[2].a(2, 1, new z(140, 40, 20, 20));
        this.a[3].setStart(1, 11);
        this.a[3].c(0, 11);
        this.a[3].setColor(16711680);
        int var6;
        if((var6 = var4 != null?var4.c[9]:0) < 0) {
            this.a[4].a(147, 1, new z(81, 0, 7, 10));
        } else {
            this.a[4].a(-1);
        }

        this.a[5].a(147, 1, new z(Math.abs(var6) / 10 << 3, 0, 8, 10));
        this.a[6].a(147, 1, new z(Math.abs(var6) % 10 << 3, 0, 8, 10));
        var2 = (new int[]{64, 4})[var2];
        this.a[1].f(196, var2 - 120);
        this.a[1].a(196, var2, var1, 2);
        this.a[1].g(17664);
        this.a[1].setFlag2(true);
        this.a[2].f(216, var2 - 120);
        this.a[2].a(216, var2, var1, 2);
        this.a[2].g(17664);
        this.a[2].setFlag2(true);
        this.a[3].f(225, var2 + 14 - 120);
        this.a[3].a(225, var2 + 14, var1, 2);
        this.a[3].g(17663);
        this.a[3].setFlag2(true);
        this.a[4].f(210, var2 + 22 - 120);
        this.a[4].a(210, var2 + 22, var1, 2);
        this.a[4].g(17663);
        this.a[4].setFlag2(true);
        this.a[5].f(218, var2 + 22 - 120);
        this.a[5].a(218, var2 + 22, var1, 2);
        this.a[5].g(17663);
        this.a[5].setFlag2(true);
        this.a[6].f(226, var2 + 22 - 120);
        this.a[6].a(226, var2 + 22, var1, 2);
        this.a[6].g(17663);
        this.a[6].setFlag2(true);
    }

    public final void d(int var1) {
        if((this.c & 4) == 0) {
            var1 = 0;
        }

        this.c &= -5;
        this.a[1].a(196, -56, var1, 1);
        this.a[2].a(216, -56, var1, 1);
        this.a[3].a(225, -42, var1, 1);
        this.a[4].a(210, -34, var1, 1);
        this.a[5].a(218, -34, var1, 1);
        this.a[6].a(226, -34, var1, 1);
    }

    public final void e(int var1) {
        if((this.c & 8) != 0) {
            var1 = 0;
        }

        this.c |= 8;
        av var2 = this;
        this.a[61].a(2, 1, new z(120, 0, 20, 20));
        int var3 = MankeyManRecordStore.r;
        int var4;
        int var5;
        int var6;
        if(MankeyManRecordStore.r >= 0) {
            var4 = 100;

            for(var5 = 0; var5 < 3; var4 /= 10) {
                var6 = var3 / var4;
                var3 -= var6 * var4;
                var2.a[var5 + 62].a(147, 1, new z(var6 << 3, 0, 8, 10));
                ++var5;
            }
        }

        var2.a[65].a(2, 1, new z(20, 0, 20, 20));
        var3 = MankeyManRecordStore.s;
        if(MankeyManRecordStore.s >= 0) {
            var4 = 100;

            for(var5 = 0; var5 < 3; var4 /= 10) {
                var6 = var3 / var4;
                var3 -= var6 * var4;
                var2.a[var5 + 66].a(147, 1, new z(var6 << 3, 0, 8, 10));
                ++var5;
            }
        }

        this.a[61].f(30, -26);
        this.a[61].a(30, 44, var1, 2);
        this.a[61].g(17664);
        this.a[61].setFlag2(true);
        this.a[62].f(52, -20);
        this.a[62].a(52, 50, var1, 2);
        this.a[62].g(17664);
        this.a[62].setFlag2(true);
        this.a[63].f(61, -20);
        this.a[63].a(61, 50, var1, 2);
        this.a[63].g(17664);
        this.a[63].setFlag2(true);
        this.a[64].f(70, -20);
        this.a[64].a(70, 50, var1, 2);
        this.a[64].g(17664);
        this.a[64].setFlag2(true);
        this.a[65].f(91, -26);
        this.a[65].a(91, 44, var1, 2);
        this.a[65].g(17664);
        this.a[65].setFlag2(true);
        this.a[66].f(112, -20);
        this.a[66].a(112, 50, var1, 2);
        this.a[66].g(17664);
        this.a[66].setFlag2(true);
        this.a[67].f(121, -20);
        this.a[67].a(121, 50, var1, 2);
        this.a[67].g(17664);
        this.a[67].setFlag2(true);
        this.a[68].f(130, -20);
        this.a[68].a(130, 50, var1, 2);
        this.a[68].g(17664);
        this.a[68].setFlag2(true);
    }

    public final void m(int var1) {
        if((this.c & 8) == 0) {
            var1 = 0;
        }

        this.c &= -9;
        this.a[61].a(30, -26, var1, 1);
        this.a[62].a(52, -20, var1, 1);
        this.a[63].a(61, -20, var1, 1);
        this.a[64].a(70, -20, var1, 1);
        this.a[65].a(90, -26, var1, 1);
        this.a[66].a(112, -20, var1, 1);
        this.a[67].a(121, -20, var1, 1);
        this.a[68].a(130, -20, var1, 1);
    }

    public final void n(int var1) {
        if((this.c & 16) != 0) {
            var1 = 0;
        }

        this.c |= 16;
        av var2 = this;

        int var3;
        int var4;
        for(var3 = 0; var3 < 9; ++var3) {
            var4 = var3 % 3;
            int var5 = var3 / 3;
            int var6 = 7;
            var4 += MankeyManRecordStore.f.x - 1;
            var5 += MankeyManRecordStore.f.y - 1;
            if(var4 < 0) {
                var4 = 8;
            }

            if(var4 >= 9) {
                var4 = 0;
            }

            if(var5 < 0) {
                var5 = 9;
            }

            if(var5 >= 10) {
                var5 = 0;
            }

            b var9;
            if((var9 = MankeyManRecordStore.C.a(var4, var5)) != null) {
                var6 = var9.a_();
            }

            var2.a[var3 + 27].a(7, 1, i[var6]);
            byte var10 = -1;
            if(var9 != null) {
                var6 = var9.c[7];
                int var7 = var9.c[10];
                if(var6 == 1) {
                    var10 = 3;
                }

                if(var6 == 2) {
                    var10 = 4;
                }

                if(var6 == 3) {
                    var10 = 5;
                }

                if(var7 == 2) {
                    var10 = 6;
                }

                if(var7 == 1) {
                    var10 = 7;
                }

                if(var7 == 3) {
                    var10 = 8;
                }

                if(var7 == 5) {
                    var10 = 9;
                }

                if(var7 == 4) {
                    var10 = 10;
                }

                if(var7 == 7 || var7 == 6) {
                    var10 = 2;
                }

                if(var9.f() > 0) {
                    var10 = 1;
                }

                if(var9.c(0) > 0) {
                    var10 = 0;
                }
            }

            if(var10 != -1) {
                var2.a[var3 + 37].a(2, 1, j[var10]);
                var2.a[var3 + 37].setFlag2(true);
            } else {
                var2.a[var3 + 37].a(-1);
                var2.a[var3 + 37].setFlag2(false);
            }
        }

        for(int var8 = 0; var8 < 9; ++var8) {
            var3 = var8 % 3;
            var4 = var8 / 3;
            this.a[var8 + 27].f(154 + var3 * 27, 5 + var4 * 19 - 90);
            this.a[var8 + 27].a(154 + var3 * 27, 5 + var4 * 19, var1, 2);
            this.a[var8 + 27].g(17664);
            this.a[var8 + 27].setFlag2(true);
            this.a[var8 + 37].f(157 + var3 * 27, 4 + var4 * 19 - 90);
            this.a[var8 + 37].a(157 + var3 * 27, 4 + var4 * 19, var1, 2);
            this.a[var8 + 37].g(17663);
            this.a[var8 + 37].setFlag2(true);
        }

        this.a[36].setStart(82, 58);
        this.a[36].setColor(0);
        this.a[36].f(153, -86);
        this.a[36].a(153, 4, var1, 2);
        this.a[36].g(17665);
        this.a[36].setFlag2(true);
    }

    public final void o(int var1) {
        if((this.c & 16) == 0) {
            var1 = 0;
        }

        this.c &= -17;

        for(int var2 = 0; var2 < 9; ++var2) {
            int var3 = var2 % 3;
            int var4 = var2 / 3;
            this.a[var2 + 27].a(154 + var3 * 27, 5 + var4 * 19 - 90, var1, 1);
            this.a[var2 + 37].a(157 + var3 * 27, 4 + var4 * 19 - 90, var1, 1);
        }

        this.a[36].a(153, -86, var1, 1);
    }

    public final void p(int var1) {
        if((this.c & 32) != 0) {
            var1 = 0;
        }

        this.c |= 32;
        av var2 = this;
        this.a[69].a(o[MankeyManRecordStore.d]);
        if(MankeyManRecordStore.d != 2 && MankeyManRecordStore.d != 4 && MankeyManRecordStore.d != 6) {
            this.a[70].a(-1);
        } else {
            this.a[70].a(16);
        }

        int var3 = MankeyManRecordStore.year;
        int var4 = 100;

        for(int var5 = 0; var5 < 3; var4 /= 10) {
            int var6 = var3 / var4;
            var3 -= var6 * var4;
            var2.a[var5 + 72].a(17, 8, k[var6]);
            ++var5;
        }

        var2.a[75].a(17, 2, new z(114, 0, 27, 16));
        var2.a[71].a(18, 8, l[MankeyManRecordStore.q]);
        this.a[69].f(4, -56);
        this.a[69].a(4, 4, var1, 2);
        this.a[69].g(17408);
        this.a[69].setFlag2(true);
        this.a[70].f(74, -56);
        this.a[70].a(74, 4, var1, 2);
        this.a[70].g(17408);
        this.a[70].setFlag2(true);

        for(int var7 = 0; var7 < 3; ++var7) {
            this.a[var7 + 72].f(60 + var7 * 10, -20);
            this.a[var7 + 72].a(60 + var7 * 10 + 10, 40, var1, 2);
            this.a[var7 + 72].g(17408);
            this.a[var7 + 72].setFlag2(true);
        }

        this.a[75].f(86, -20);
        this.a[75].a(96, 41, var1, 2);
        this.a[75].g(17408);
        this.a[75].setFlag2(true);
        this.a[71].f(128, -18);
        this.a[71].a(128, 42, var1, 2);
        this.a[71].g(17408);
        this.a[71].setFlag2(true);
    }

    public final void q(int var1) {
        if((this.c & 32) == 0) {
            var1 = 0;
        }

        this.c &= -33;
        this.a[69].a(4, -56, var1, 1);
        this.a[70].a(74, -56, var1, 1);

        for(int var2 = 0; var2 < 3; ++var2) {
            this.a[var2 + 72].a(60 + var2 * 10, -20, var1, 1);
        }

        this.a[75].a(86, -19, var1, 1);
        this.a[71].a(128, -18, var1, 1);
    }

    public final void r(int var1) {
        this.b(var1, 0);
    }

    public final void b(int var1, int var2) {
        if((this.c & 64) != 0) {
            var1 = 0;
        }

        this.c |= 64;
        av var3 = this;

        for(int var4 = 0; var4 < 5; ++var4) {
            var3.a[7 + var4 * 3].a(-1);
            var3.a[7 + var4 * 3 + 1].a(-1);
            var3.a[7 + var4 * 3 + 2].a(-1);
        }

        int[] var9 = new int[]{4, 3, 2, 1, 6, 5, 7};
        b var5;
        int var6;
        int var7;
        switch((var5 = MankeyManRecordStore.C.a(MankeyManRecordStore.f)).a_()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
                for(var6 = 0; var6 < 4; ++var6) {
                    var7 = var9[var6];
                    var3.a[7 + (var6 << 2)].a(2, 1, m[var7]);
                    var7 = var5.c(var7);
                    var3.a[7 + (var6 << 2) + 1].a(147, 1, new z(var7 / 100 << 3, 0, 8, 10));
                    var3.a[7 + (var6 << 2) + 2].a(147, 1, new z(var7 / 10 % 10 << 3, 0, 8, 10));
                    var3.a[7 + (var6 << 2) + 3].a(147, 1, new z(var7 % 10 << 3, 0, 8, 10));
                }

                var3.a[23].a(2, 1, new z(0, 60, 20, 20));
                break;
            case 5:
            case 6:
            case 7:
                for(var6 = 0; var6 < 3; ++var6) {
                    var7 = var9[var6 + 4];
                    var3.a[7 + (var6 << 2)].a(2, 1, m[var7]);
                    var7 = var5.c(var7);
                    var3.a[7 + (var6 << 2) + 1].a(147, 1, new z(var7 / 100 << 3, 0, 8, 10));
                    var3.a[7 + (var6 << 2) + 2].a(147, 1, new z(var7 / 10 % 10 << 3, 0, 8, 10));
                    var3.a[7 + (var6 << 2) + 3].a(147, 1, new z(var7 % 10 << 3, 0, 8, 10));
                }

                for(var6 = 0; var6 < 4; ++var6) {
                    var3.a[var6 + 19].a(-1);
                }

                var3.a[23].a(2, 1, new z(80, 60, 20, 20));
        }

        var6 = var5.c[18];
        var3.a[24].a(147, 1, new z(var6 / 100 << 3, 0, 8, 10));
        var3.a[25].a(147, 1, new z(var6 / 10 % 10 << 3, 0, 8, 10));
        var3.a[26].a(147, 1, new z(var6 % 10 << 3, 0, 8, 10));
        var2 = (new int[]{266, 236})[var2];

        for(int var8 = 0; var8 < 5; ++var8) {
            this.a[7 + (var8 << 2)].f(4 + var8 * 48 - 4, var2 + 90);
            this.a[7 + (var8 << 2)].a(4 + var8 * 48 - 4, var2, var1, 2);
            this.a[7 + (var8 << 2)].g(17664);
            this.a[7 + (var8 << 2)].setFlag2(true);
            this.a[7 + (var8 << 2) + 1].f(4 + var8 * 48 + 14, var2 + 98);
            this.a[7 + (var8 << 2) + 1].a(4 + var8 * 48 + 14, var2 + 8, var1, 2);
            this.a[7 + (var8 << 2) + 1].g(17664);
            this.a[7 + (var8 << 2) + 1].setFlag2(false);
            this.a[7 + (var8 << 2) + 2].f(4 + var8 * 48 + 22, var2 + 98);
            this.a[7 + (var8 << 2) + 2].a(4 + var8 * 48 + 22, var2 + 8, var1, 2);
            this.a[7 + (var8 << 2) + 2].g(17664);
            this.a[7 + (var8 << 2) + 2].setFlag2(true);
            this.a[7 + (var8 << 2) + 3].f(4 + var8 * 48 + 30, var2 + 98);
            this.a[7 + (var8 << 2) + 3].a(4 + var8 * 48 + 30, var2 + 8, var1, 2);
            this.a[7 + (var8 << 2) + 3].g(17664);
            this.a[7 + (var8 << 2) + 3].setFlag2(true);
        }

        this.a[24].setFlag2(true);
    }

    public final void s(int var1) {
        this.c(var1, 0);
    }

    public final void c(int var1, int var2) {
        if((this.c & 64) == 0) {
            var1 = 0;
        }

        this.c &= -65;
        var2 = (new int[]{266, 236})[var2];

        for(int var3 = 0; var3 < 5; ++var3) {
            this.a[7 + (var3 << 2)].a(4 + var3 * 48 - 4, var2 + 90, var1, 1);
            this.a[7 + (var3 << 2) + 1].a(4 + var3 * 48 + 14, var2 + 98, var1, 1);
            this.a[7 + (var3 << 2) + 2].a(4 + var3 * 48 + 22, var2 + 98, var1, 1);
            this.a[7 + (var3 << 2) + 3].a(4 + var3 * 48 + 30, var2 + 98, var1, 1);
        }

    }
}
