//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class b extends aj {
    private static int[] a = new int[]{0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 2, 1, 0, 2, 4, 4, 4, 4, 4, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] d = new int[]{0, 1, 0, 0, 0, 2, 1, 0, 2, 4, 8, 0, 0, 0, -1, 0};
    private static int[] e = new int[]{30, 16, 30, 50, 60, 0, 0, 0, 99, 2, 4, 8, 10, 0, 0, 0, 50, 1, 6, 16, 16, 0, 0, 0, 16, 0, 4, 6, 6, 0, 0, 0, 40, 4, 20, 40, 30, 0, 0, 0, 20, 0, 0, 0, 0, 0, 20, 2, 20, 0, 0, 0, 0, 30, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 8, 0, 50, 50, 0, 0, 0};
    private static int[] f = new int[]{0, 0, 0, 0, 0, 4, 5, 4, 0, 10, 9, 8, 13, 10, 8, 9, 8, 9, 18, 17, 16, 21, 18, 16, 17, 16, 17, 24, 23, 22, 27, 24, 22, 23, 22, 23, 27, 26, 25, 30, 27, 25, 26, 25, 26, 26, 25, 24, 29, 27, 24, 25, 24, 25, 24, 23, 22, 27, 24, 22, 23, 22, 23, 22, 21, 20, 25, 22, 20, 21, 20, 21, 0, 0, 0, 0, 0, 17, 18, 17, 0, 0, 0, 0, 0, 0, 12, 13, 13, 0};
    private static int[] g = new int[]{19, 20, 21, 22, 23, 24, 25, 26};
    private static int[] h = new int[]{28, 29, 30, 31, 32, 33, 34, 35};
    private static int[] i = new int[8];

    public b(an var1, int var2) {
        super.length = 40;
        super.c = new int[40];
        super.c[0] = 2;
        super.c[4] = var1.c[1];
        super.c[5] = var2;
    }

    public final void a() {
        this.x(4128);
        this.a(0);
    }

    public final void b() {
        int var2;
        int var3;
        if((var2 = super.c[15]) > 0) {
            super.c[15] = var2 - 1;
            if(super.c[15] == 0) {
                super.c[10] = 0;
            }
        } else if((var3 = super.c[16]) > 0) {
            super.c[16] = var3 - 1;
        }

        b var4 = this;
        an var5;
        int var6 = (var5 = this.g()).c[4];
        if(this.c(0) == 0 && super.c[17] == 0 && var5.a(var5.g()) != this) {
            ++super.c[12];
        } else {
            super.c[12] = 0;
        }

        if(super.c[7] == 1) {
            ++super.c[13];
        } else {
            super.c[13] = 0;
        }

        if(super.c[7] == 2) {
            ++super.c[14];
        } else {
            super.c[14] = 0;
        }

        int var7;
        if(super.c[10] == 0 && super.c[16] == 0 && super.c[19] == 0 && super.c[17] == 0) {
            label365: {
                boolean var8;
                b var9;
                if((var7 = super.c[6]) != 7 && var7 != 8 && (var6 >= 30 && var6 <= 32 || var6 >= 60 && var6 <= 64 || var6 >= 90 && var6 <= 95 || var6 >= 120 && var6 <= 126 || var6 >= 150 && var6 <= 157 || var6 >= 180 && var6 <= 188 || var6 >= 210 && var6 <= 209 || var6 >= 240 && var6 <= 249 || var6 >= 270)) {
                    var8 = false;

                    for(var2 = 0; var2 < 4; ++var2) {
                        if((var9 = var4.j(var2)).c[10] == 7 && var9.c[15] <= 2) {
                            var8 = true;
                        }
                    }

                    if(var8 && MankeyManCanvas.random() % 100 < 40) {
                        var4.c[10] = 7;
                        var4.c[15] = 3 + MankeyManCanvas.random() % 2;
                        var4.c[16] = 4;
                        break label365;
                    }
                }

                if(var7 == 0 && var6 >= 50 && var4.c[12] >= 12 && MankeyManCanvas.random() % 100 < 80) {
                    var4.c[12] = 0;
                    var4.c[10] = 1;
                    var4.c[15] = 1 + MankeyManCanvas.random() % 2;
                } else {
                    label368: {
                        if((var7 == 2 || var7 == 1) && !var5.a(511) && var6 >= 10) {
                            var8 = false;

                            for(var2 = 0; var2 < 4; ++var2) {
                                if((var9 = var4.j(var2)).c[10] == 2 && var9.c[15] <= 2) {
                                    var8 = true;
                                }
                            }

                            if((var4.c[13] >= 2 || var8) && MankeyManCanvas.random() % 100 < 80) {
                                var4.c[13] = 0;
                                var4.c[10] = 2;
                                var4.c[15] = 2 + MankeyManCanvas.random() % 3;
                                var4.c[16] = 3;
                                break label368;
                            }
                        }

                        if(var7 == 4 && !var5.a(511) && var6 >= 20 && var4.c[14] > 0) {
                            var4.c[14] = 0;
                            var4.c[10] = 3;
                            var4.c[15] = 2 + MankeyManCanvas.random() % 2;
                        } else if(var7 == 3 && !var5.a(511) && var6 >= 10 && var4.c[13] > 0) {
                            var4.c[13] = 0;
                            var4.c[10] = 4;
                            var4.c[15] = 2 + MankeyManCanvas.random() % 2;
                        } else if(var7 == 4) {
                            if(var6 % 30 == 0) {
                                if(MankeyManCanvas.random() % 100 < 50) {
                                    var4.c[10] = 7;
                                    var4.c[15] = 3 + MankeyManCanvas.random() % 2;
                                    var4.c[16] = 4;
                                }
                            } else if(var6 % 5 == 0 && !var5.a(511) && MankeyManCanvas.random() % 100 < 30) {
                                var4.c[10] = 6;
                                var4.c[15] = 3 + MankeyManCanvas.random() % 2;
                                var4.c[16] = 2;
                            }
                        }
                    }
                }
            }
        }

        if(super.c[10] != 0 && super.c[7] != 0) {
            super.c[7] = 0;
        }

        an var10;
        var3 = (var10 = (an) sClass.a(super.c[4])).c[5];
        int var11 = super.c[7];
        int var12 = super.c[10];
        var6 = 0;
        var7 = 0;
        int var13 = 0;
        switch(var3) {
            case 1:
                var6 = 4 + MankeyManCanvas.random() % 5;
            case 2:
            default:
                break;
            case 3:
                var6 = -10 + MankeyManCanvas.random() % 3;
        }

        if(var10.a(1)) {
            var7 = -3;
        }

        if(var10.a(2)) {
            var7 = -5;
        }

        if(var10.a(4)) {
            var7 = -10;
        }

        if(var10.a(8)) {
            var7 = -15;
        }

        if(var10.a(16)) {
            var7 = -18;
        }

        if(var10.a(32)) {
            var7 = -15;
        }

        if(var10.a(64)) {
            var7 = -10;
        }

        if(var10.a(128)) {
            var7 = -5;
        }

        if(var10.a(256)) {
            var7 = -3;
        }

        switch(var11) {
            case 1:
                var7 += 2 + MankeyManCanvas.random() % 2;
                break;
            case 2:
                var7 += -3 + MankeyManCanvas.random() % 2;
        }

        switch(var12) {
            case 1:
            case 3:
            case 5:
                var13 = -3 + MankeyManCanvas.random() % 2;
                break;
            case 2:
                var13 = 4 + MankeyManCanvas.random() % 5;
                break;
            case 4:
                var13 = 6 + MankeyManCanvas.random() % 5;
        }

        var3 = super.c[8] + var6 + var7 + var13;
        super.c[9] = var3;
        if(super.c[6] != 3 && super.c[9] <= 3) {
            this.d(3);
        }

        b var1 = this;
        var3 = ((an) sClass.a(super.c[4])).c[5];
        var11 = super.c[7];

        for(var12 = 1; var12 < 8; ++var12) {
            if(var1.c[6] != 7) {
                var13 = a[(var3 << 5) + (var11 << 3) + var12];
                var1.a(var12, var1.c(var12) + var13);
            }
        }

        if(var1.c[6] != 7) {
            var7 = d[(var3 << 2) + var11];
            var1.h(var1.c[18] + var7);
        }

        var1 = this;
        label239:
        switch(super.c[10]) {
            case 1:
            default:
                break;
            case 2:
                this.h((super.c[18] << 8) / 2 >> 8);
                break;
            case 3:
                for(var2 = 1; var2 < 8; ++var2) {
                    var1.a(var2, (var1.c(var2) << 8) / 2 >> 8);
                }

                var1.h((var1.c[18] >> 8) / 2 << 8);
                break;
            case 4:
                for(var2 = 1; var2 < 8; ++var2) {
                    var1.a(var2, (var1.c(var2) << 8) / 2 >> 8);
                }

                var1.h((var1.c[18] << 8) / 2 >> 8);
                break;
            case 5:
                var2 = 1;

                while(true) {
                    if(var2 >= 8) {
                        break label239;
                    }

                    var1.a(var2, (var1.c(var2) << 8) / 2 >> 8);
                    ++var2;
                }
            case 6:
            case 7:
                for(var2 = 1; var2 < 8; ++var2) {
                    var1.a(var2, (var1.c(var2) << 8) / 2 >> 8);
                }
        }

        if(var1.c(0) > 0) {
            for(var2 = 1; var2 < 8; ++var2) {
                var1.a(var2, (var1.c(var2) << 8) / 2 >> 8);
            }
        }

    }

    public final void a(int var1) {
        super.c[6] = var1;
        if(var1 != -1) {
            int var2 = e[var1 << 3] + -4 + MankeyManCanvas.random() % 9;
            int var4 = var2 * 358 >> 8;
            if(var4 < 0) {
                var4 = 0;
            }

            if(var4 > 999) {
                var4 = 999;
            }

            super.c[27] = var4;
            this.h(var2);
            i[0] = 0;
            i[1] = -1 + MankeyManCanvas.random() % 3;
            i[2] = -2 + MankeyManCanvas.random() % 5;
            i[3] = -4 + MankeyManCanvas.random() % 9;
            i[4] = -4 + MankeyManCanvas.random() % 9;
            i[5] = -4 + MankeyManCanvas.random() % 9;
            i[6] = -8 + MankeyManCanvas.random() % 17;
            i[7] = 0;

            for(var2 = 0; var2 < 8; ++var2) {
                if(var2 != 0) {
                    if(e[(var1 << 3) + var2] == 0) {
                        this.a(var2, 0);
                        this.b(var2, 0);
                    } else {
                        int var3 = e[(var1 << 3) + var2] + i[var2];
                        this.b(var2, var3 * 307 >> 8);
                        this.a(var2, var3);
                    }
                }
            }

            this.a(0, 0);
            this.b(0, 1);
            super.c[8] = f[super.c[5] * 9 + var1] + -2 + MankeyManCanvas.random() % 5;
            super.c[9] = super.c[8];
        }
    }

    final int a_() {
        return super.c[6];
    }

    public final int d() {
        int var1;
        return (var1 = super.c[6]) != 5 && var1 != 6 && var1 != 7?0:1;
    }

    public final int c(int var1) {
        if(var1 != 8) {
            return super.c[h[var1]];
        } else {
            var1 = 0;

            for(int var2 = 0; var2 < 8; ++var2) {
                var1 += super.c[g[var2]];
            }

            return var1;
        }
    }

    public final void a(int var1, int var2) {
        if(var2 < 0) {
            var2 = 0;
        }

        if(var2 > this.c(var1)) {
            var2 = this.c(var1);
        }

        super.c[g[var1]] = var2;
    }

    private void b(int var1, int var2) {
        if(var2 < 0) {
            var2 = 0;
        }

        if(var2 > 99) {
            var2 = 99;
        }

        super.c[h[var1]] = var2;
    }

    public final void d(int var1) {
        super.c[7] = var1;
    }

    public final void e(int var1) {
        super.c[10] = 0;
    }

    public final void f(int var1) {
        super.c[15] = 0;
    }

    public final void g(int var1) {
        super.c[16] = 3;
    }

    public final void h(int var1) {
        if(var1 < 0) {
            var1 = 0;
        }

        if(var1 > this.e()) {
            var1 = this.e();
        }

        super.c[18] = var1;
    }

    public final int e() {
        return super.c[9] <= 5?super.c[27] / 2:super.c[27];
    }

    public final void i(int var1) {
        super.c[17] = var1;
    }

    public final int f() {
        return super.c[17];
    }

    public final an g() {
        return (an) sClass.a(super.c[4]);
    }

    public final b j(int var1) {
        return (b) sClass.a(super.c[var1 + 36]);
    }

    public final void a(int var1, b var2) {
        super.c[var1 + 36] = var2.c[1];
    }

    public final boolean k(int var1) {
        return (super.c[11] & 1) != 0;
    }

    public final void l(int var1) {
        super.c[11] |= 1;
    }

    public final void m(int var1) {
        super.c[11] &= -2;
    }
}
