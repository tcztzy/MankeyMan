//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class u extends aa {
    private d[] a;
    private at[] b;
    private int c;
    private int d;
    private int e;

    public u(int var1, int var2) {
        this.d = var1;
        this.e = var2;
    }

    public final boolean a() {
        this.i(1792);
        this.a = new d[5];
        Canvas.a(this.a);
        this.a[0].setColor(15854563);
        this.a[0].b(240, 320);
        this.a[0].f(0, 0);
        this.a[0].g(28672);
        this.a[2].e(42, 0);
        this.a[2].f(208, 288);
        this.a[2].g(28671);
        this.a[3].e(79, 1);
        this.a[3].f(182, 288);
        this.a[3].g(28671);
        this.a[4].e(90, 2);
        this.a[4].f(156, 288);
        this.a[4].g(28671);
        this.a[1].a(162, 0, new z(0, 0, 24, 22));
        this.a[1].g(28671);
        this.a[1].f(20, 73 + this.e * 33);
        if(this.d == 2 || this.e >= 5) {
            this.a[1].f(300, 0);
        }

        this.b = new at[1];
        Canvas.a(this.b);
        aiClass.F[2] = Canvas.getMessage(131); // "────────　得分榜▽"

        for(int var1 = 0; var1 < 5; ++var1) {
            aiClass.F[2] = aiClass.F[2] + acClass.getNumberString(var1 + 1, 5, false);
            aiClass.F[2] = aiClass.F[2] + Canvas.getMessage(132); // "　---　"
            aiClass.F[2] = aiClass.F[2] + acClass.getNumberString(aiClass.b[var1], 6, true);
            aiClass.F[2] = aiClass.F[2] + Canvas.getMessage(133); // "点▽"
        }

        aiClass.F[2] = aiClass.F[2] + "　";
        this.b[0].setColor(8879214);
        this.b[0].a(12, 33);
        this.b[0].f(36, 24);
        this.b[0].g(28671);
        this.b[0].a(aiClass.F[2]);
        return true;
    }

    public final void b() {
        Canvas.b(this.b);
        this.b = null;
        Canvas.b(this.a);
        this.a = null;
    }

    public final void c() {
        this.c = this.n();
        switch(this.o()) {
            case 0:
                if(this.c == 0) {
                    switch(this.d) {
                        case 0:
                        case 1:
                            Canvas.option(1, null);
                            Canvas.option(0, "继续");
                            break;
                        case 2:
                            Canvas.option(1, "返回");
                            Canvas.option(0, null);
                    }
                }

                if(this.c == 3) {
                    this.h(1);
                    return;
                }
                break;
            case 1:
                if(this.d == 2 && Canvas.d(4194304) || this.d == 1 && Canvas.d(2097152) || this.d == 0 && Canvas.d(2097152)) {
                    this.h(2);
                }

                this.a[1].setFlag2(this.c / 2 % 2 == 0);
                return;
            case 2:
                if(this.c == 2) {
                    Canvas.option(1, null);
                    this.f(0);
                }
        }

    }
}
