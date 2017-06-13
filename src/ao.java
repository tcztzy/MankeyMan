//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class ao extends aj {
    private q a;
    private q d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;

    ao() {
        super.b = 80;
        super.c = new int[80];
        super.c[0] = 7;
    }

    public final void a() {
        this.x(4144);
        this.a = new q(0, 0);
        this.d = new q(0, 0);
        this.i = true;
        super.c[9] = 0;

        for(int var1 = 0; var1 < 16; ++var1) {
            super.c[var1 + 14] = -1;
        }

    }

    public final void c() {
        this.d = null;
        this.a = null;
    }

    public final void b_() {
        if(!this.i) {
            if(++this.g < this.f) {
                int var1 = Canvas.a(this.f, this.g, this.h);
                this.a((this.a.a << 8) + (this.d.a - this.a.a) * var1 >> 8, (this.a.b << 8) + (this.d.b - this.a.b) * var1 >> 8);
                return;
            }

            this.a(this.d.a, this.d.b);
            this.i = true;
        }

    }

    public final void b() {
        ao var1;
        int var4;
        int var9;
        var1 = this;
        b var2 = this.m();
        this.a(5, false);
        label105:
        switch(var2.c[10]) {
            case 1:
            case 5:
            default:
                break;
            case 2:
            case 3:
            case 4:
                if((var9 = 1 + Canvas.h() % 3) > super.c[9]) {
                    var9 = super.c[9];
                }

                var4 = 0;

                while(true) {
                    if(var4 >= var9) {
                        break label105;
                    }

                    var1.a(var4).r(1 + Canvas.h() % 3);
                    ++var4;
                }
            case 6:
            case 7:
                boolean var3 = this.j(14);

                for(var4 = 0; var4 < var1.c[9]; ++var4) {
                    ae var5 = var1.a(var4);
                    if((!var3 || Canvas.h() % 100 < 50) && (var5.q() < 80 || var5.q() >= 80 && Canvas.h() % 100 < 50)) {
                        var5.p(1);
                    }
                }

                boolean var6 = true;
                int var7 = var1.c[74] + 1;
                if(var7 < 0) {
                    var7 = 0;
                }

                if(var7 > 9999) {
                    var7 = 9999;
                }

                var1.c[74] = var7;
        }

        var1 = this;
        int[] var10 = new int[16];
        byte var12 = 4;
        this.a(var12, true);
        var12 = 0;
        this.a(var12, true);
        var9 = this.k();
        var4 = 0;

        int var13;
        for(var13 = 0; var13 < var1.c[9]; ++var13) {
            var4 += var1.a(var13).c[40] + 1;
        }

        var4 = var4 > var9?var9:var4;
        var1.g(var4);

        for(var13 = 0; var13 < var1.c[9]; ++var13) {
            var10[var13] = var1.a(var13).c[40] + 1;
        }

        for(var13 = 0; var13 < var1.c[9]; ++var13) {
            if(var4 > 0) {
                --var10[var13];
                --var4;
            }
        }

        for(var13 = 0; var13 < var1.c[9]; ++var13) {
            ae var11 = var1.a(var13);
            if(var10[var13] > 0) {
                if(var10[var13] <= var4) {
                    var11.n(0);
                    var4 -= var10[var13];
                } else {
                    var11.n(var10[var13] - var4);
                    var4 = 0;
                }
            }
        }

        this.l();
    }

    public final void f() {
        for(int var1 = 0; var1 < super.c[9]; ++var1) {
            this.a(var1).f();
        }

    }

    public final void g() {
        for(int var1 = 0; var1 < super.c[9]; ++var1) {
            this.a(var1).g();
        }

    }

    public final boolean a(ae var1) {
        return this.a(var1, 0);
    }

    public final boolean a(ae var1, int var2) {
        int var3;
        if((var3 = super.c[9]) < 16) {
            super.c[var3 + 14] = var1.c[1];
            ++var3;
            super.c[9] = var3;
            var1.a(this);
            int var5 = super.c[10];
            this.a(var5, true);
            this.e = var2;
            this.q();
            return true;
        } else {
            return false;
        }
    }

    public final void a(int var1, int var2) {
        super.c[4] = var1;
        super.c[5] = var2;

        for(int var3 = 0; var3 < super.c[9]; ++var3) {
            this.a(var3).b(var1, var2);
        }

    }

    public final q h() {
        return new q(super.c[4], super.c[5]);
    }

    public final void a(int var1, int var2, int var3, int var4) {
        if(var3 == 0) {
            this.a(120, var2);
        } else {
            this.a.a = super.c[4];
            this.a.b = super.c[5];
            this.d.a = 120;
            this.d.b = var2;
            this.f = var3;
            this.g = 0;
            this.h = var4;
            this.i = false;
        }
    }

    public final void b(ae var1) {
        boolean var5 = false;
        ao var6 = this;

        for(int var3 = 0; var3 < var6.c[9]; ++var3) {
            if((ae) sClass.a(var6.c[var3 + 14]) == var1) {
                var6.c[var3 + 14] = -1;

                for(var3 = var3; var3 < var6.c[9] - 1; ++var3) {
                    var6.c[var3 + 14] = var6.c[var3 + 14 + 1];
                    var6.c[var3 + 14 + 1] = -1;
                }

                --var6.c[9];
                var1.b(0, 0);
                var1.a((ao)null);
                var3 = var6.c[10];
                var6.a(var3, true);
                var6.e = 0;
                var6.q();
                return;
            }
        }

    }

    public final ae a(int var1) {
        return (ae) sClass.a(super.c[var1 + 14]);
    }

    public final ae b(int var1, int var2) {
        int var3 = 0;

        for(int var4 = 0; var4 < super.c[9]; ++var4) {
            ae var5;
            if((var5 = this.a(var4)).c[24] == var1 && var3++ == var2) {
                return var5;
            }
        }

        return null;
    }

    public final ae c(int var1, int var2) {
        int var3 = 0;

        for(int var4 = 0; var4 < super.c[9]; ++var4) {
            ae var5;
            if((var5 = this.a(var4)).c[17] == var1 && var3++ == var2) {
                return var5;
            }
        }

        return null;
    }

    public final int b(int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < super.c[9]; ++var3) {
            if(this.a(var3).c[24] == var1) {
                ++var2;
            }
        }

        return var2;
    }

    public final int c(int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < super.c[9]; ++var3) {
            if(this.a(var3).c[17] == var1) {
                ++var2;
            }
        }

        return var2;
    }

    public final int i() {
        int var1 = 0;

        for(int var2 = 0; var2 < super.c[9]; ++var2) {
            if(this.a(var2).C()) {
                ++var1;
            }
        }

        return var1;
    }

    public final void d(int var1) {
        this.d(var1, 0);
    }

    public final void d(int var1, int var2) {
        this.e = var2;
        super.c[30] = var1;
        var2 = super.c[10];
        this.a(var2, true);
        this.q();
    }

    private void q() {
        ao var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        switch(super.c[30]) {
            case 0:
                var1 = this;
                if(super.c[9] <= 0) {
                    return;
                }

                for(var2 = 0; var2 < var1.c[9]; ++var2) {
                    var1.a(var2).b(var1.h());
                }

                if(var1.c[9] == 1) {
                    var1.a(0).a(0, 0, var1.e, 2);
                } else if(var1.c[9] == 2) {
                    var1.a(0).a(-16, 0, var1.e, 2);
                    var1.a(1).a(16, 0, var1.e, 2);
                } else {
                    if(var1.c[9] != 3) {
                        var2 = 36 + (544 * var1.c[9] >> 8);
                        var3 = 12 + (544 * var1.c[9] >> 8);

                        for(var6 = 0; var6 < var1.c[9]; ++var6) {
                            var4 = Canvas.cos(var5 = -90 + (92160 / var1.c[9] * var6 >> 8)) * var2 >> 8;
                            var5 = Canvas.sin(var5) * var3 >> 8;
                            var4 += (var4 & 1) != 0?1:0;
                            var1.a(var6).a(var4, var5, var1.e, 2);
                        }

                        return;
                    }

                    var1.a(0).a(0, 0, var1.e, 2);
                    var1.a(1).a(32, 0, var1.e, 2);
                    var1.a(2).a(-32, 0, var1.e, 2);
                }
                break;
            case 1:
                var1 = this;
                if(super.c[9] > 0) {
                    for(var2 = 0; var2 < var1.c[9]; ++var2) {
                        var1.a(var2).b(var1.h());
                    }

                    if(var1.c[9] == 1) {
                        var1.a(0).a(0, 0, var1.e, 2);
                        return;
                    }

                    if(var1.c[9] == 2) {
                        var1.a(0).a(-16, 0, var1.e, 2);
                        var1.a(1).a(16, 0, var1.e, 2);
                        return;
                    }

                    if(var1.c[9] == 3) {
                        var1.a(0).a(0, 0, var1.e, 2);
                        var1.a(1).a(32, 0, var1.e, 2);
                        var1.a(2).a(-32, 0, var1.e, 2);
                        return;
                    }

                    var2 = 36 + (544 * var1.c[9] >> 8);
                    var3 = 12 + (544 * var1.c[9] >> 8);

                    for(var6 = 1; var6 < var1.c[9]; ++var6) {
                        var4 = Canvas.cos(var5 = -90 + (92160 / (var1.c[9] - 1) * (var6 - 1) >> 8)) * var2 >> 8;
                        var5 = Canvas.sin(var5) * var3 >> 8;
                        var4 += (var4 & 1) != 0?1:0;
                        var1.a(var6).a(var4, var5, var1.e, 2);
                    }

                    var1.a(0).a(0, 0, var1.e, 2);
                }
        }

    }

    public final void e(int var1) {
        this.a(var1, true);
    }

    public final void a(int var1, boolean var2) {
        super.c[10] = var1;
        if(super.c[9] > 0) {
            byte var3 = 0;
            if(var2) {
                label106: {
                    if(this.a(0).c[23] != 1) {
                        int var8 = 1;

                        while(true) {
                            if(var8 >= super.c[9]) {
                                break label106;
                            }

                            if(this.a(var8).c[23] == 1) {
                                this.h(0, var8);
                                break;
                            }

                            ++var8;
                        }
                    }

                    var3 = 1;
                }
            }

            do {
                var2 = false;

                for(int var4 = var3; var4 < super.c[9] - 1; ++var4) {
                    ae var5 = this.a(var4);
                    ae var6 = this.a(var4 + 1);
                    boolean var7 = false;
                    switch(var1) {
                        case 0:
                            if(var5.c[18] > var6.c[18]) {
                                var7 = true;
                            } else if(var5.c[18] == var6.c[18] && var5.c[1] < var6.c[1]) {
                                var7 = true;
                            }
                            break;
                        case 1:
                            if(var5.c[18] < var6.c[18]) {
                                var7 = true;
                            } else if(var5.c[18] == var6.c[18] && var5.c[1] > var6.c[1]) {
                                var7 = true;
                            }
                            break;
                        case 2:
                            if(var5.c[24] > var6.c[24]) {
                                var7 = true;
                            } else if(var5.c[24] == var6.c[24] && var5.c[1] > var6.c[1]) {
                                var7 = true;
                            }
                            break;
                        case 3:
                            if(var5.c[17] < var6.c[17]) {
                                var7 = true;
                            } else if(var5.c[17] == var6.c[17] && var5.c[1] > var6.c[1]) {
                                var7 = true;
                            }
                            break;
                        case 4:
                            if(var5.c[17] > var6.c[17]) {
                                var7 = true;
                            } else if(var5.c[17] == var6.c[17] && var5.c[1] > var6.c[1]) {
                                var7 = true;
                            }
                            break;
                        case 5:
                            if(var5.q() > var6.q()) {
                                var7 = true;
                            } else if(var5.q() == var6.q() && var5.c[1] > var6.c[1]) {
                                var7 = true;
                            }
                    }

                    if(var7) {
                        this.h(var4, var4 + 1);
                        var2 = true;
                    }
                }
            } while(var2);
        }

    }

    private void h(int var1, int var2) {
        int var3 = super.c[var1 + 14];
        super.c[var1 + 14] = super.c[var2 + 14];
        super.c[var2 + 14] = var3;
    }

    public final ae j() {
        for(int var1 = 0; var1 < super.c[9]; ++var1) {
            ae var2;
            if((var2 = this.a(var1)).c[23] == 1) {
                return var2;
            }
        }

        return null;
    }

    public final void f(int var1) {
        if(var1 > 0) {
            int var2;
            if((var2 = this.k()) + var1 >= 999) {
                var1 = 999 - var2;
            }

            super.c[31] += var1;
        }

    }

    public final void g(int var1) {
        if(var1 > 0) {
            for(int var2 = 0; var2 < 9; ++var2) {
                int var3;
                if((var3 = super.c[39 - var2]) >= var1) {
                    super.c[39 - var2] = var3 - var1;
                    return;
                }

                var1 -= var3;
                super.c[39 - var2] = 0;
            }
        }

    }

    public final void h(int var1) {
        if(var1 > 0) {
            super.c[41] += var1;
            if(super.c[41] > 999) {
                super.c[41] = 999;
            }
        }

    }

    public final void i(int var1) {
        if(var1 > 0) {
            super.c[41] -= var1;
            if(super.c[41] < 0) {
                super.c[41] = 0;
            }
        }

    }

    public final int k() {
        int var1 = 0;

        for(int var2 = 0; var2 < 9; ++var2) {
            var1 += super.c[var2 + 31];
        }

        return var1;
    }

    public final void l() {
        int var1;
        int var2;
        for(var1 = 0; var1 < 8; ++var1) {
            var2 = super.c[38 - var1];
            super.c[38 - var1] = 0;
            super.c[38 - var1 + 1] = var2;
        }

        var1 = this.j(0)?8:5;
        var2 = 0;

        for(; var1 < 9; ++var1) {
            var2 += super.c[var1 + 31];
            super.c[var1 + 31] = 0;
        }

        super.c[40] = var2;
        super.c[76] += var2;
    }

    public final boolean j(int var1) {
        return (super.c[11 + var1 / 16] & 1 << var1 % 16) != 0;
    }

    public final void a(b var1) {
        super.c[13] = var1.c[1];
    }

    public final b m() {
        return (b) sClass.a(super.c[13]);
    }

    public final int n() {
        int var1 = super.c[12];
        byte var2 = 0;
        if((var1 & 1) != 0) {
            var2 = 1;
        }

        if((var1 & 2) != 0) {
            var2 = 2;
        }

        if((var1 & 4) != 0) {
            var2 = 3;
        }

        if((var1 & 8) != 0) {
            var2 = 4;
        }

        if((var1 & 16) != 0) {
            var2 = 5;
        }

        if((var1 & 32) != 0) {
            var2 = 6;
        }

        if((var1 & 64) != 0) {
            var2 = 7;
        }

        if((var1 & 128) != 0) {
            var2 = 8;
        }

        if((var1 & 256) != 0) {
            var2 = 9;
        }

        if((var1 & 512) != 0) {
            var2 = 10;
        }

        if((var1 & 1024) != 0) {
            var2 = 11;
        }

        if((var1 & 2048) != 0) {
            var2 = 12;
        }

        return var2;
    }

    public final int o() {
        int var1 = 0;
        int var2 = 0;

        for(int var3 = 0; var3 < super.c[9]; ++var3) {
            ae var4;
            if((var4 = this.a(var3)).c[41] == 0 && var4.n() >= 2 && var4.n() <= 4) {
                var1 += var4.o();
                ++var2;
            }
        }

        if(var2 == 0) {
            return 0;
        } else {
            return var1 / var2;
        }
    }

    public final int k(int var1) {
        if(var1 != 8) {
            return super.c[var1 + 42];
        } else {
            var1 = 0;

            for(int var2 = 0; var2 < 8; ++var2) {
                var1 += super.c[var2 + 42];
            }

            return var1;
        }
    }

    public final void e(int var1, int var2) {
        if(var2 < 0) {
            var2 = 0;
        }

        if(var2 > 1) {
            var2 = 1;
        }

        super.c[var1 + 50] = var2;
    }

    public final void f(int var1, int var2) {
        if(var2 < 0) {
            var2 = 0;
        }

        if(var2 > 1) {
            var2 = 1;
        }

        super.c[var1 + 58] = var2;
    }

    final int getDeath(int cause) {
        return cause > 0 ? super.c[66 + (cause - 1)]:0;
    }

    public final boolean p() {
        int var1 = this.m().c[9];
        int var2 = 0;
        if(this.j(5)) {
            var2 -= 3;
        }

        if(this.j(1)) {
            var2 -= 3;
        }

        if(this.j(2)) {
            var2 -= 5;
        }

        if(this.j(12)) {
            var2 -= 5;
        }

        return var1 - var2 >= 15 && var1 <= 35;
    }

    public final void g(int var1, int var2) {
        if(var2 < 0) {
            var2 = 0;
        }

        if(var2 > 9999) {
            var2 = 9999;
        }

        super.c[var1 + 72] = var2;
    }

    final int getPopulation(int gender) {
        return gender == 2 ? super.c[72] + super.c[73] : super.c[gender + 72];
    }
}
