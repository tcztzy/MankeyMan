//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class an extends aj {
    private static final Point[] a = new Point[]{new Point(0, -1), new Point(0, 1), new Point(-1, 0), new Point(1, 0)};
    private static int[] d = new int[5];

    an() {
        super.b = 131;
        super.c = new int[131];
        super.c[0] = 1;
    }

    public final void a() {
        this.x(4112);
        super.c[4] = 1;
        super.c[5] = 0;

        int var1;
        for(var1 = 0; var1 < 90; ++var1) {
            b var2 = new b(this, var1 / 9);
            var2 = (b) aiClass.x.a(var2);
            super.c[var1 + 41] = var2.c[1];
        }

        an var8 = this;

        for(var1 = 0; var1 < 90; ++var1) {
            ((b) sClass.a(var8.c[var1 + 41])).a(-1);
        }

        var8.a(0, 0).a(7);
        var8.a(1, 0).a(5);
        var8.a(2, 0).a(5);
        var8.a(3, 0).a(5);
        var8.a(4, 0).a(5);
        var8.a(5, 0).a(5);
        var8.a(6, 0).a(5);
        var8.a(7, 0).a(5);
        var8.a(8, 0).a(7);
        var8.a(0, 1).a(5);
        var8.a(8, 1).a(5);
        var8.a(1, 3, 2, 1, 1, 0);
        var8.a(2, 2, 3, 3, 0, 1);
        var8.a(3, 3, 3, 1, 0, 2);
        var8.a(4, 2, 3, 1, 1, 2);
        var8.a(5, 2, 1, 2, 2, 2);
        var8.a(0, 6).a(6);
        var8.a(6, 6).a(6);
        var8.a(6, 2, 1, 1, 2, 1);
        var8.a(0, 7).a(7);
        var8.a(1, 7).a(6);
        var8.a(5, 7).a(6);
        var8.a(6, 7).a(7);
        var8.a(7, 7).a(6);
        var8.a(7, 1, 1, 1, 1, 0);
        var8.a(0, 8).a(7);
        var8.a(1, 8).a(7);
        var8.a(2, 8).a(6);
        var8.a(3, 8).a(6);
        var8.a(4, 8).a(6);
        var8.a(5, 8).a(7);
        var8.a(6, 8).a(7);
        var8.a(7, 8).a(7);
        var8.a(8, 8).a(6);
        var8.a(0, 9).a(7);
        var8.a(1, 9).a(7);
        var8.a(2, 9).a(7);
        var8.a(3, 9).a(7);
        var8.a(4, 9).a(7);
        var8.a(5, 9).a(7);
        var8.a(6, 9).a(7);
        var8.a(7, 9).a(7);
        var8.a(8, 9).a(7);

        int var3;
        for(var1 = 0; var1 < 2; ++var1) {
            int var4;
            do {
                var3 = MankeyManCanvas.h() % 9;
                var4 = MankeyManCanvas.h() % 10;
            } while(var8.a(var3, var4).a_() != 3);

            var8.a(var3, var4).l(1);
        }

        for(var1 = 0; var1 < 10; ++var1) {
            for(var3 = 0; var3 < 9; ++var3) {
                b var9 = var8.a(var3, var1);

                for(int var5 = 0; var5 < 4; ++var5) {
                    int var6 = var3 + a[var5].x;
                    int var7 = var1 + a[var5].y;
                    if(var6 < 0) {
                        var6 += 9;
                    }

                    if(var7 < 0) {
                        var7 += 10;
                    }

                    if(var6 >= 9) {
                        var6 -= 9;
                    }

                    if(var7 >= 10) {
                        var7 -= 10;
                    }

                    b var10 = var8.a(var6, var7);
                    var9.a(var5, var10);
                }
            }
        }

        for(var1 = 0; var1 < 5; ++var1) {
            var8.c[var1 + 10] = 0;
        }

        var8.c[9] = 0;

        for(var1 = 0; var1 < 5; ++var1) {
            var8.c[var1 + 26] = 0;
        }

        var8.c[25] = 0;
        this.h();
    }

    public final void c() {
    }

    public final void b_() {
    }

    public final void b() {
        int var2 = super.c[5];
        ++var2;
        if(var2 > 3) {
            var2 = 0;
            int var3 = super.c[4];
            ++var3;
            if(var3 > 999) {
                var3 = 999;
            }

            super.c[4] = var3;
        }

        super.c[5] = var2;
        this.h();
        an var1 = this;

        for(var2 = 0; var2 < 5; ++var2) {
            if((var1.c[var2 + 26] & 1) != 0 && var1.a(var1.c[var2 + 31], var1.c[var2 + 36]).f() == 0) {
                var1.c[var2 + 26] = 0;
            }
        }

        for(var2 = 0; var2 < 5; ++var2) {
            if((var1.c[var2 + 10] & 1) != 0 && var1.a(var1.c[var2 + 15], var1.c[var2 + 20]).b(0) == 0) {
                var1.c[var2 + 10] = 0;
            }
        }

    }

    public final void f() {
        an self = this;
        Point var2 = this.g();
        int var3 = super.c[4];
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        b var9;
        int var10;
        if((super.c[6] & 511) != 0) {
            for(var4 = 0; var4 < 5; ++var4) {
                if((self.c[var4 + 10] & 1) != 0) {
                    self.c[var4 + 10] = 0;
                    var5 = self.c[var4 + 15];
                    var6 = self.c[var4 + 20];
                    self.a(var5, var6).a(0, 0);
                }
            }
        } else if(var3 >= 20) {
            if(var3 >= 130) {
                super.c[9] = 5;
            } else if(var3 >= 125) {
                super.c[9] = 4;
            } else if(var3 >= 40) {
                super.c[9] = 3;
            } else if(var3 >= 30) {
                super.c[9] = 2;
            } else if(var3 >= 20) {
                super.c[9] = 1;
            }

            var4 = super.c[9];

            for(var5 = 0; var5 < var4; ++var5) {
                for(var6 = 0; var6 < 10; ++var6) {
                    if((self.c[var5 + 10] & 1) == 0) {
                        var7 = MankeyManCanvas.h() % 9;
                        var8 = MankeyManCanvas.h() % 10;
                        var10 = (var9 = self.a(var7, var8)).a_();
                        if(var9.b(0) == 0 && var9.f() == 0 && var10 != 7 && var10 != 6 && var10 != 5 && var10 != 8 && var9.c[10] == 0 && (var2.x - 2 > var7 || var2.x + 2 < var7 || var2.y - 2 > var8 || var2.y + 2 < var8)) {
                            var9.a(0, 1);
                            self.c[var5 + 10] = 1;
                            self.c[var5 + 15] = var7;
                            self.c[var5 + 20] = var8;
                        }
                    }
                }
            }
        }

        self = this;
        var2 = this.g();
        if((var3 = super.c[4]) >= 30) {
            if(var3 >= 50) {
                super.c[25] = 5;
            } else if(var3 >= 45) {
                super.c[25] = 4;
            } else if(var3 >= 40) {
                super.c[25] = 3;
            } else if(var3 >= 35) {
                super.c[25] = 2;
            } else if(var3 >= 30) {
                super.c[25] = 1;
            }

            var4 = super.c[25];

            for(var5 = 0; var5 < var4; ++var5) {
                for(var6 = 0; var6 < 10; ++var6) {
                    if((self.c[var5 + 26] & 1) == 0) {
                        var7 = MankeyManCanvas.h() % 9;
                        var8 = MankeyManCanvas.h() % 10;
                        if((var9 = self.a(var7, var8)).b(0) == 0 && var9.f() == 0 && var9.a_() != 7 && var9.c[10] == 0 && (var2.x - 2 > var7 || var2.x + 2 < var7 || var2.y - 2 > var8 || var2.y + 2 < var8)) {
                            var9.i(1);
                            self.c[var5 + 26] = 1;
                            self.c[var5 + 31] = var7;
                            self.c[var5 + 36] = var8;
                            break;
                        }
                    }
                }
            }
        }

        self = this;

        for(var3 = 0; var3 < 90; ++var3) {
            var4 = var3 % 9;
            var5 = var3 / 9;
            self.a(var4, var5).a(0, 0);
        }

        Point var12 = self.g();

        for(var4 = 0; var4 < 5; ++var4) {
            if((self.c[var4 + 10] & 1) != 0) {
                var5 = self.c[var4 + 15];
                var6 = self.c[var4 + 20];
                if(!aiClass.w && var5 == var12.x && var6 == var12.y) {
                    for(var7 = 0; var7 < 10; ++var7) {
                        var8 = var5;
                        int var13 = var6;
                        switch(MankeyManCanvas.h() % 6) {
                            case 0:
                                var13 = var6 - 1;
                                break;
                            case 1:
                                var13 = var6 + 1;
                                break;
                            case 2:
                                var8 = var5 - 1;
                                break;
                            case 3:
                                var8 = var5 + 1;
                        }

                        if(var8 < 0) {
                            var8 = 8;
                        }

                        if(var8 >= 9) {
                            var8 = 0;
                        }

                        if(var13 < 0) {
                            var13 = 9;
                        }

                        if(var13 >= 10) {
                            var13 = 0;
                        }

                        b var11;
                        var10 = (var11 = self.a(var8, var13)).a_();
                        if(var11.b(0) == 0 && var11.f() == 0 && var10 != 7 && var10 != 6 && var10 != 5 && var10 != 8 && var11.c[10] == 0) {
                            var5 = var8;
                            var6 = var13;
                            break;
                        }
                    }
                }

                self.c[var4 + 15] = var5;
                self.c[var4 + 20] = var6;
                self.a(var5, var6).a(0, 1);
            }
        }

        self = this;

        for(var3 = 0; var3 < 90; ++var3) {
            var4 = var3 % 9;
            var5 = var3 / 9;
            self.a(var4, var5).i(0);
        }

        for(var3 = 0; var3 < 5; ++var3) {
            if((self.c[var3 + 26] & 1) != 0) {
                var4 = self.c[var3 + 31];
                var5 = self.c[var3 + 36];
                if(!aiClass.w) {
                    for(var6 = 0; var6 < 10; ++var6) {
                        var7 = var4;
                        var8 = var5;
                        switch(MankeyManCanvas.h() % 8) {
                            case 0:
                                var8 = var5 - 1;
                                break;
                            case 1:
                                var8 = var5 + 1;
                                break;
                            case 2:
                                var7 = var4 - 1;
                                break;
                            case 3:
                                var7 = var4 + 1;
                        }

                        if(var7 < 0) {
                            var7 = 8;
                        }

                        if(var7 >= 9) {
                            var7 = 0;
                        }

                        if(var8 < 0) {
                            var8 = 9;
                        }

                        if(var8 >= 10) {
                            var8 = 0;
                        }

                        b var14;
                        if((var14 = self.a(var7, var8)).b(0) == 0 && var14.f() == 0 && var14.a_() != 7 && var14.c[10] == 0) {
                            var4 = var7;
                            var5 = var8;
                            break;
                        }
                    }
                }

                self.c[var3 + 31] = var4;
                self.c[var3 + 36] = var5;
                self.a(var4, var5).i(1);
            }
        }

    }

    public final b a(int var1, int var2) {
        if(var1 < 0) {
            var1 += 9;
        }

        if(var2 < 0) {
            var2 += 10;
        }

        if(var1 >= 9) {
            var1 -= 9;
        }

        if(var2 >= 10) {
            var2 -= 10;
        }

        return (b) sClass.a(super.c[41 + var2 * 9 + var1]);
    }

    public final b a(Point var1) {
        return this.a(var1.x, var1.y);
    }

    private void a(int var1, int var2, int var3, int var4, int var5, int var6) {
        d[0] = var2;
        d[1] = var3;
        d[2] = var4;
        d[3] = var5;
        d[4] = var6;

        for(var3 = 0; var3 < 5; ++var3) {
            var4 = 0;

            while(var4 < d[var3]) {
                var2 = var1 * 9 + MankeyManCanvas.h() % 9;
                b var7;
                if((var7 = (b) sClass.a(super.c[var2 + 41])).a_() == -1) {
                    var7.a(var3);
                    ++var4;
                }
            }
        }

    }

    private void h() {
        int var1;
        for(var1 = 0; var1 < 90; ++var1) {
            ((b) sClass.a(super.c[var1 + 41])).d(0);
        }

        int var2;
        if((var1 = super.c[4]) > 1) {
            b var3;
            for(var2 = 0; var2 < 5; ++var2) {
                if((var3 = (b) sClass.a(super.c[41 + MankeyManCanvas.h() % 90])).c[7] == 0) {
                    var3.d(1);
                }
            }

            for(var2 = 0; var2 < 3; ++var2) {
                int var4 = (var3 = (b) sClass.a(super.c[41 + MankeyManCanvas.h() % 90])).a_();
                if(var3.c[7] == 0 && var4 != 3 && var4 != 8) {
                    var3.d(2);
                }
            }
        }

        if(var1 >= 80) {
            if((var2 = (var1 - 80) % 145) >= 0 && var2 <= 4) {
                super.c[6] = 1;
                return;
            }

            if(var2 >= 5 && var2 <= 9) {
                super.c[6] = 2;
                return;
            }

            if(var2 >= 10 && var2 <= 14) {
                super.c[6] = 4;
                return;
            }

            if(var2 >= 15 && var2 <= 19) {
                super.c[6] = 8;
                return;
            }

            if(var2 >= 20 && var2 <= 24) {
                super.c[6] = 16;
                return;
            }

            if(var2 >= 25 && var2 <= 29) {
                super.c[6] = 32;
                return;
            }

            if(var2 >= 30 && var2 <= 34) {
                super.c[6] = 64;
                return;
            }

            if(var2 >= 35 && var2 <= 39) {
                super.c[6] = 128;
                return;
            }

            if(var2 >= 40 && var2 <= 44) {
                super.c[6] = 256;
                return;
            }

            if(var2 == 45) {
                super.c[6] = 512;
                return;
            }

            super.c[6] = 0;
        }

    }

    public final void b(Point var1) {
        super.c[7] = var1.x;
        super.c[8] = var1.y;
    }

    public final Point g() {
        return new Point(super.c[7], super.c[8]);
    }

    public final boolean a(int var1) {
        return (super.c[6] & var1) != 0;
    }
}
