//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.lcdui.Graphics;

abstract class wClass extends FlagBase {
    protected Point a = new Point(0, 0);
    int color = 0;
    private int d = 0;
    private Point e = new Point(0, 0);
    private Point g = new Point(0, 0);
    private int h = 0;
    private int i = 0;
    private int j = 0;
    protected static Point c;

    wClass() {
        super.flags = 1073741826; // flag31 & flag2
    }

    public static void a(Point var0) {
        c = var0;
    }

    public final void f(int var1, int var2) {
        this.a.x = var1;
        this.a.y = var2;
    }

    public final void b(Point var1) {
        this.a.x = var1.x;
        this.a.y = var1.y;
    }

    public final Point f() {
        return new Point(this.a.x, this.a.y);
    }

    public final int g() {
        return this.a.y;
    }

    public final void setFlag2(boolean flag2) {
        if(flag2) {
            super.flags |= 2;
        } else {
            super.flags &= -3;
        }
    }

    final boolean isFlag2() {
        return (super.flags & 2) != 0;
    }

    public final void setColor(int var1) {
        this.color = var1;
    }

    public final void a(int var1, int var2, int var3) {
        this.color = 0;
    }

    public final void i() {
        super.flags |= 1;
        MankeyManCanvas.setFlagTrue(1024); // flag11
    }

    public final void g(int var1) {
        this.d = var1;
        MankeyManCanvas.setFlagTrue(2048); // flag12
    }

    public final int j() {
        return this.d;
    }

    public final void a(int var1, int var2, int var3, int var4) {
        if((super.flags & 4) != 0) {
            this.a.x = this.g.x;
            this.a.y = this.g.y;
        }

        this.e.x = this.a.x;
        this.e.y = this.a.y;
        this.g.x = var1;
        this.g.y = var2;
        this.h = var3;
        this.i = 0;
        this.j = var4;
        super.flags |= 4;
    }

    public final void k() {
        super.flags &= -5;
    }

    public abstract void a(Graphics graphics);

    public void a() {
        if((super.flags & 4) != 0) { // flag3
            if(++this.i < this.h) {
                int var3 = this.j;
                int var2 = this.i;
                int var1 = this.h;
                if (var3 == 0) {
                    var1 = 65535 / var1 * var2;
                }
                else if (var3 == 1) {
                    var1 = ((var2 + 1) * var2 >> 1 << 16) / ((var1 + 1) * var1 >> 1);
                }
                else if (var3 == 2) {
                    var1 = (((var1 << 1) - var2 + 1) * var2 >> 1 << 16) / ((var1 + 1) * var1 >> 1);
                }
                else {
                    var1 = 0;
                }
                this.a.x = this.e.x + ((this.g.x - this.e.x) * var1 >> 16);
                this.a.y = this.e.y + ((this.g.y - this.e.y) * var1 >> 16);
                return;
            }

            this.a.x = this.g.x;
            this.a.y = this.g.y;
            super.flags &= -5;
        }

    }
}
