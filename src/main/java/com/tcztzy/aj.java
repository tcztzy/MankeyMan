//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

abstract class aj {
    protected int length;
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
        MankeyManRecordStore.x.setFlagTrue(1073741824);
        sClass.b(this);
    }

    final boolean w() {
        return (this.a & -2147483648) != 0;
    }

    public final void x(int var1) {
        this.c[3] = var1;
        if(MankeyManRecordStore.x != null) {
            MankeyManRecordStore.x.setFlagTrue(536870912);
        }

    }

    final int copyTo(int[] dest, int destPos) {
        System.arraycopy(this.c, 0, dest, destPos, this.length);

        return this.length;
    }

    final int pasteFrom(int[] src, int srcPos) {
        System.arraycopy(src, srcPos, this.c, 0, this.length);

        return this.length;
    }
}
