//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class o extends aj {
    private d[] a;
    private static z[] d = new z[]{new z(0, 60, 20, 20), new z(20, 60, 20, 20), new z(40, 60, 20, 20), new z(60, 60, 20, 20), new z(80, 60, 20, 20), new z(100, 60, 20, 20), new z(120, 60, 20, 20), new z(140, 60, 20, 20)};

    public o(int var1) {
        super.b = 11;
        super.c = new int[11];
        super.c[0] = 5;
        super.c[8] = var1;
        super.c[10] = 9;
    }

    public final void a() {
        this.a = new d[1];

        for(int var1 = 0; var1 <= 0; ++var1) {
            this.a[0] = Canvas.a(new d());
        }

        this.a[0].a(2, 8, d[super.c[8]]);
        this.f();
        this.a(0, 0);
    }

    public final void c() {
        for(int var1 = 0; var1 <= 0; ++var1) {
            this.a[0].i();
        }

        this.a = null;
    }

    public final void b_() {
    }

    public final void a(int var1, int var2) {
        super.c[4] = var1;
        super.c[5] = var2;
        int var3 = super.c[6];
        int var4 = super.c[7];
        this.a[0].f(var3 + var1, var4 + var2);
        this.a[0].g(24576 - (var4 + var2) * 10);
    }

    public final q e() {
        return new q(super.c[4], super.c[5]);
    }

    public final void f() {
        this.a[0].setFlag2(true);
    }
}
