//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class ah extends aj {
    private d[] a;
    private r d;
    private boolean e;
    private q f;
    private q g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private static int[] l;
    private static int[] m;
    private static final ImageSize[] n;

    static {
        int[] var10000 = new int[]{2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        l = new int[]{135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 153, 154, 155, 156, 157, 158, 150, 151, 152};
        m = new int[]{100, 56, 10, 6, 1, 8, 2, 72, 8, 10, 2, 2, 0, 4, 1, 12, 800, 300, 160, 30, 6, 50, 12, 500, 48, 36, 24, 4, 2, 8, 4, 48, 60, 50, 40, 30, 30, 30, 30, 70, 2, 2, 1, 1, 0, 0, 0, 2, 19, 15, 27, 20, 20, -1, -1, 28};
        n = new ImageSize[]{new ImageSize(90, 90), new ImageSize(70, 70), new ImageSize(60, 60), new ImageSize(50, 50), new ImageSize(50, 50), new ImageSize(55, 55), new ImageSize(50, 50), new ImageSize(100, 100)};
    }

    ah(int var1) {
        super.b = 17;
        super.c = new int[17];
        this.f = new q(0, 0);
        this.g = new q(0, 0);
        super.c[0] = 4;
        super.c[11] = var1;
    }

    public final void a() {
        this.k = true;
        this.e = true;
        this.a = new d[6];

        int var1;
        for(var1 = 0; var1 < 6; ++var1) {
            this.a[var1] = Canvas.a(new d());
            this.a[var1].setFlagTrue(1073741824);
        }

        this.d = (r) Canvas.a(new r(0));
        this.d.setFlagTrue(1073741824);
        this.d.setFlag2(false);
        var1 = super.c[11];
        super.c[15] = m[var1] - m[var1 + 8] + Canvas.h() % (1 + (m[var1 + 8] << 1));
        super.c[13] = m[var1 + 16] - m[var1 + 24] + Canvas.h() % (1 + (m[var1 + 24] << 1));
        super.c[14] = super.c[13];
        super.c[9] = m[var1 + 32];
        this.a(0);
    }

    public final void c() {
        this.d.i();

        for(int var1 = 0; var1 < 6; ++var1) {
            this.a[var1].i();
        }

        this.a = null;
    }

    public final void b_() {
        if(!this.k) {
            if(++this.i < this.h) {
                int var1 = Canvas.a(this.h, this.i, this.j);
                this.a((this.f.a << 8) + (this.g.a - this.f.a) * var1 >> 8, (this.f.b << 8) + (this.g.b - this.f.b) * var1 >> 8);
                return;
            }

            this.a(this.g.a, this.g.b);
            this.k = true;
        }

    }

    public final void a(int var1, int var2) {
        super.c[5] = var1;
        super.c[6] = var2;
        int var3 = super.c[7];
        int var4 = super.c[8];
        this.a[0].f(var3 + var1, var4 + var2);
        this.a[0].g(24576 - (var4 + var2) * 10);
        this.r();
        this.s();
    }

    public final q f() {
        return new q(super.c[5], super.c[6]);
    }

    public final void b(int var1, int var2) {
        super.c[7] = var1;
        super.c[8] = var2;
        this.a(super.c[5], super.c[6]);
    }

    public final q g() {
        return new q(super.c[7], super.c[8]);
    }

    public final q h() {
        return new q(super.c[7] + super.c[5], super.c[8] + super.c[6]);
    }

    public final void a(int var1, int var2, int var3, int var4) {
        if(var3 == 0) {
            this.a(var1, var2);
        } else {
            this.f.a = super.c[5];
            this.f.b = super.c[6];
            this.g.a = var1;
            this.g.b = var2;
            this.h = var3;
            this.i = 0;
            this.j = var4;
            this.k = false;
        }
    }

    public final int i() {
        return super.c[11];
    }

    public final void a(int var1) {
        super.c[12] = var1;
        this.a[0].e(l[super.c[11] * 3 + super.c[12]], Canvas.h() % 3);
    }

    public final void j() {
        this.e = true;

        for(int var1 = 0; var1 < 6; ++var1) {
            this.a[var1].setFlag2(true);
        }

        this.r();
        this.s();
    }

    public final void k() {
        this.e = false;

        for(int var1 = 0; var1 < 6; ++var1) {
            this.a[var1].setFlag2(false);
        }

        this.r();
        this.s();
    }

    public final void b(int var1) {
        super.c[10] = var1;
        this.r();
        this.s();
    }

    public final void c(int var1) {
        for(int var2 = 0; var2 < 6; ++var2) {
            this.a[var2].g(var1);
        }

    }

    public final int l() {
        return this.a[0].j();
    }

    private void r() {
        q var1 = this.h();
        this.d.f(var1.a, var1.b + 4);
        this.d.e(super.c[13]);
        this.d.d(super.c[14]);
        this.d.g(20480);
        this.d.setFlag2(super.c[10] == 0?false:this.e);
    }

    public final int m() {
        return super.c[15];
    }

    public final void d(int var1) {
        int var2 = super.c[13];
        if(var1 < 0) {
            var1 = 0;
        }

        if(var1 > var2) {
            var1 = var2;
        }

        super.c[14] = var1;
        this.r();
        this.s();
    }

    public final void e(int var1) {
        this.d(super.c[14] + var1);
    }

    public final ImageSize n() {
        return new ImageSize(n[super.c[11]]);
    }

    public final int o() {
        return super.c[9];
    }

    public final int p() {
        return m[40 + super.c[11]];
    }

    public final void q() {
        if(m[48 + super.c[11]] != -1) {
            aiClass.b(m[48 + super.c[11]]);
        }

    }

    private void s() {
        int var1 = super.c[14];
        byte var2 = 1;
        int var3 = 1;
        if(var1 >= 1000) {
            var2 = 4;
            var3 = 1000;
        } else if(var1 >= 100) {
            var2 = 3;
            var3 = 100;
        } else if(var1 >= 10) {
            var2 = 2;
            var3 = 10;
        }

        q var4 = this.h();

        int var5;
        for(var5 = 0; var5 < 4; ++var5) {
            this.a[var5 + 2].setFlag2(false);
        }

        for(var5 = 0; var5 < var2; var3 /= 10) {
            int var6 = var1 / var3;
            var1 -= var6 * var3;
            this.a[var5 + 2].a(147, 1, new z(var6 << 3, 0, 8, 10));
            this.a[var5 + 2].f(var4.a - (var2 << 3) / 2 + (var5 << 3) + 5, var4.b + 8);
            this.a[var5 + 2].g(20480);
            this.a[var5 + 2].setFlag2(super.c[10] == 0?false:this.e);
            ++var5;
        }

        this.a[1].a(147, 1, new z(99, 0, 11, 10));
        this.a[1].f(var4.a - (var2 << 3) / 2 - 6, var4.b + 8);
        this.a[1].g(20480);
        this.a[1].setFlag2(super.c[10] == 0?false:this.e);
    }
}
