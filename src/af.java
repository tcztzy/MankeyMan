//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class af extends aa {
    private ao a;
    private ae b;
    private d[] c;
    private q d;
    private int e;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;

    af() {
    }

    public final boolean a() {
        this.i(1280);
        this.a = null;
        this.b = null;
        this.g = false;
        this.e = 0;
        this.i = 0;
        this.h = 0;
        this.k = 0;
        this.d = new q(0, 0);
        this.c = new d[3];
        Canvas.a(this.c);
        this.c[0].a(163, 0, new z(13, 0, 12, 15));
        this.c[0].setFlag2(false);
        this.c[1].a(163, 0, new z(25, 0, 12, 15));
        this.c[1].setFlag2(false);
        this.c[2].a(163, 0, new z(67, 0, 15, 15));
        this.c[2].setFlag2(false);
        return true;
    }

    public final void b() {
        Canvas.b(this.c);
        this.c = null;
        this.d = null;
    }

    public final void c() {
        this.j = this.n();
        if(this.o() == 1) {
            this.i();
        }

    }

    public final void a(ao var1) {
        this.a(var1, 0);
    }

    public final void a(ao var1, int var2) {
        this.a = var1;
        this.h = var2;
        this.k = 0;
        this.h(1);
    }

    public final void d() {
        this.k = 1;
        this.g(0);
        this.i();
    }

    public final void e() {
        this.k = 2;
        this.g(0);
        this.i();
    }

    public final void f() {
        this.a(true);
    }

    public final void a(boolean var1) {
        this.g = false;
        this.c[0].setFlag2(false);
        this.c[1].setFlag2(false);
        this.c[2].setFlag2(false);
        if(var1) {
            this.a.a(this.e).c(256, 256);
        }

        this.h(0);
    }

    public final ae g() {
        return this.b;
    }

    public final boolean h() {
        return this.g;
    }

    private void i() {
        this.g = this.j == 0;

        int var1 = 0;
        switch(this.h) {
            case 0:
                ao var4 = this.a;
                var1 = this.a.c[9];
                break;
            case 1:
                var1 = this.a.c(0);
                break;
            case 2:
                var1 = this.a.c(1);
        }

        int var2 = this.e;
        if(!Canvas.e(196608) && this.k != 2) {
            if(Canvas.e(786432) || this.k == 1) {
                ++this.e;
                this.g = true;
            }
        } else {
            --this.e;
            this.g = true;
        }

        if(this.g) {
            aiClass.b(8);
            if(this.e < 0) {
                this.e = var1 - 1;
            }

            if(this.e >= var1) {
                this.e = 0;
            }

            ae var6 = null;
            switch(this.h) {
                case 0:
                    var6 = this.a.a(var2);
                    break;
                case 1:
                    var6 = this.a.c(0, var2);
                    break;
                case 2:
                    var6 = this.a.c(1, var2);
            }

            var6.c(256, 256);
            switch(this.h) {
                case 0:
                    var6 = this.a.a(this.e);
                    break;
                case 1:
                    var6 = this.a.c(0, this.e);
                    break;
                case 2:
                    var6 = this.a.c(1, this.e);
            }

            var6.c(512, 512);
            q var5 = var6.j();
            q var3 = var6.i();
            this.d.a = var5.a + var3.a;
            this.d.b = var5.b + var3.b;
            this.b = var6;
            this.i = 0;
        }

        if(this.k == 0) {
            var1 = Canvas.sin(18 * (this.i % 6)) << 3 >> 8;
            this.c[0].f(this.d.a - 32 - var1 + 16, this.d.b - 32);
            this.c[1].f(this.d.a + 32 + var1 - 16, this.d.b - 32);
            this.c[2].f(this.d.a + 32 - 16 - 17, this.d.b - 32 - 22 + var1);
            this.c[0].setFlag2(true);
            this.c[1].setFlag2(true);
            this.c[2].setFlag2(true);
            ++this.i;
        } else {
            this.k = 0;
        }
    }
}
