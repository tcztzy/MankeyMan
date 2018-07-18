//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class u extends DataStoreBase {
    private d[] a;
    private at[] b;
    private int d;
    private int e;

    u(int var1, int var2) {
        this.d = var1;
        this.e = var2;
    }

    public final boolean a() {
        this.i(1792);
        this.a = new d[5];
        MankeyManCanvas.a(this.a);
        this.a[0].setColor(15854563);
        this.a[0].setStart(240, 320);
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
        MankeyManCanvas.a(this.b);
        MankeyManRecordStore.F[2] = MankeyManCanvas.getMessage(131); // "────────　得分榜▽"

        for(int var1 = 0; var1 < 5; ++var1) {
            MankeyManRecordStore.F[2] = MankeyManRecordStore.F[2] + DataStore.getNumberString(var1 + 1, 5, false);
            MankeyManRecordStore.F[2] = MankeyManRecordStore.F[2] + MankeyManCanvas.getMessage(132); // "　---　"
            MankeyManRecordStore.F[2] = MankeyManRecordStore.F[2] + DataStore.getNumberString(MankeyManRecordStore.b[var1], 6, true);
            MankeyManRecordStore.F[2] = MankeyManRecordStore.F[2] + MankeyManCanvas.getMessage(133); // "点▽"
        }

        MankeyManRecordStore.F[2] = MankeyManRecordStore.F[2] + "　";
        this.b[0].setColor(8879214);
        this.b[0].a(12, 33);
        this.b[0].f(36, 24);
        this.b[0].g(28671);
        this.b[0].a(MankeyManRecordStore.F[2]);
        return true;
    }

    public final void b() {
        MankeyManCanvas.b(this.b);
        this.b = null;
        MankeyManCanvas.b(this.a);
        this.a = null;
    }

    public final void c() {
        int c = this.getC();
        switch(this.getD()) {
            case 0:
                if(c == 0) {
                    switch(this.d) {
                        case 0:
                        case 1:
                            MankeyManCanvas.option(1, null);
                            MankeyManCanvas.option(0, "继续");
                            break;
                        case 2:
                            MankeyManCanvas.option(1, "返回");
                            MankeyManCanvas.option(0, null);
                    }
                }

                if(c == 3) {
                    this.h(1);
                    return;
                }
                break;
            case 1:
                if(this.d == 2 && MankeyManCanvas.d(4194304) || this.d == 1 && MankeyManCanvas.d(2097152) || this.d == 0 && MankeyManCanvas.d(2097152)) {
                    this.h(2);
                }

                this.a[1].setFlag2(c / 2 % 2 == 0);
                return;
            case 2:
                if(c == 2) {
                    MankeyManCanvas.option(1, null);
                    this.f(0);
                }
        }

    }
}
