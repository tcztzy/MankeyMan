//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class t extends aj {
    private d[] a;
    private r d;
    private q e;
    private q f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;

    public t() {
        super.b = 19;
        super.c = new int[19];
        super.c[0] = 3;
    }

    public final void a() {
        this.j = true;
        this.k = true;
        this.e = new q(0, 0);
        this.f = new q(0, 0);
        this.a = new d[4];

        int var1;
        for(var1 = 0; var1 < 4; ++var1) {
            this.a[var1] = Canvas.a(new d());
            this.a[var1].setFlagTrue(1073741824);
        }

        this.d = (r) Canvas.a(new r(0));
        this.d.setFlagTrue(1073741824);
        this.d.setFlag2(false);
        super.c[10] = 0;

        for(var1 = 0; var1 < 8; ++var1) {
            super.c[var1 + 11] = -1;
        }

    }

    public final void c() {
        this.d.i();

        for(int var1 = 0; var1 < 4; ++var1) {
            this.a[var1].i();
        }

        this.a = null;
        this.e = null;
        this.f = null;
    }

    public final void b_() {
        if(!this.j) {
            if(++this.h < this.g) {
                int var1 = Canvas.a(this.g, this.h, this.i);
                this.a((this.e.a << 8) + (this.f.a - this.e.a) * var1 >> 8, (this.e.b << 8) + (this.f.b - this.e.b) * var1 >> 8);
                return;
            }

            this.a(this.f.a, this.f.b);
            this.j = true;
        }

    }

    public final void a(int var1, int var2) {
        super.c[5] = var1;
        super.c[6] = var2;

        for(int var3 = 0; var3 < super.c[10]; ++var3) {
            this.b(var3).b(var1, var2);
        }

        this.m();
        this.n();
    }

    public final q e() {
        return new q(super.c[5], super.c[6]);
    }

    public final q f() {
        return new q(super.c[7] + super.c[5], super.c[8] + super.c[6]);
    }

    public final void a(int var1, int var2, int var3, int var4) {
        this.e.a = super.c[5];
        this.e.b = super.c[6];
        this.f.a = var1;
        this.f.b = var2;
        this.g = 8;
        this.h = 0;
        this.i = var4;
        this.j = false;
    }

    public final void g() {
        q var2 = this.f;
        this.a(var2.a, var2.b);
        this.j = true;
    }

    public final void a(int var1) {
        super.c[4] = var1;

        for(int var2 = 0; var2 < super.c[10]; ++var2) {
            this.b(var2).b(var1);
        }

        this.m();
        this.n();
    }

    public final boolean a(ah var1) {
        int var2;
        if((var2 = super.c[10]) < 8) {
            super.c[var2 + 11] = var1.c[1];
            ++var2;
            super.c[10] = var2;
            this.l();
            return true;
        } else {
            return false;
        }
    }

    public final void h() {
        int var1 = 0;

        int var2;
        for(var2 = 0; var2 < super.c[10]; ++var2) {
            if(((ah) sClass.a(super.c[var2 + 11])).c[14] == 0) {
                super.c[var2 + 11] = -1;
                ++var1;
            }
        }

        if(var1 > 0) {
            for(var2 = 0; var2 < super.c[10] - 1; ++var2) {
                if(super.c[var2 + 11] == -1) {
                    for(int var3 = var2 + 1; var3 < super.c[10]; ++var3) {
                        if(super.c[var3 + 11] != -1) {
                            super.c[var2 + 11] = super.c[var3 + 11];
                            super.c[var3 + 11] = -1;
                            break;
                        }
                    }
                }
            }

            super.c[10] -= var1;
        }

        this.l();
    }

    public final ah b(int var1) {
        return (ah) sClass.a(super.c[var1 + 11]);
    }

    public final int i() {
        int var1 = 0;

        for(int var2 = 0; var2 < super.c[10]; ++var2) {
            var1 += this.b(var2).c[14];
        }

        return var1;
    }

    private void l() {
        if(super.c[10] > 0) {
            ImageSize var1 = this.b(0).n();
            q var2 = new q(super.c[7], super.c[8]);
            q var3 = this.e();
            int var4 = super.c[10];

            int var5;
            for(var5 = 0; var5 < var4; ++var5) {
                this.b(var5).b(var2.a + var3.a, var2.b + var3.b);
            }

            if(var4 == 1) {
                this.b(0).a(0, 0);
                super.c[9] = this.b(0).o();
                return;
            }

            if(var4 == 2) {
                this.b(0).a(var1.width / 2, -8);
                this.b(1).a(-var1.width / 2, 0);
                super.c[9] = this.b(0).o() + var1.width / 2;
                return;
            }

            var5 = var1.width * 160 >> 8;
            int var6 = var1.height * 160 >> 8;

            for(int var7 = 0; var7 < var4; ++var7) {
                int var8 = 92160 / var4 * var7 >> 8;
                this.b(var7).a(Canvas.cos(var8) * var5 >> 8, Canvas.sin(var8) * var6 >> 8);
            }

            super.c[9] = this.b(0).o() + var5;
        }

    }

    public final void j() {
        this.k = true;

        for(int var1 = 0; var1 < super.c[10]; ++var1) {
            this.b(var1).j();
        }

        this.m();
        this.n();
    }

    public final void k() {
        this.k = false;

        for(int var1 = 0; var1 < super.c[10]; ++var1) {
            this.b(var1).k();
        }

        this.m();
        this.n();
    }

    private void m() {
        q var1 = this.f();
        this.d.f(var1.a, var1.b + 4);
        r var10000 = this.d;
        t var4 = this;
        int var2 = 0;

        for(int var3 = 0; var3 < var4.c[10]; ++var3) {
            var2 += var4.b(var3).c[13];
        }

        var10000.e(var2);
        this.d.d(this.i());
        this.d.g(20480);
        this.d.setFlag2(super.c[4] == 0?this.k:false);
    }

    private void n() {
        t var1 = this;
        int var2 = 0;

        int var3;
        for(var3 = 0; var3 < var1.c[10]; ++var3) {
            var2 += var1.b(var3).m();
        }

        int var7 = var2;
        byte var8 = 1;
        var3 = 1;
        if(var2 >= 100) {
            var8 = 3;
            var3 = 100;
        } else if(var2 >= 10) {
            var8 = 2;
            var3 = 10;
        }

        q var4 = this.f();

        int var5;
        for(var5 = 0; var5 < 3; ++var5) {
            this.a[var5 + 1].setFlag2(false);
        }

        for(var5 = 0; var5 < var8; var3 /= 10) {
            int var6 = var7 / var3;
            var7 -= var6 * var3;
            this.a[var5 + 1].a(147, 1, new z(var6 << 3, 0, 8, 10));
            this.a[var5 + 1].f(var4.a - (var8 << 3) / 2 + (var5 << 3) + 5, var4.b + 8);
            this.a[var5 + 1].g(20480);
            this.a[var5 + 1].setFlag2(super.c[4] == 0?this.k:false);
            ++var5;
        }

        this.a[0].a(147, 1, new z(88, 0, 11, 10));
        this.a[0].f(var4.a - (var8 << 3) / 2 - 6, var4.b + 8);
        this.a[0].g(20480);
        this.a[0].setFlag2(super.c[4] == 0?this.k:false);
    }
}
