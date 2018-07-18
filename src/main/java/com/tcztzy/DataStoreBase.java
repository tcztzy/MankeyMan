//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

abstract class DataStoreBase extends FlagBase {
    private DataStoreBase a = null;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    public DataStoreBase() {
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
        MankeyManCanvas.setFlagTrue(128);
        MankeyManCanvas.b(this);
    }

    public final int getE() {
        return this.e;
    }

    final boolean isFlag1() {
        return (super.flags & 1) == 0;
    }

    public final void g(int var1) {
        this.c = var1;
        super.flags |= 2;
    }

    public final int getC() {
        return this.c;
    }

    public final void h(int var1) {
        this.d = var1;
        this.c = 0;
        super.flags |= 2;
    }

    public final int getD() {
        return this.d;
    }

    public final void i(int var1) {
        this.b = var1;
        MankeyManCanvas.setFlagTrue(256); // flag9
    }

    public final int getB() {
        return this.b;
    }

    public final void setA(DataStoreBase var1) {
        this.a = var1;
    }

    public final DataStoreBase getA() {
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
