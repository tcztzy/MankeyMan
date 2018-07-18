//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class e extends DataStoreBase {
    private d[] a;
    private ae b;
    private int c;
    private int[] d;
    private int e;
    private int g;
    private int h;
    private int i;
    private int j;
    private Point k;
    private Point l;
    private static z[] m = new z[]{new z(0, 0, 20, 20), new z(20, 0, 20, 20), new z(40, 0, 20, 20), new z(60, 0, 20, 20), new z(80, 0, 20, 20), new z(100, 0, 20, 20), new z(160, 0, 20, 20), new z(40, 0, 20, 20), new z(60, 0, 20, 20), new z(80, 0, 20, 20)};

    e() {
    }

    public final boolean a() {
        this.i(513);
        this.g = 0;
        this.e = 0;
        this.i = 0;
        this.d = new int[5];
        this.l = new Point(0, 0);
        this.k = new Point(0, 0);
        this.a = new d[8];
        MankeyManCanvas.a(this.a);
        this.a[5].a(163, 0, new z(13, 0, 12, 15));
        this.a[6].a(163, 0, new z(25, 0, 12, 15));
        this.a[7].a(163, 0, new z(67, 0, 15, 15));
        this.a[5].setFlag2(false);
        this.a[6].setFlag2(false);
        this.a[7].setFlag2(false);
        return true;
    }

    public final void b() {
        MankeyManCanvas.b(this.a);
        this.a = null;
        this.d = null;
    }

    public final void c() {
        this.j = 0;
        this.c = this.getC();
        e var1;
        int var3;
        int var4;
        int var5;
        int var6;
        switch(this.getD()) {
            case 1:
                var1 = this;

                for(var6 = 0; var6 < 7; ++var6) {
                    var1.a[var6].setFlag2(false);
                }

                var6 = var1.k.x - 10 * (var1.e - 1);
                var3 = var1.k.y - 76;

                for(var4 = 0; var4 < var1.e; ++var4) {
                    var1.a[var4].a(4, 0, m[var1.h * 5 + var1.d[var4]]);
                    var1.a[var4].f(var6 + var1.g * 20, var3);
                    var1.a[var4].a(var6 + var4 * 20, var3 + 21 - 13, 4, 2);
                    var1.a[var4].setFlag2(true);
                    var5 = var4 == var1.g?512:256;
                    var1.a[var4].setEnd(var5, var5);
                    var1.a[var4].g(8192 - (var4 == var1.g?1:0));
                }

                for(var4 = var1.e; var4 < 5; ++var4) {
                    var1.a[var4].a(-1);
                    var1.a[var4].setFlag2(false);
                }

                var1.h(3);
                return;
            case 2:
                var1 = this;
                if(this.c != 0) {
                    if(this.c == 3) {
                        for(var6 = 0; var6 < var1.e; ++var6) {
                            var1.a[var6].setFlag2(false);
                        }

                        var1.h(0);
                    }

                    return;
                }

                var6 = this.k.x - 10 * (this.e - 1);
                var3 = this.k.y - 76;

                for(var4 = 0; var4 < var1.e; ++var4) {
                    var1.a[var4].a(var6 + var1.g * 20, var3 + 21 - 13, 2, 1);
                }

                return;
            case 3:
                var1 = this;
                boolean var2 = false;
                if(MankeyManCanvas.e(262144)) {
                    ++this.g;
                    var2 = true;
                } else if(MankeyManCanvas.e(65536)) {
                    --this.g;
                    var2 = true;
                } else if(MankeyManCanvas.e(131072)) {
                    this.j = 1;
                } else if(MankeyManCanvas.e(524288)) {
                    this.j = 2;
                }

                if(var2) {
                    MankeyManRecordStore.b(8);
                    if(this.g < 0) {
                        this.g = this.e - 1;
                    }

                    if(this.g >= this.e) {
                        this.g = 0;
                    }

                    var3 = this.k.x - 10 * (this.e - 1);
                    var4 = this.k.y - 76;

                    for(var5 = 0; var5 < var1.e; ++var5) {
                        var6 = var5 == var1.g?512:256;
                        var1.a[var5].setEnd(var6, var6);
                        var1.a[var5].a(var3 + var5 * 20, var4 + 21 - 13, 2, 2);
                        var1.a[var5].g(8192 - (var5 == var1.g?1:0));
                    }

                    var1.b.l(var1.d[var1.g]);
                }

                var1.l.x = var1.k.x;
                var1.l.y = var1.k.y - 77;
                var6 = MankeyManCanvas.sin(18 * (var1.i % 6)) << 3 >> 8;
                var1.a[5].f(var1.l.x - var1.e * 10 - 15 - var6 + 8, var1.l.y + 21 - 13);
                var1.a[6].f(var1.l.x + var1.e * 10 + 15 + var6 - 8, var1.l.y + 21 - 13);
                var1.a[7].f(var1.l.x + 32 - 16 - 17, var1.l.y + var6 + 21);
                var1.a[5].setFlag2(true);
                var1.a[6].setFlag2(true);
                var1.a[7].setFlag2(true);
                ++var1.i;
        }

    }

    public final void a(ae var1, int var2) {
        this.b = var1;
        this.h = var2;
        this.k = this.b.k();
        this.e = 0;
        if(this.b.m(0)) {
            this.d[this.e++] = 0;
        }

        if(this.b.m(1)) {
            this.d[this.e++] = 1;
        }

        if(this.b.m(2)) {
            this.d[this.e++] = 2;
        }

        if(this.b.m(3)) {
            this.d[this.e++] = 3;
        }

        if(this.b.m(4)) {
            this.d[this.e++] = 4;
        }

        int var3;
        for(var3 = 0; var3 < this.e; ++var3) {
            if(this.d[var3] == this.b.c[24]) {
                this.g = var3;
                break;
            }
        }

        for(var3 = 0; var3 < 5; ++var3) {
            this.a[var3].k();
            this.a[var3].f(this.k.x, this.k.y - 32);
            this.a[var3].setFlag2(false);
        }

        this.a[5].setFlag2(false);
        this.a[6].setFlag2(false);
        this.a[7].setFlag2(false);
        this.h(1);
    }

    public final void d() {
        if(this.getD() != 3) {
            for(int var1 = 0; var1 < this.e; ++var1) {
                this.a[var1].setFlag2(false);
            }
        }

        this.a[5].setFlag2(false);
        this.a[6].setFlag2(false);
        this.a[7].setFlag2(false);
        this.h(2);
    }

    public final int e() {
        return this.d[this.g];
    }

    public final int f() {
        return this.j;
    }
}
