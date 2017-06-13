//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class j extends aa {
    private static ao a;
    private static b b;
    private static ae[] c;
    private static ae[] d;
    private static ae[] e;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int[] o = new int[]{5, 7, 6, 9, 10, 8, 11};
    private static int[] p = new int[]{0, 50, 70, 90, 120, 150, 0, 10, 15, 20, 40, 50, 0, 20, 25, 30, 50, 0, 0, 5, 10, 15, 30, 0, 1, 3, 5, 10, 20, 0, 0, 5, 10, 15, 0, 0, 1, 3, 5, 10, 0, 0, 0, 30, 40, 50, 0, 80};
    private static int[] q = new int[]{1500, 2, 1000, 2, 5000, 2, 1500, 2, 1000, 2, 1000, 2, 10000, 5, 3000, 3, 1500, 2, 10000, 5, 1500, 2, 1500, 2, 1500, 2, 1500, 2, 1500, 2, 3000, 3, 100, 1, 200, 1, 300, 1, 400, 1, 500, 1, 600, 1, 700, 1, 800, 1, 900, 1, 1000, 1, 1200, 1, 1300, 1};
    private static q[] r = new q[]{new q(0, 0), new q(8, -26), new q(-8, -16), new q(8, -6)};
    private static final int[] s = new int[]{1, 2, 3, 5};

    public j(ao var1) {
        a = var1;
        var1.g();
        b = a.m();
    }

    public final boolean a() {
        this.i(1792);
        c = new ae[16];
        e = new ae[16];
        d = new ae[16];
        j = 0;
        h = 0;
        m = 0;
        i = 0;
        int var1;
        if((var1 = a.b(3)) > 0) {
            g = 0;

            int var2;
            for(var2 = 0; var2 < var1; ++var2) {
                ae var3;
                if((var3 = a.b(3, var2)).A()) {
                    c[g++] = var3;
                    if(var3.c[23] == 1) {
                        m = (var3.c[36] << 8) / 8 + 255 >> 8;
                    }
                }
            }

            if(g > 0) {
                for(var2 = 0; var2 < g; ++var2) {
                    a.b(c[var2]);
                }

                aiClass.A.d(1);
                return true;
            }
        }

        this.b();
        return false;
    }

    public final void b() {
        d = null;
        e = null;
        c = null;
    }

    public final void c() {
        int n = this.n();

        do {
            int var1;
            int var2;
            ae var3;
            int var4;
            int var5;
            int var8;
            int var9;
            int var10;
            int var12;
            int var14;
            ae var28;
            int var29;
            int var36;
            int var38;
            switch(this.o()) {
                case 0:
                    ae[] var37 = new ae[g];
                    ae[] var33 = new ae[g];
                    var4 = 0;
                    var5 = 0;
                    var36 = 0;

                    ae var39;
                    for(; var36 < g; ++var36) {
                        if((var39 = c[var36]).z() && var39.c[41] == 0 && var39.c[39] == 0) {
                            if(var39.c[17] == 1) {
                                var37[var4++] = var39;
                            } else {
                                var33[var5++] = var39;
                            }
                        }
                    }

                    if(var5 > 0 && var4 > 0) {
                        for(var36 = 0; var36 < var4; ++var36) {
                            if(var37[var36].C()) {
                                var37[var36] = null;
                            }
                        }

                        for(var36 = 0; var36 < var5; ++var36) {
                            if((var39 = var33[var36]) != null) {
                                for(var8 = 0; var8 < var4; ++var8) {
                                    ae var41;
                                    if((var41 = var37[var8]) != null && var41.t() == var39) {
                                        var33[var36] = null;
                                        var37[var8] = null;
                                        break;
                                    }
                                }
                            }
                        }

                        for(var36 = 0; var36 < var5; ++var36) {
                            if((var39 = var33[var36]) != null) {
                                ae var40 = var37[Canvas.h() % var4];
                                boolean var42 = false;
                                if(var40 != null) {
                                    if(!var39.B()) {
                                        if(!var40.B()) {
                                            if(Canvas.h() % 100 < 80) {
                                                var42 = true;
                                            }
                                        } else if(Canvas.h() % 100 < 30) {
                                            var42 = true;
                                        }
                                    } else if(var39.D()) {
                                        if(!var40.B()) {
                                            if(Canvas.h() % 100 < 50) {
                                                var42 = true;
                                            }
                                        } else if(Canvas.h() % 100 < 10) {
                                            var42 = true;
                                        }
                                    }

                                    if(var42) {
                                        if(var39.t() != null) {
                                            var39.t().a((ae)null);
                                        }

                                        if(var40.t() != null) {
                                            var40.t().a((ae)null);
                                        }

                                        var39.a(var40);
                                        var40.a(var39);
                                    }
                                }
                            }
                        }
                    }

                    this.h(3);
                case 1:
                case 2:
                case 4:
                default:
                    break;
                case 3:
                    if(j < 7) {
                        this.h(o[j++]);
                    } else {
                        this.h(13);
                    }
                    break;
                case 5:
                    if(n == 0) {
                        i = 0;

                        for(var1 = 0; var1 < g; ++var1) {
                            if(a(var28 = c[var1]) && (var28.c[41] > 0 || var28.c[39] > 0)) {
                                e[i++] = var28;
                            }
                        }

                        if(i > 0) {
                            this.d();
                            aiClass.A.d(0);
                        } else {
                            this.h(3);
                        }
                    } else {
                        if(n != 15) {
                            continue;
                        }

                        aiClass.b(6);

                        for(var1 = 0; var1 < i; ++var1) {
                            if((var28 = e[var1]).c[41] > 0) {
                                var29 = var28.c[41];
                                q var34 = var28.k();
                                sClass.a(17, 0, var34.a + r[var29].a, var34.b + r[var29].b, var28.m() - 2, 1);
                                var28.r(-1);
                            }

                            if(var28.c[39] > 0) {
                                var28.p(-1);
                            }
                        }

                        sClass.c(e[0].getName(true));
                        if(i == 1) {
                            sClass.d(170);
                        } else {
                            sClass.d(171);
                        }

                        this.h(12);
                    }
                    break;
                case 6:
                    if(n == 0) {
                        i = 0;
                        var1 = Canvas.h() % g;
                        var2 = b.a_();
                        if(a(var3 = c[var1]) && var3.n() >= 2 && var3.G() && var2 != 6 && var2 != 5) {
                            var4 = var3.q() + m;
                            var1 = 0;
                            if(var4 <= 39) {
                                var1 = 3;
                                k = 5;
                            }

                            if(var4 >= 40 && var4 <= 79) {
                                var1 = 5;
                                k = 10;
                            }

                            if(var4 >= 80) {
                                var1 = 15;
                                k = 20;
                            }

                            switch(b.c[7]) {
                                case 1:
                                    var1 += 10;
                                    break;
                                case 2:
                                    var1 = 0;
                                    break;
                                case 3:
                                    var1 = 0;
                            }

                            if(Canvas.h() % 100 < var1) {
                                i = 1;
                                e[0] = var3;
                            }
                        }

                        if(i > 0) {
                            sClass.c(e[0].getName(true));
                            sClass.d(172);
                            sClass.c(acClass.getNumberString(k, 5, false));
                            sClass.d(173);
                            a.f(k);
                            this.d();
                            aiClass.A.d(0);
                        } else {
                            this.h(3);
                        }
                    } else if(n == 15) {
                        aiClass.b(13);
                        byte var32 = 0;
                        if(k >= 10) {
                            var32 = 1;
                        }

                        if(k >= 20) {
                            var32 = 2;
                        }

                        sClass.a(1, var32, 120, 185, e[0].m() - 100, 0);
                        sClass.a(15, k, 120, 169, e[0].m() - 101, 4);
                        this.h(12);
                    }
                    break;
                case 7:
                    if(n != 0) {
                        if(n == 15) {
                            aiClass.b(13);
                            this.h(12);
                        }
                    } else {
                        i = 0;
                        if(b.c[7] != 3) {
                            for(var2 = 0; var2 < g; ++var2) {
                                if(a(var3 = c[var2]) && var3.n() >= 2 && var3.G()) {
                                    for(var4 = 0; var4 < 8; ++var4) {
                                        var36 = Canvas.h() % 6;
                                        var38 = a.c[var4 + 50];
                                        var8 = a.c[var4 + 58];
                                        var9 = var3.p() + m;
                                        if((var10 = p[var4 * 6 + var36]) > 0) {
                                            boolean var43 = false;
                                            switch(var36) {
                                                case 0:
                                                case 1:
                                                    if(var38 > 0) {
                                                        var43 = true;
                                                    }
                                                    break;
                                                case 2:
                                                    if(var38 > 0 && a.j(4)) {
                                                        var43 = true;
                                                    }
                                                    break;
                                                case 3:
                                                    if(var38 > 0 && aiClass.d >= 3) {
                                                        var43 = true;
                                                    }
                                                    break;
                                                case 4:
                                                    if(var8 > 0 && var9 >= 70 && var9 <= 99 && aiClass.d >= 5 && a.j(2)) {
                                                        var43 = true;
                                                    }
                                                    break;
                                                case 5:
                                                    if(var38 > 0 && aiClass.d >= 5 && a.j(9)) {
                                                        var43 = true;
                                                    }
                                            }

                                            if(var43) {
                                                if(var36 == 4) {
                                                    a.f(var4, var8 - 1);
                                                    var12 = var4 + 8;
                                                } else {
                                                    a.e(var4, var38 - 1);
                                                    var12 = var4;
                                                }

                                                byte var44 = 0;
                                                if(var9 >= 0 && var9 <= 49) {
                                                    var44 = 0;
                                                }

                                                if(var9 >= 50 && var9 <= 69) {
                                                    var44 = 1;
                                                }

                                                if(var9 >= 70 && var9 <= 89) {
                                                    var44 = 2;
                                                }

                                                if(var9 >= 90) {
                                                    var44 = 3;
                                                }

                                                var14 = var10 * s[var44];
                                                e[0] = var3;
                                                i = 1;
                                                sClass.c(e[0].getName(true));
                                                sClass.c("用");
                                                sClass.c(Canvas.getMessage(var12 + 181));
                                                sClass.c("▽");
                                                sClass.d(175);
                                                sClass.c(Canvas.getMessage(var44 + 340));
                                                sClass.c(Canvas.getMessage(var36 + 194));
                                                aiClass.d(var14);
                                                break;
                                            }
                                        }
                                    }
                                }

                                if(i > 0) {
                                    break;
                                }
                            }
                        }

                        if(i > 0) {
                            this.d();
                            aiClass.A.d(0);
                        } else {
                            this.h(3);
                        }
                    }
                    break;
                case 8:
                    if(n != 0) {
                        if(n == 15) {
                            aiClass.b(13);
                            b.a(8);
                            this.h(12);
                        }
                    } else {
                        i = 0;
                        if(b.a_() == 3 && b.k(1)) {
                            i = 0;

                            for(var2 = 0; var2 < g; ++var2) {
                                if(a(var3 = c[var2]) && var3.n() >= 2 && var3.G()) {
                                    var4 = var3.q();
                                    byte var35 = 0;
                                    if(var4 <= 39) {
                                        var35 = 10;
                                    }

                                    if(var4 >= 40 && var4 <= 79) {
                                        var35 = 30;
                                    }

                                    if(var4 >= 80 && var4 <= 99) {
                                        var35 = 50;
                                    }

                                    if(b.c[7] != 0) {
                                        var35 = 0;
                                    }

                                    if(Canvas.h() % 100 < var35) {
                                        b.m(1);
                                        e[i++] = var3;
                                        sClass.c(var3.getName(true));
                                        sClass.d(179);
                                        break;
                                    }
                                }
                            }

                            if(i > 0) {
                                this.d();
                                aiClass.A.d(0);
                            } else {
                                this.h(3);
                            }
                            continue;
                        }

                        this.h(3);
                    }
                    break;
                case 9:
                    if(n != 0) {
                        if(n == 15) {
                            if(l == 8) {
                                sClass.g();
                                sClass.f();
                            }

                            aiClass.x.d();
                            q var31 = e[0].k();
                            sClass.a(18, l, var31.a, var31.b - 30, e[0].m() + 1, 0);
                            aiClass.b(13);
                            this.h(12);
                            aiClass.d(q[l << 1] - aiClass.p * q[(l << 1) + 1]);
                        }
                    } else {
                        i = 0;
                        l = -1;
                        var2 = a.c[70];
                        var29 = a.c[71];
                        var4 = a.c[76];
                        var5 = a.k(4);
                        var36 = a.k(3);
                        var38 = a.k(2);
                        var8 = a.k(1);
                        var9 = a.c[74];
                        var10 = a.c[78];
                        int var11 = a.c[79];

                        for(var12 = 0; var12 < g; ++var12) {
                            ae var13;
                            if(a(var13 = c[var12]) && var13.n() >= 2 && var13.G()) {
                                var14 = var13.o();
                                int var15 = var13.p() + m;
                                int var16 = var13.q() + m;
                                int var17 = var13.w();
                                int var18 = var13.r();
                                int var19 = var13.s();
                                int var20 = var13.c[18];
                                int var21 = var13.c[36];
                                int var22 = var13.H();
                                int var23 = b.c[9];
                                int var24 = b.a_();
                                int var25 = Canvas.h() % 100;
                                boolean var26 = false;
                                if(var14 + var15 < 99 && var25 > 50 || var14 + var15 >= 99) {
                                    var26 = true;
                                }

                                if(aiClass.d >= 0 && l == -1 && !a.j(16) && var22 >= 8 && var26) {
                                    l = 16;
                                }

                                if(aiClass.d > 0 && l == -1) {
                                    if(!a.j(17)) {
                                        if(var22 >= 16 && var17 >= 350 && var19 >= 16 && var26) {
                                            l = 17;
                                        }
                                    } else if(!a.j(18)) {
                                        if(var22 >= 24 && var17 >= 400 && var19 >= 20 && var26) {
                                            l = 18;
                                        }
                                    } else if(!a.j(19) && var22 >= 32 && var17 >= 500 && var19 >= 24 && var26) {
                                        l = 19;
                                    }

                                    if(!a.j(5) && var22 >= 32 && var17 >= 400 && (var16 >= 69 || var25 > 50) && (b.c[10] == 2 || b.j(0).c[10] == 2 || b.j(1).c[10] == 2 || b.j(2).c[10] == 2 || b.j(3).c[10] == 2)) {
                                        l = 5;
                                    }

                                    if(!a.j(4) && var22 >= 44 && var17 >= 450 && var2 >= 1000 && (var15 >= 69 || var25 > 50)) {
                                        l = 4;
                                    }

                                    if(!a.j(1) && var22 >= 32 && var17 >= 500 && var18 >= 8 && var5 + var36 >= 15 && a.j(16) && (var15 >= 69 || var25 > 50)) {
                                        l = 1;
                                    }
                                }

                                if(aiClass.d >= 2 && l == -1) {
                                    if(!a.j(20)) {
                                        if(var22 >= 16 && var17 >= 600 && var19 >= 20 && a.j(19) && var26) {
                                            l = 20;
                                        }
                                    } else if(!a.j(21) && var22 >= 24 && var17 >= 700 && var19 >= 24 && var26) {
                                        l = 21;
                                    }

                                    if(!a.j(3) && var22 >= 32 && var17 >= 550 && var18 + var19 >= 20 && var16 >= 69 && var25 > 50) {
                                        l = 3;
                                    }

                                    if(!a.j(14) && var22 >= 24 && var17 >= 750 && var9 >= 4 && (var16 >= 69 || var25 > 50)) {
                                        l = 14;
                                    }

                                    if(!a.j(8) && var22 >= 24 && var17 >= 750 && var24 == 1 && (var16 >= 69 || var25 > 50)) {
                                        l = 8;
                                    }
                                }

                                if(aiClass.d >= 3 && l == -1) {
                                    if(!a.j(22)) {
                                        if(var22 >= 24 && var17 >= 800 && var19 >= 24 && a.j(21) && var26) {
                                            l = 22;
                                        }
                                    } else if(!a.j(23) && var22 >= 32 && var17 >= 900 && var19 >= 32 && var26) {
                                        l = 23;
                                    }

                                    if(!a.j(11) && var22 >= 32 && var17 >= 850 && var19 >= 24 && var29 >= 300 && (var15 >= 69 || var25 > 50)) {
                                        l = 11;
                                    }

                                    if(!a.j(0) && var22 >= 32 && var17 >= 950 && var4 >= 300 && a.j(5) && (var15 >= 69 || var25 > 50)) {
                                        l = 0;
                                    }

                                    if(!a.j(10) && var22 >= 32 && var17 >= 950 && (var24 == 6 || var24 == 5) && a.j(20) && (var15 >= 69 || var25 > 50)) {
                                        l = 10;
                                    }

                                    if(!a.j(12) && var22 >= 24 && var17 >= 800 && var23 <= 10 && a.j(5) && a.j(1) && var15 >= 69 && var25 > 50) {
                                        l = 12;
                                    }

                                    if(!a.j(13) && var22 >= 24 && var17 >= 850 && var18 + var19 >= 20 && var21 >= 48 && var10 >= 3 && a.j(3) && (var15 >= 69 || var25 > 50)) {
                                        l = 13;
                                    }
                                }

                                if(aiClass.d >= 4 && l == -1) {
                                    if(!a.j(24)) {
                                        if(var22 >= 24 && var17 >= 1000 && var19 >= 32 && var26 && a.j(23)) {
                                            l = 24;
                                        }
                                    } else if(!a.j(25) && var22 >= 32 && var17 >= 1100 && var19 >= 36 && var26) {
                                        l = 25;
                                    }

                                    if(!a.j(15) && var22 >= 32 && var17 >= 1050 && var18 >= 60 && var11 >= 2 && a.j(24) && (var14 + var15 >= 99 || var25 > 50)) {
                                        l = 15;
                                    }

                                    if(!a.j(7) && var22 >= 32 && var17 >= 1150 && a.j(3) && (var16 >= 69 || var25 > 50)) {
                                        l = 7;
                                    }
                                }

                                if(aiClass.d >= 5 && l == -1) {
                                    if(!a.j(26) && var22 >= 32 && var17 >= 1200 && var19 >= 36 && var26 && a.j(25)) {
                                        l = 26;
                                    }

                                    if(!a.j(2) && var22 >= 32 && var17 >= 1250 && var5 + var36 >= 20 && var8 >= 2 && var38 >= 2 && a.j(12) && (var15 >= 69 || var25 > 50)) {
                                        l = 2;
                                    }
                                }

                                if(aiClass.d >= 6 && l == -1) {
                                    if(!a.j(27) && var22 >= 48 && var17 >= 1300 && var19 >= 40 && var26) {
                                        l = 27;
                                    }

                                    if(!a.j(9) && var22 >= 48 && var17 >= 1300 && a.j(7) && a.j(8) && (var16 >= 69 || var25 > 50)) {
                                        l = 9;
                                    }

                                    if(!a.j(6) && var22 >= 48 && var17 >= 1350 && var21 >= 64 && var20 >= 30 && a.j(9) && a.j(13) && (var16 >= 69 || var25 > 50)) {
                                        l = 6;
                                    }
                                }
                            }

                            if(l != -1) {
                                e[0] = var13;
                                i = 1;
                                var29 = l;
                                ao var30 = a;
                                var4 = var29 / 16;
                                var29 %= 16;
                                var30.c[var4 + 11] |= 1 << var29;
                                aiClass.a(Canvas.getMessage(217 + l));
                                var13.s(0);
                                sClass.c(var13.getName(true));
                                sClass.c("▽");
                                sClass.d(162);
                                sClass.d(217 + l);
                                sClass.c("▽");
                                sClass.d(134 + l);
                                break;
                            }
                        }

                        if(l != -1) {
                            this.d();
                            aiClass.A.d(0);
                        } else {
                            this.h(3);
                        }
                    }
                    break;
                case 10:
                    i = 0;
                    this.h(3);
                    break;
                case 11:
                    if(n != 0) {
                        if(n == 15) {
                            aiClass.b(20);
                            if(i == 1) {
                                sClass.c(e[0].getName(true));
                            }

                            if(i == 2) {
                                sClass.c(e[0].getName(true));
                                sClass.d(167);
                                sClass.c(e[1].getName(true));
                            }

                            if(i >= 3) {
                                sClass.c(e[0].getName(true));
                                sClass.d(168);
                            }

                            sClass.d(169);
                            this.h(12);
                        }
                    } else {
                        i = 0;

                        for(var1 = 0; var1 < g; ++var1) {
                            if(a(var28 = c[var1])) {
                                e[i++] = var28;
                            }
                        }

                        if(i > 0) {
                            aiClass.b(20);
                            this.d();
                            aiClass.A.d(0);
                        } else {
                            this.h(3);
                        }
                    }
                    break;
                case 12:
                    if(n == 0) {
                        sClass.h();
                        Canvas.option(1, (String)null);
                    }

                    if(sClass.j() && Canvas.d(1048576)) {
                        sClass.i();
                        sClass.c(1);
                        sClass.c(15);
                        sClass.c(18);
                        Canvas.c(8);
                        Canvas.f(0);
                        aiClass.x.d();
                        aiClass.b(22);
                        boolean var27 = true;

                        for(var5 = 0; var5 < i; ++var5) {
                            ae var6;
                            q var7 = (var6 = e[var5]).i();
                            var6.a(var7.a - 200, var7.b, 12 + Canvas.h() % 5, 1, false);
                        }

                        Canvas.b(17, false);
                        this.g(1);
                    }

                    if(sClass.k() && n >= 14) {
                        aiClass.A.setColor(0);
                        aiClass.A.d(1);
                        this.h(3);
                    }
                    break;
                case 13:
                    Canvas.option(1, (String)null);

                    for(var2 = 0; var2 < g; ++var2) {
                        ++(var3 = c[var2]).c[42];
                        var3.t(2);
                        if(var3.c[42] % 8 == 0) {
                            var3.e(1);
                        }

                        if(var3.c[42] % 4 == 0) {
                            var3.b(var3.c[19] + 1);
                        }

                        if(var3.c[42] % 4 == 0) {
                            var3.j(1);
                        }
                    }

                    a.f();

                    for(var2 = 0; var2 < g; ++var2) {
                        a.a(c[var2]);
                        c[var2].l();
                    }

                    aiClass.A.setColor(0);
                    aiClass.A.d(1);
                    this.f(0);
            }
        } while(this.o() == 3 && i == 0);

    }

    private void d() {
        boolean var1 = true;
        q[] var4 = new q[16];

        int var2;
        for(var2 = 0; var2 < 16; ++var2) {
            var4[var2] = new q(0, 0);
        }

        if(i == 1) {
            var4[0].a = 0;
            var4[0].b = 0;
        } else if(i == 2) {
            var4[0].a = -16;
            var4[0].b = 0;
            var4[1].a = 16;
            var4[1].b = 0;
        } else if(i == 3) {
            var4[0].a = 0;
            var4[0].b = 0;
            var4[1].a = 32;
            var4[1].b = 0;
            var4[2].a = -32;
            var4[2].b = 0;
        } else {
            for(var2 = 0; var2 < i; ++var2) {
                int var3 = -90 + (92160 / i * var2 >> 8);
                var4[var2].a = Canvas.cos(var3) * (36 + (544 * i >> 8)) >> 8;
                var4[var2].b = Canvas.sin(var3) * (12 + (544 * i >> 8)) >> 8;
            }
        }

        for(var2 = 0; var2 < i; ++var2) {
            ae var5;
            (var5 = e[var2]).b(120, 144);
            var5.a(var4[var2].a + 200, var4[var2].b);
            var5.a(var4[var2].a, var4[var2].b, 12 + Canvas.h() % 5, 2, false);
            var5.f();
            d[h++] = var5;
        }

        Canvas.b(17, false);
    }

    private static boolean a(ae var0) {
        for(int var1 = 0; var1 < h; ++var1) {
            if(d[var1] == var0) {
                return false;
            }
        }

        return true;
    }
}
