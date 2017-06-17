//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

abstract class aj {
    protected int b;
    public int[] c;
    private int a;

    public aj() {
    }

    public void a() {
    }

    public void c() {
    }

    public void b_() {
    }

    public void b() {
    }

    public void c_() {
        this.a |= -2147483648;
        aiClass.x.setFlagTrue(1073741824);
        sClass.b(this);
    }

    final boolean w() {
        return (this.a & -2147483648) != 0;
    }

    public final void x(int var1) {
        this.c[3] = var1;
        if(aiClass.x != null) {
            aiClass.x.setFlagTrue(536870912);
        }

    }

    public final int a(int[] var1, int var2) {
        System.arraycopy(this.c, 0, var1, var2, this.b);

        return this.b;
    }

    public final int b(int[] var1, int var2) {
        System.arraycopy(var1, var2, this.c, 0, this.b);

        return this.b;
    }
}
