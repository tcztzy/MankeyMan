//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class aClass extends DataStoreBase {
    private ao a;
    private d[] b;
    private int d;
    private int e;
    private int g;
    private int h;
    private int i;
    private int[] j;
    private Point k;
    private static final z[] l = new z[]{new z(20, 0, 20, 20), new z(40, 0, 20, 20), new z(120, 0, 20, 20), new z(140, 0, 20, 20)};

    aClass(int var1) {
        this.i = var1;
    }

    public final boolean a() {
        this.i(1664);
        this.k = new Point();
        this.j = new int[4];
        this.d = 0;
        this.g = 0;
        this.h = -1;
        this.b = new d[6];
        MankeyManCanvas.a(this.b);
        this.b[4].a(163, 0, new z(13, 0, 12, 15));
        this.b[4].g(8192);
        this.b[4].setFlag2(false);
        this.b[5].a(163, 0, new z(25, 0, 12, 15));
        this.b[5].g(8192);
        this.b[5].setFlag2(false);
        return true;
    }

    public final void b() {
        MankeyManCanvas.b(this.b);
        this.b = null;
        this.j = null;
        this.k = null;
    }

    public final void c() {
        int c = this.getC();
        int var1;
        int var2;
        int var3;
        switch(this.getD()) {
            case 1:
                if(c == 0) {
                    var1 = this.k.x - 10 * (this.d - 1);
                    var2 = this.k.y;

                    for(var3 = 0; var3 < this.d; ++var3) {
                        this.b[var3].a(var1 + var3 * 20, var2, 4, 2);
                        this.b[var3].setFlag2(true);
                    }

                    this.b[4].setFlag2(false);
                    this.b[5].setFlag2(false);
                    return;
                }
                break;
            case 2:
                var1 = this.e;
                var2 = this.k.x - 10 * (this.d - 1);
                var3 = this.k.y;
                boolean var4 = false;
                if(c == 0) {
                    for(var1 = 0; var1 < this.d; ++var1) {
                        this.b[var1].f(var2 + var1 * 20, var3);
                        this.b[var1].setFlag2(true);
                    }

                    var4 = true;
                } else if(this.i == 0) {
                    if(MankeyManCanvas.d(262144)) {
                        ++this.e;
                        var4 = true;
                    }

                    if(MankeyManCanvas.d(65536)) {
                        --this.e;
                        var4 = true;
                    }
                } else if(this.i == 1) {
                    if(c % 4 == 0) {
                        this.e += MankeyManCanvas.random() % 100 > 50?1:0;
                        if(this.e < 0) {
                            this.e = this.d - 1;
                        }

                        if(this.e >= this.d) {
                            this.e = 0;
                        }
                    }

                    if(var1 != this.e) {
                        var4 = true;
                    }
                }

                if(var4) {
                    MankeyManRecordStore.b(8);
                    if(this.e < 0) {
                        this.e = this.d - 1;
                    }

                    if(this.e >= this.d) {
                        this.e = 0;
                    }

                    for(var1 = 0; var1 < this.d; ++var1) {
                        int var8 = var1 == this.e?512:256;
                        this.b[var1].setEnd(var8, var8);
                        this.b[var1].a(var2 + var1 * 20, var3, 2, 2);
                        this.b[var1].g(8192 - (var1 == this.e?1:0));
                    }
                }

                var1 = MankeyManCanvas.sin(18 * (this.g % 6)) << 3 >> 8;
                this.b[4].f(this.k.x - this.d * 10 - var1 - 20, this.k.y);
                this.b[4].setFlag2(true);
                this.b[5].f(this.k.x + this.d * 10 + var1 + 20, this.k.y);
                this.b[5].setFlag2(true);
                ++this.g;
                return;
            case 3:
                if(c == 0) {
                    for(var1 = 0; var1 < this.d; ++var1) {
                        if(var1 != this.e) {
                            this.b[var1].setFlag2(false);
                        }
                    }

                    d var10000 = this.b[this.e];
                    Point var7 = this.k;
                    var10000.a(var7.x, var7.y, 4, 2);
                    this.b[4].setFlag2(false);
                    this.b[5].setFlag2(false);
                    return;
                }
                break;
            case 4:
                if(c == 0) {
                    for(var1 = 0; var1 < this.d; ++var1) {
                        this.b[var1].a(120, 120, 3, 1);
                    }

                    return;
                }

                if(c == 3) {
                    for(var1 = 0; var1 < 6; ++var1) {
                        this.b[var1].setFlag2(false);
                    }

                    this.h(0);
                }
        }

    }

    public final void a(ao var1) {
        this.a = var1;
        this.h = -1;
        this.h();
        this.h(1);
    }

    public final void d() {
        this.a(-1);
    }

    public final void a(int var1) {
        this.h = var1;
        this.e = 0;
        this.h();
        this.h(2);
    }

    public final void e() {
        this.h(4);
    }

    public final void f() {
        this.h(3);
    }

    public final void a(int var1, int var2) {
        this.k.x = 120;
        this.k.y = var2;
    }

    private void h() {
        this.d = 0;
        if(this.a.k() >= 20 && this.h != 0) {
            this.j[this.d++] = 0;
        }

        if(this.a.c[41] >= 30 && this.h != 1) {
            this.j[this.d++] = 1;
        }

        if(this.a.c(0) >= 2 && this.h != 2) {
            this.j[this.d++] = 2;
        }

        if(this.a.c(1) >= 2 && this.h != 3) {
            this.j[this.d++] = 3;
        }

        int var1;
        for(var1 = 0; var1 < this.d; ++var1) {
            this.b[var1].a(4, 0, l[this.j[var1]]);
            this.b[var1].f(120, 120);
            this.b[var1].setFlag2(false);
            this.b[var1].setEnd(256, 256);
            this.b[var1].g(8192);
        }

        for(var1 = this.d; var1 < 4; ++var1) {
            this.b[var1].a(-1);
            this.b[var1].setFlag2(false);
        }

    }

    public final int g() {
        return this.j[this.e];
    }
}
