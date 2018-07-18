//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class ae extends aj {
    public d[] a;
    private boolean d;
    private Point f;
    private Point g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private static int[] n = new int[]{0, 63, 1, 64, 2, 65, 0, 63, 1, 64, 2, 65, 0, 63, 1, 64, 2, 65, 0, 63, 1, 64, 2, 65, 0, 63, 1, 64, 2, 65, 0, 63, 1, 64, 2, 65, 3, 66, 4, 67, 5, 68, 3, 66, 4, 67, 5, 68, 6, 69, 7, 70, 8, 71, 3, 66, 4, 67, 5, 68, 3, 66, 4, 67, 5, 68, 3, 66, 4, 67, 5, 68, 9, 72, 10, 73, 11, 74, 12, 75, 13, 76, 14, 77, 15, 78, 16, 79, 17, 80, 18, 81, 19, 82, 20, 83, 21, 84, 22, 85, 23, 86, 9, 87, 10, 88, 11, 89, 24, 90, 25, 91, 26, 92, 27, 93, 28, 94, 29, 95, 30, 96, 31, 97, 32, 98, 33, 99, 34, 100, 35, 101, 36, 102, 37, 103, 38, 104, 24, 105, 25, 106, 26, 107, 39, 108, 40, 109, 41, 110, 42, 111, 43, 112, 44, 113, 45, 114, 46, 115, 47, 116, 48, 117, 49, 118, 50, 119, 51, 120, 52, 121, 53, 122, 39, 123, 40, 124, 41, 125, 54, 126, 55, 127, 56, 128, 54, 126, 55, 127, 56, 128, 57, 129, 58, 130, 59, 131, 54, 126, 55, 127, 56, 128, 60, 132, 61, 133, 62, 134, 54, 126, 55, 127, 56, 128};
    private static int[] o = new int[]{1, 2, 3, 0, 4};
    private static int[] p = new int[]{0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 1, 0, 1, 0, 0};
    private static int[] q = new int[]{12, 16, 20, 22, 22, 21};
    private static z[] r = new z[]{new z(0, 0, 0, 0), new z(0, 0, 8, 7), new z(8, 0, 12, 11), new z(20, 0, 22, 20), new z(0, 0, 0, 0), new z(55, 0, 9, 13), new z(64, 0, 12, 16), new z(76, 0, 17, 22)};

    ae() {
        super.b = 59;
        super.c = new int[59];
        super.c[0] = 6;
    }

    public final void a() {
        this.x(4160);
        this.k = true;
        this.d = true;
        this.f = new Point(0, 0);
        this.g = new Point(0, 0);
        this.a = new d[8];

        for(int var1 = 0; var1 < 8; ++var1) {
            this.a[var1] = MankeyManCanvas.a(new d());
            this.a[var1].setFlagTrue(1073741824);
        }

        this.c(256, 256);
        super.c[24] = 3;
        super.c[25] = 3;
    }

    public final void c() {
        for(int var1 = 0; var1 < 8; ++var1) {
            this.a[var1].i();
        }

        this.a = null;
    }

    public final void c_() {
        if(this.t() != null) {
            if(this.t().t() == this) {
                this.t().a((ae)null);
            }

            this.a((ae)null);
        }

        aiClass.x.a(this.getName(false));
        super.c_();
    }

    public final void b_() {
        int var2;
        int var3;
        if(!this.k) {
            if(this.l && this.i < 4) {
                var2 = -1;
                var3 = this.n();
                if(this.i == 0) {
                    var2 = p[var3 * 3];
                } else if(this.i == 1) {
                    var2 = p[var3 * 3 + 1];
                } else if(this.i == 3) {
                    var2 = p[var3 * 3 + 2];
                }

                if(var2 != -1) {
                    aiClass.x.a(0, var2, this.k(), this.m());
                }
            }

            if(++this.i < this.h) {
                var2 = MankeyManCanvas.a(this.h, this.i, this.j);
                this.a((this.f.x << 8) + (this.g.x - this.f.x) * var2 >> 8, (this.f.y << 8) + (this.g.y - this.f.y) * var2 >> 8);
            } else {
                this.a(this.g.x, this.g.y);
                this.k = true;
            }
        }

        int var4;
        int var5;
        int var6;
        if(super.c[39] > 0) {
            var2 = super.c[10];
            var3 = super.c[11];
            var4 = super.c[8];
            var5 = super.c[9];
            var6 = super.c[13];
            this.a[2].f(var2 + var4, var3 + var5 - (var6 * 36 >> 8) + (3 * MankeyManCanvas.sin(45 * (this.m % 8)) >> 8));
            this.a[2].g(this.m() - 2);
        }

        int var7;
        if(super.c[40] > 0) {
            var2 = super.c[10];
            var3 = super.c[11];
            var4 = super.c[8];
            var5 = super.c[9];
            var6 = super.c[12];
            var7 = super.c[13];
            this.a[3].f(var2 + var4 - (var6 * 8 >> 8) - (3 * MankeyManCanvas.sin(9 * (this.m % 10)) >> 8), var3 + var5 - (var7 * 10 >> 8));
            this.a[3].g(this.m() - 3);
        }

        if(super.c[41] > 0) {
            var2 = super.c[10];
            var3 = super.c[11];
            var4 = super.c[8];
            var5 = super.c[9];
            var6 = super.c[12];
            var7 = super.c[13];
            this.a[4].f(var2 + var4 + (var6 * 8 >> 8), var3 + var5 - (var7 * 26 >> 8));
            this.a[4].g(this.m() - 4);
            this.a[5].f(var2 + var4 - (var6 * 8 >> 8), var3 + var5 - (var7 * 16 >> 8));
            this.a[5].g(this.m() - 4);
            this.a[6].f(var2 + var4 + (var6 * 8 >> 8), var3 + var5 - (var7 * 6 >> 8));
            this.a[6].g(this.m() - 4);
        }

        if(super.c[23] == 1) {
            var2 = super.c[10];
            var3 = super.c[11];
            var4 = super.c[8];
            var5 = super.c[9];
            var6 = super.c[13];
            this.a[1].f(var2 + var4, var3 + var5 - (q[this.n()] * var6 >> 8));
            this.a[1].g(this.m() - 1);
        }

        if((super.c[38] & 32) != 0) {
            var2 = super.c[10];
            var3 = super.c[11];
            var4 = super.c[8];
            var5 = super.c[9];
            var6 = super.c[12];
            var7 = super.c[13];
            this.a[4].f(var2 + (var4 * var6 >> 8), var3 + ((var5 - 34) * var7 >> 8));
            this.a[4].g(this.m() - 1);
            this.a[5].f(var2 + (var4 * var6 >> 8), var3 + (var5 * var7 >> 8));
            this.a[5].g(this.m() + 1);
        }

        if(super.c[22] > 0) {
            var2 = super.c[10];
            var3 = super.c[11];
            var4 = super.c[8];
            var5 = super.c[9];
            var6 = super.c[12];
            var7 = super.c[13];
            var2 = var2 + var4 + (var6 >> 8);
            var4 = 20 + (3 * MankeyManCanvas.sin(36 * this.m % 360) >> 8);
            var3 = var3 + var5 - (var4 * var7 >> 8);
            this.a[7].f(var2, var3);
            this.a[7].g(this.m() + 1);
        }

        ++this.m;
    }

    public final void f() {
        this.d = true;
        this.J();
    }

    public final void g() {
        this.d = false;
        this.J();
    }

    public final void a(int var1, int var2, int var3) {
        this.a(var1, var2, var3, null);
    }

    public final void a(int var1, int var2, int var3, ae var4) {
        if(var4 != null) {
            var3 = var4.c[51];
        }

        String var5 = aiClass.x.b(var3);

        int var6;
        for(var6 = 0; var6 < var5.length(); ++var6) {
            super.c[var6 + 4] = var5.charAt(var6);
        }

        for(var6 = var5.length(); var6 < 4; ++var6) {
            super.c[var6 + 4] = 0;
        }

        super.c[17] = var3;
        super.c[18] = var2;
        super.c[16] = MankeyManCanvas.h() % 3;
        if(var4 != null) {
            super.c[26] = var4.c[1];
            super.c[27] = var4.c[56];
        } else {
            super.c[26] = -1;
            super.c[27] = -1;
        }

        var6 = 0;
        if(var4 != null) {
            var6 = var4.c[49];
        } else {
            switch(aiClass.d) {
                case 0:
                case 1:
                    var6 = 400 + MankeyManCanvas.h() % 30;
                    break;
                case 2:
                    var6 = 600 + MankeyManCanvas.h() % 200;
                    break;
                case 3:
                    var6 = 800 + MankeyManCanvas.h() % 200;
                    break;
                case 4:
                    var6 = 1000 + MankeyManCanvas.h() % 200;
                    break;
                case 5:
                    var6 = 1200 + MankeyManCanvas.h() % 100;
                    break;
                case 6:
                    var6 = 1300 + MankeyManCanvas.h() % 100;
                    break;
                case 7:
                    var6 = 1450;
            }
        }

        super.c[30] = var6;
        if(var4 != null) {
            var2 = var4.c[50];
        } else {
            var2 = 24 + MankeyManCanvas.h() % 5;
        }

        this.b(var2);
        var2 = 0;
        if(var4 != null) {
            var2 = var4.c[52];
        } else {
            switch(var3) {
                case 0:
                    var2 = 50 + MankeyManCanvas.h() % 50;
                    break;
                case 1:
                    var2 = 40 + MankeyManCanvas.h() % 30;
            }
        }

        this.y(var2);
        int var7 = 0;
        if(var4 != null) {
            var7 = var4.c[53];
        } else {
            switch(var3) {
                case 0:
                    if(var2 >= 70) {
                        var7 = 30 + MankeyManCanvas.h() % 20;
                    } else {
                        var7 = 50 + MankeyManCanvas.h() % 50;
                    }
                    break;
                case 1:
                    if(var2 >= 50) {
                        var7 = 50 + MankeyManCanvas.h() % 20;
                    } else {
                        var7 = 70 + MankeyManCanvas.h() % 30;
                    }
            }
        }

        this.z(var7);
        var2 = 0;
        if(var4 != null) {
            var2 = var4.c[54];
        } else {
            switch(var3) {
                case 0:
                    var2 = 40 + MankeyManCanvas.h() % 50;
                    break;
                case 1:
                    var2 = 30 + MankeyManCanvas.h() % 70;
            }
        }

        this.A(var2);
        if(var4 != null) {
            var2 = var4.c[55];
        } else {
            var2 = 4 + MankeyManCanvas.h() % 7;
        }

        this.i(var2);
        if(var4 != null) {
            super.c[38] = 12 | var4.c[57];
        } else {
            super.c[38] = 12;
        }

        super.c[29] = -1;
        super.c[21] = var1;
        super.c[28] = -1;
        super.c[22] = 0;
        super.c[34] = 0;
        super.c[35] = 0;
        super.c[14] = 10;
        super.c[15] = -1;
        this.l(3);
        this.u();
    }

    final String getName(boolean var1) {
        String name = "";

        for(int var2 = 0; var2 < 4; ++var2) {
            if(super.c[var2 + 4] != 0) {
                name = name + (char)super.c[var2 + 4];
            }
        }

        if(var1) {
            name = name + DataStore.getGender(super.c[17]);
        }

        return name;
    }

    public final String h() {
        return this.getName(false);
    }

    public final void a(int var1, int var2) {
        super.c[8] = var1;
        super.c[9] = var2;
        this.a[0].f(super.c[10] + var1, super.c[11] + var2);
        this.a[0].g(24576 - (super.c[11] + var2) * 10);
    }

    public final void a(Point var1) {
        this.a(var1.x, var1.y);
    }

    public final Point i() {
        return new Point(super.c[8], super.c[9]);
    }

    public final void b(int var1, int var2) {
        super.c[10] = var1;
        super.c[11] = var2;
        this.a(super.c[8], super.c[9]);
    }

    public final void b(Point var1) {
        this.b(var1.x, var1.y);
    }

    public final Point j() {
        return new Point(super.c[10], super.c[11]);
    }

    public final Point k() {
        return new Point(super.c[10] + super.c[8], super.c[11] + super.c[9]);
    }

    public final void a(int var1, int var2, int var3, int var4) {
        this.a(var1, var2, var3, var4, false);
    }

    public final void a(int var1, int var2, int var3, int var4, boolean var5) {
        if(var3 == 0) {
            this.a(var1, var2);
        } else {
            this.f.x = super.c[8];
            this.f.y = super.c[9];
            this.g.x = var1;
            this.g.y = var2;
            this.h = var3;
            this.i = 0;
            this.j = var4;
            this.k = false;
            this.l = false;
        }
    }

    public final void l() {
        this.k = true;
        this.a(this.g);
    }

    public final void c(int var1, int var2) {
        for(int var3 = 0; var3 < 8; ++var3) {
            this.a[var3].setEnd(var1, var2);
        }

        super.c[12] = 256;
        super.c[13] = 256;
        this.a(this.i());
    }

    public final int m() {
        return this.a[0].j();
    }

    public final void a(int var1) {
        super.c[15] = var1;
        this.J();
    }

    public final void b(int var1) {
        if(var1 > 39) {
            var1 = 39;
        }

        super.c[19] = var1;
    }

    public final int n() {
        int var1 = super.c[18];
        switch(super.c[17]) {
            case 0:
                if(var1 < 3) {
                    return 0;
                }

                if(var1 < 5) {
                    return 1;
                }

                if(var1 < 16) {
                    return 2;
                }

                if(var1 < 22) {
                    return 3;
                }

                if(var1 < 28) {
                    return 4;
                }
                break;
            case 1:
                if(var1 < 3) {
                    return 0;
                }

                if(var1 < 5) {
                    return 1;
                }

                if(var1 < 14) {
                    return 2;
                }

                if(var1 < 25) {
                    return 3;
                }

                if(var1 < 30) {
                    return 4;
                }
        }

        return 5;
    }

    private void y(int var1) {
        switch(super.c[17]) {
            case 0:
                if(var1 > 99) {
                    var1 = 99;
                }
                break;
            case 1:
                if(var1 > 69) {
                    var1 = 69;
                }
        }

        if(var1 < 19) {
            var1 = 19;
        }

        super.c[31] = var1;
    }

    public final void c(int var1) {
        this.y(super.c[31] + 1);
    }

    public final int o() {
        return this.L()?super.c[31]:super.c[31] / 2;
    }

    private void z(int var1) {
        if(var1 > 99) {
            var1 = 99;
        }

        if(var1 < 19) {
            var1 = 19;
        }

        super.c[32] = var1;
    }

    public final void d(int var1) {
        this.z(super.c[32] + 1);
    }

    public final int p() {
        return this.L()?super.c[32]:super.c[32] / 2;
    }

    private void A(int var1) {
        if(var1 > 99) {
            var1 = 99;
        }

        if(var1 < 19) {
            var1 = 19;
        }

        super.c[33] = var1;
    }

    public final void e(int var1) {
        this.A(super.c[33] + 1);
    }

    public final int q() {
        return super.c[33];
    }

    public final void f(int var1) {
        if(var1 > 99) {
            var1 = 99;
        }

        super.c[34] = var1;
    }

    public final void g(int var1) {
        this.f(super.c[34] + var1);
    }

    public final int r() {
        return super.c[34];
    }

    public final void h(int var1) {
        if(var1 > 99) {
            var1 = 99;
        }

        super.c[35] = var1;
    }

    final int s() {
        return super.c[35];
    }

    public final void i(int var1) {
        if(var1 < 0) {
            var1 = 0;
        }

        if(var1 > 99) {
            var1 = 99;
        }

        super.c[36] = var1;
    }

    public final void j(int var1) {
        this.i(super.c[36] + var1);
    }

    private void J() {
        int var1 = super.c[16];
        int var2 = super.c[17];
        int var3 = super.c[15];
        int var4 = this.n();
        if(super.c[22] > 0 && var3 == 0) {
            var3 = 5;
        }

        int var5 = MankeyManCanvas.h() % 3;
        var1 = var4 * 36 + (var3 * 3 << 1) + (var1 << 1) + var2;
        this.a[0].e(n[var1], var5);
        this.a[0].setFlag2(this.d);
        if(super.c[23] == 1) {
            this.a[1].e(159, var5);
            this.a[1].setFlag2(this.d);
        } else {
            this.a[1].e();
            this.a[1].setFlag2(false);
        }

        if((var1 = super.c[39]) > 3) {
            var1 = 3;
        }

        if(var1 == 0) {
            this.a[2].a(-1);
            this.a[2].setFlag2(false);
        } else {
            this.a[2].a(22, 8, r[var1]);
            this.a[2].setFlag2(this.d);
        }

        if((var1 = super.c[40]) > 3) {
            var1 = 3;
        }

        if(var1 == 0) {
            this.a[3].a(-1);
            this.a[3].setFlag2(false);
        } else {
            this.a[3].a(22, 6, r[var1 + 4]);
            this.a[3].setFlag2(this.d);
        }

        if((var1 = super.c[41]) > 3) {
            var1 = 3;
        }

        for(var2 = 0; var2 < var1; ++var2) {
            this.a[var2 + 4].a(22, 0, new z(42, 0, 13, 13));
            this.a[var2 + 4].setFlag2(this.d);
        }

        for(var2 = var1; var2 < 3; ++var2) {
            this.a[var2 + 4].a(-1);
            this.a[var2 + 4].setFlag2(false);
        }

        if((super.c[38] & 32) != 0) {
            this.a[4].c(176);
            this.a[4].setFlag2(this.d);
            this.a[5].c(177);
            this.a[5].setFlag2(this.d);
        }

        if(super.c[22] > 0) {
            this.a[7].a(146, 0);
            this.a[7].setFlag2(this.d);
        }

    }

    public final void a(ao var1) {
        super.c[29] = var1 != null?var1.c[1]:-1;
    }

    private ao K() {
        return (ao) sClass.a(super.c[29]);
    }

    public final void a(ae var1) {
        super.c[28] = var1 != null?var1.c[1]:-1;
    }

    final ae t() {
        return (ae) sClass.a(super.c[28]);
    }

    public final void k(int var1) {
        super.c[23] = var1;
        this.J();
    }

    public final void l(int var1) {
        super.c[24] = var1;
        this.a(o[var1]);
    }

    final void u() {
        super.c[25] = super.c[24];
    }

    final void v() {
        this.l(super.c[25]);
        this.J();
    }

    public final boolean m(int var1) {
        ao var2;
        int var3 = (var2 = this.K()).m().a_();
        int var4 = this.n();
        int var5 = super.c[23];
        int var6 = super.c[41];
        int var7 = super.c[39];
        int var8 = super.c[22];
        switch(var1) {
            case 0:
                if(var4 >= 2 && var4 <= 4 && var8 == 0 && var6 == 0 && var7 == 0) {
                    if(var3 != 6 && var3 != 5) {
                        return true;
                    }

                    if(var2.j(10)) {
                        return true;
                    }
                }

                return false;
            case 1:
                return var4 > 0 && var6 == 0 && var7 == 0;

            case 2:
                return var4 >= 2 && var4 <= 4 && var6 == 0 && var7 == 0 && var2.j(16);

            case 3:
                return true;
            case 4:
                return var5 == 1 && var4 >= 2;

            default:
                return false;
        }
    }

    final int wMethod() {
        return super.c[30];
    }

    public final boolean x() {
        int var1;
        return (var1 = this.n()) >= 2 && var1 <= 4 && super.c[22] == 0 && super.c[41] == 0 && super.c[39] == 0;
    }

    public final void b() {
        boolean var2 = false;
        ao var3;
        if((var3 = this.K()) != null) {
            var2 = var3.j(14);
        }

        if(!var2 && super.c[39] > 0 && super.c[20] > 0 && MankeyManCanvas.h() % 100 < 50) {
            this.p(MankeyManCanvas.h() % 2);
        }

        if(super.c[19] - super.c[20] < super.c[18]) {
            super.c[20] = super.c[19] - super.c[18] - 1;
        }

        if(super.c[20] > 0) {
            super.c[19] -= super.c[20];
        }

        super.c[20] = 0;
        ao var4;
        if((var4 = (ao) sClass.a(super.c[29])) != null && super.c[21] == var4.m().g().c[5]) {
            int var5 = super.c[18] + 1;
            super.c[18] = var5;
            this.J();
        }

        int var1;
        if((var1 = super.c[22]) != 0) {
            ++var1;
            super.c[22] = var1;
        }

        if(!this.m(super.c[24])) {
            this.l(3);
        }

        this.J();
    }

    final void y() {
        if(super.c[40] >= 4) {
            super.c[58] = 3;
        } else if(super.c[41] >= 4) {
            super.c[58] = 2;
        } else if(super.c[39] >= 4) {
            super.c[58] = 1;
        } else if(super.c[18] > super.c[19]) {
            super.c[58] = 4;
        } else if(super.c[18] == super.c[19] && super.c[21] >= aiClass.q) {
            super.c[58] = 4;
        }

        if(super.c[58] != 0) {
            super.c[38] &= -9;
            this.J();
        }

    }

    public final void n(int var1) {
        if(var1 < 0) {
            var1 = 0;
        }

        if(var1 > 4) {
            var1 = 4;
        }

        super.c[40] = var1;
        this.J();
    }

    public final void o(int var1) {
        if(var1 < 0) {
            var1 = 0;
        }

        if(var1 > 4) {
            var1 = 4;
        }

        if(var1 > super.c[39]) {
            super.c[20] += var1 - super.c[39];
        }

        super.c[39] = var1;
        this.J();
    }

    public final void p(int var1) {
        this.o(super.c[39] + var1);
    }

    public final void q(int var1) {
        if(var1 < 0) {
            var1 = 0;
        }

        if(var1 > 4) {
            var1 = 4;
        }

        if(var1 > super.c[41]) {
            super.c[20] += var1 - super.c[41];
        }

        super.c[41] = var1;
        this.J();
    }

    public final void r(int var1) {
        this.q(super.c[41] + var1);
    }

    public final boolean z() {
        int var1 = super.c[18];
        switch(super.c[17]) {
            case 0:
                return var1 >= 5 && var1 <= 39;

            case 1:
                return var1 >= 5 && var1 <= 29;

            default:
                return false;
        }
    }

    final boolean A() {
        return (super.c[38] & 8) != 0;
    }

    final boolean B() {
        return super.c[28] != -1;
    }

    public final boolean C() {
        return super.c[22] != 0;
    }

    final boolean D() {
        return (super.c[38] & 4) != 0;
    }

    final void E() {
        ae var2;
        if(super.c[17] == 1 && (var2 = this.t()) != null) {
            super.c[38] &= -5;
            super.c[22] = 1;
            super.c[57] = 0;
            boolean var3 = false;
            if(super.c[23] == 1 || var2.c[23] == 1) {
                super.c[57] = 16;
                var3 = true;
            }

            int var1 = this.K().c(1);
            int var4 = this.K().c(0);
            var4 = var1 >= 3 && var4 >= 3? MankeyManCanvas.h() % 2:(var1 > var4?0:1);
            super.c[51] = var4;
            var1 = var3?20:0;
            if(super.c[27] != super.c[28]) {
                switch(aiClass.d) {
                    case 0:
                    case 1:
                    case 2:
                        var1 += 25 + MankeyManCanvas.h() % 16;
                        break;
                    case 3:
                    case 4:
                        var1 += 25 + MankeyManCanvas.h() % 21;
                        break;
                    case 5:
                    case 6:
                    case 7:
                        var1 += 30 + MankeyManCanvas.h() % 16;
                }
            }

            ao var5;
            if((var5 = this.K()) != null) {
                if(var5.j(3)) {
                    var1 += 2;
                }

                if(var5.j(8)) {
                    var1 += 2;
                }

                if(var5.j(13)) {
                    var1 += 2;
                }

                if(var5.j(7)) {
                    var1 += 2;
                }

                if(var5.j(9)) {
                    var1 += 2;
                }

                if(var5.j(6)) {
                    var1 += 2;
                }
            }

            if((var1 += (super.c[30] + var2.c[30]) / 2) > 1500) {
                var1 = 1500;
            }

            super.c[49] = var1;
            if((var1 = (super.c[19] + var2.c[19]) / 2 - (2 + MankeyManCanvas.h() % 11)) < 24) {
                var1 = 24;
            }

            super.c[50] = var1;
            var1 = (var2.o() + this.o() + 30) / 2 + -20 + MankeyManCanvas.h() % 41;
            if(var4 == 1) {
                var1 -= 30;
                if(var1 > 69) {
                    var1 = 69;
                }
            }

            if(var3) {
                var1 += 3;
                if(MankeyManCanvas.h() % 100 <= 0) {
                    var1 += 30;
                } else if(MankeyManCanvas.h() % 100 < 2) {
                    var1 -= 15;
                }
            } else if(MankeyManCanvas.h() % 100 < 3) {
                var1 -= 30;
            }

            super.c[52] = var1;
            int var7 = (var2.p() + this.p()) / 2;
            switch(var4) {
                case 0:
                    if(var1 >= 70) {
                        var7 += -30 + MankeyManCanvas.h() % 41;
                    }

                    if(var1 <= 69) {
                        var7 += -20 + MankeyManCanvas.h() % 41;
                    }
                    break;
                case 1:
                    if(var1 >= 50) {
                        var7 += -10 + MankeyManCanvas.h() % 21;
                    }

                    if(var1 <= 49) {
                        var7 += -10 + MankeyManCanvas.h() % 41;
                    }
            }

            if(var3) {
                if(MankeyManCanvas.h() % 100 <= 0) {
                    var7 += 30;
                }

                if(MankeyManCanvas.h() % 100 < 2) {
                    var7 -= 15;
                }
            } else if(MankeyManCanvas.h() % 100 < 3) {
                var7 -= 30;
            }

            super.c[53] = var7;
            var1 = (var2.c[33] + super.c[33]) / 2 + -18 + MankeyManCanvas.h() % 37;
            if(var3) {
                var1 += 3;
                if(MankeyManCanvas.h() % 100 <= 0) {
                    var1 += 30;
                } else if(MankeyManCanvas.h() % 100 < 2) {
                    var1 -= 15;
                }
            } else if(MankeyManCanvas.h() % 100 < 3) {
                var1 -= 30;
            }

            super.c[54] = var1;
            var1 = var3?20:0;
            int var6 = this.o() + this.p() + super.c[33];
            var4 = var2.o() + var2.p() + var2.c[33];
            var1 += (var6 + var4) / 2 / 3 + (super.c[36] + var2.c[36]) / 2 - 150;
            super.c[55] = var1;
            ++super.c[47];
            if(super.c[24] == 0) {
                this.l(3);
            }

            this.J();
        }

    }

    final void F() {
        if(super.c[17] == 1 && super.c[22] == 4) {
            super.c[22] = 0;
            this.J();
        }

    }

    final boolean G() {
        return super.c[41] == 0 && super.c[39] == 0 && super.c[40] == 0;
    }

    private boolean L() {
        ao var1;
        return (var1 = this.K()) == null || var1.p();
    }

    final void s(int var1) {
        if(this.n() > 1 && this.G()) {
            if(var1 < 0) {
                var1 = 0;
            }

            if(var1 > 99) {
                var1 = 99;
            }

            super.c[37] = var1;
        }

    }

    final void t(int var1) {
        this.s(super.c[37] + var1);
    }

    final int H() {
        return super.c[37];
    }

    final void u(int var1) {
        super.c[38] |= 32;
    }

    final boolean v(int var1) {
        return (super.c[38] & 32) != 0;
    }

    final int I() {
        return super.c[58];
    }
}
