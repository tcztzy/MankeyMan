//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class p extends DataStoreBase {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Point e;
    private Point g;
    private d[] h;
    private at[] i;
    private Point j;
    private Point k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private static int[] w = new int[]{200, 200, 198, 198, 198, 198};
    private static int[] x = new int[]{-1, 42, 37, 40, 52, 31, 48, 32, 34, 35, 39, 41, 43, 45, 47, 50, 51, 33, 38, 49, 53, 54, 36, 46, 44};
    private static final Point[] y = new Point[]{new Point(34, 40), new Point(34, 40), new Point(0, 270), new Point(0, 254), new Point(0, 238), new Point(0, 222)};
    private static final Point[] z = new Point[]{new Point(26, 96), new Point(26, 96), new Point(5, 4), new Point(5, 4), new Point(5, 4), new Point(5, 4)};
    private static final Point[] A = new Point[]{new Point(30, 36), new Point(40, 20), new Point(0, 0), new Point(0, 0), new Point(0, 0), new Point(0, 0)};
    private static final Point[] B = new Point[]{new Point(144, 206), new Point(240, 260), new Point(224, 15), new Point(224, 33), new Point(224, 51), new Point(224, 69)};
    private static final Point[] C = new Point[]{new Point(85, 19), new Point(85, 19), new Point(0, 0), new Point(0, 0), new Point(0, 0), new Point(0, 0)};
    private static final ImageSize[] D = new ImageSize[]{new ImageSize(132, 80), new ImageSize(8, 8), new ImageSize(230, 12), new ImageSize(230, 30), new ImageSize(230, 48), new ImageSize(230, 66)};
    private static final int[] E = new int[]{5, 0, 1, 2, 3, 4};

    p() {
    }

    public final boolean a() {
        this.i(256);
        this.r = -1;
        this.u = true;
        this.p = -1;
        this.a = new Point(0, 0);
        this.b = new Point(0, 0);
        this.c = new Point(0, 0);
        this.d = new Point(0, 0);
        this.e = new Point(0, 0);
        this.g = new Point(0, 0);
        this.j = new Point(0, 0);
        this.k = new Point(0, 0);
        this.h = new d[13];
        MankeyManCanvas.a(this.h);

        int var1;
        for(var1 = 0; var1 < 13; ++var1) {
            this.h[var1].setFlagFalse(1073741824);
        }

        this.h[0].g(16388);
        this.h[1].g(16386);
        this.h[2].g(16384);

        for(var1 = 0; var1 < 10; ++var1) {
            this.h[var1 + 3].g(16387);
        }

        this.i = new at[1];
        MankeyManCanvas.a(this.i);

        for(var1 = 0; var1 <= 0; ++var1) {
            this.i[0].setFlagFalse(1073741824);
        }

        this.i[0].g(16385);
        this.c(0);
        this.d(0);
        this.a(false);
        this.h(1);
        return true;
    }

    public final void b() {
        MankeyManCanvas.b(this.h);
        this.h = null;
        MankeyManCanvas.b(this.i);
        this.i = null;
    }

    public final void c() {
        this.o = this.getC();
        Point var2;
        label119:
        switch(this.getD()) {
            case 0:
                switch(this.r) {
                    case 0:
                        this.a(true);
                        this.u = true;
                        this.r = -1;
                        break label119;
                    case 1:
                        var2 = this.g;
                        if(this.o == 0) {
                            this.g = this.g();
                            var2.x = this.g.x;
                            var2.y = this.g.y;
                            switch(this.p) {
                                case 0:
                                case 1:
                                    this.a(var2.x, var2.y - 240);
                                    this.a(var2.x, var2.y + 16, 4, 2);
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    this.a(var2.x, var2.y + 20);
                                    this.a(var2.x, var2.y + 8, 4, 2);
                            }

                            this.a(true);
                        } else if(this.o == 4) {
                            switch(this.p) {
                                case 0:
                                case 1:
                                    this.a(var2.x, var2.y - 8, 3, 2);
                                    break label119;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    this.a(var2.x, var2.y - 4, 3, 2);
                            }
                        } else if(this.o == 7) {
                            this.a(var2.x, var2.y, 2, 2);
                        } else if(!this.h()) {
                            this.r = -1;
                        }
                        break label119;
                    case 2:
                        var2 = this.g;
                        if(this.o == 0) {
                            this.g = this.g();
                            var2.x = this.g.x;
                            var2.y = this.g.y;
                            switch(this.p) {
                                case 0:
                                case 1:
                                    this.a(var2.x, var2.y - 240);
                                    this.a(var2.x, var2.y, 4, 2);
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    this.a(var2.x, var2.y + 20);
                                    this.a(var2.x, var2.y, 4, 2);
                            }

                            this.a(true);
                        } else if(this.o == 4) {
                            this.r = -1;
                        }
                    default:
                        break label119;
                }
            case 1:
                label96:
                switch(this.r) {
                    case 0:
                        this.a(false);
                        this.u = true;
                        this.r = -1;
                        this.p = -1;
                        break;
                    case 1:
                        var2 = this.g;
                        if(this.o == 0) {
                            this.g = this.g();
                            var2.x = this.g.x;
                            var2.y = this.g.y;
                            switch(this.p) {
                                case 0:
                                case 1:
                                    this.a(var2.x, var2.y + 16, 3, 1);
                                    break label96;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    this.a(var2.x, var2.y + 16, 3, 1);
                            }
                        } else if(this.o == 3) {
                            switch(this.p) {
                                case 0:
                                case 1:
                                    this.a(var2.x, var2.y - 240, 3, 1);
                                    break label96;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    this.a(var2.x, var2.y + 20, 3, 1);
                            }
                        } else if(!this.h()) {
                            this.a(false);
                            this.r = -1;
                            this.p = -1;
                        }
                        break;
                    case 2:
                        var2 = this.g;
                        if(this.o == 0) {
                            this.g = this.g();
                            var2.x = this.g.x;
                            var2.y = this.g.y;
                            switch(this.p) {
                                case 0:
                                case 1:
                                    this.a(var2.x, var2.y - 240, 3, 2);
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    this.a(var2.x, var2.y + 20, 3, 2);
                            }
                        } else if(this.o == 3) {
                            this.a(false);
                            this.r = -1;
                            this.p = -1;
                        }
                }
        }

        this.v = true;
        if(MankeyManCanvas.d(1048576) && this.d() && !this.f()) {
            if((this.s + 1) * this.t < this.i[0].b()) {
                ++this.s;
                this.i[0].b(this.s * this.t);
            }

            this.v = false;
        }

        if(this.h[0].isFlag2()) {
            this.h[2].setFlag2(this.o / 3 % 2 == 0);
        }

        if(!this.u) {
            if(++this.m < this.l) {
                int var3 = MankeyManCanvas.a(this.l, this.m, this.n);
                this.a((this.j.x << 8) + (this.k.x - this.j.x) * var3 >> 8, (this.j.y << 8) + (this.k.y - this.j.y) * var3 >> 8);
                return;
            }

            this.a(this.k.x, this.k.y);
            this.u = true;
        }

    }

    public final void a(int var1, int var2, String var3) {
        this.a(var1, var2, var3, "", 0);
    }

    public final void a(int var1, int var2, String var3, String var4, int var5) {
        this.c(var2);
        this.i[0].a(var3);
        this.s = 0;
        this.a(var4);
        this.d(var5);
        this.b(var1);
    }

    public final void a(int var1, int var2, int var3, int var4, int var5) {
        this.c(0);
        if(var3 != -1) {
            this.i[0].a(var3);
        } else {
            this.i[0].a("");
        }

        this.s = 0;
        String var6;
        if((var6 = MankeyManCanvas.getMessage(var4)) != null) {
            this.a(var6);
        } else {
            this.a("");
        }

        this.d(var5);
        this.b(1);
    }

    private void b(int var1) {
        this.r = var1;
        this.h(0);
    }

    public final void a(int var1) {
        this.r = var1;
        this.h(1);
    }

    public final boolean d() {
        return this.getD() == 0 && this.r == -1;
    }

    public final boolean e() {
        return this.getD() == 1 && this.r == -1;
    }

    public final boolean f() {
        return (this.s + 1) * this.t >= this.i[0].b()?this.v:false;
    }

    private void a(int var1, int var2) {
        this.a.moveTo(var1, var2);
        this.h[0].f(var1, var2);
        this.h[1].f(var1 + this.c.x, var2 + this.c.y);
        this.h[2].f(var1 + this.d.x, var2 + this.d.y);

        for(int var3 = 0; var3 < this.q; ++var3) {
            this.h[var3 + 3].f(var1 + this.e.x - this.q * 13 / 2 + var3 * 13, var2 + this.e.y);
        }

        this.i[0].f(var1 + this.b.x, var2 + this.b.y);
    }

    private void a(Point var1) {
        this.a(var1.x, var1.y);
    }

    public final Point g() {
        return new Point(this.a);
    }

    private void a(int var1, int var2, int var3, int var4) {
        this.j.x = this.a.x;
        this.j.y = this.a.y;
        this.k.x = var1;
        this.k.y = var2;
        this.l = var3;
        this.m = 0;
        this.n = var4;
        this.u = false;
    }

    private boolean h() {
        return !this.u;
    }

    private void c(int var1) {
        if(this.p != var1) {
            this.p = var1;
        }

        this.t = E[this.p];
        this.b.moveTo(z[this.p]);
        this.c.moveTo(A[this.p]);
        this.d.moveTo(B[this.p]);
        this.e.moveTo(C[this.p]);
        this.h[0].a(w[this.p], 1);
        this.h[2].a(163, 2, new z(0, 0, 13, 14));
        this.i[0].a(D[this.p]);
        this.i[0].a(12, 18);
        this.i[0].setColor(0);
        this.a.moveTo(y[this.p]);
        this.a(y[this.p]);
    }

    private void a(boolean var1) {
        int var2;
        switch(this.p) {
            case 0:
            case 1:
                for(var2 = 0; var2 < this.q; ++var2) {
                    this.h[var2 + 3].setFlag2(var1);
                }

                for(var2 = this.q; var2 < 10; ++var2) {
                    this.h[var2 + 3].setFlag2(false);
                }

                this.h[1].setFlag2(var1);
                break;
            default:
                for(var2 = 0; var2 < 10; ++var2) {
                    this.h[var2 + 3].setFlag2(false);
                }

                this.h[1].setFlag2(false);
        }

        for(var2 = 0; var2 <= 0; ++var2) {
            this.i[0].setFlag2(var1);
        }

        this.h[0].setFlag2(var1);
        this.h[2].setFlag2(var1);
    }

    private void a(String var1) {
        int var2;
        for(var2 = 0; var2 < var1.length(); ++var2) {
            int var3 = DataStore.a(var1.charAt(var2));
            this.h[var2 + 3].a(164, 1, new z(var3 % 20 * 12, var3 / 20 * 13, 12, 13));
        }

        for(var2 = var1.length(); var2 < 10; ++var2) {
            this.h[var2 + 3].a(-1);
        }

        this.q = var1.length();
        this.a(this.a);
        this.a(this.h[0].isFlag2());
    }

    private void d(int var1) {
        if(var1 == 0) {
            this.h[1].a(-1);
        } else {
            MankeyManCanvas.getImage(196, x[var1]);
            this.h[1].a(196, 1);
        }

        this.h[1].setFlag2(false);
    }
}
