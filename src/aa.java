//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

abstract class aa extends FlagBase {
    private aa a = null;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    public aa() {
    }

    public boolean a() {
        return true;
    }

    public void b() {
    }

    public void c() {
    }

    public final void f(int var1) {
        this.e = var1;
        super.flags |= 1;
        Canvas.setFlagTrue(128);
        Canvas.b(this);
    }

    public final int l() {
        return this.e;
    }

    final boolean isFlag1() {
        return (super.flags & 1) == 0;
    }

    public final void g(int var1) {
        this.c = var1;
        super.flags |= 2;
    }

    public final int n() {
        return this.c;
    }

    public final void h(int var1) {
        this.d = var1;
        this.c = 0;
        super.flags |= 2;
    }

    public final int o() {
        return this.d;
    }

    public final void i(int var1) {
        this.b = var1;
        Canvas.setFlagTrue(256); // flag9
    }

    public final int p() {
        return this.b;
    }

    public final void a(aa var1) {
        this.a = var1;
    }

    public final aa q() {
        return this.a;
    }

    public final void r() {
        super.flags &= -3;
        this.c();
        if((super.flags & 2) == 0) {
            ++this.c;
        }

    }
}
