//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.lcdui.Graphics;

final class r extends d {
    private int d;
    private int e;
    private int g;

    public r(int var1) {
        this.d = var1;
        this.e = 0;
        this.g = 100;
    }

    public final void a(Graphics graphics) {
        Point var2 = MankeyManCanvas.b();
        Point var3 = MankeyManCanvas.getPoint(); // Point(0, 0)
        int var4;
        int var6;
        if((super.flags & 1073741824) != 0) {
            var4 = var3.x; // 0
            var6 = var3.y; // 0
        } else {
            var4 = 0;
            var6 = 0;
        }

        int var5;
        switch(this.d) {
            case 0:
                var5 = this.e < this.g ? 7168 / this.g * this.e >> 8 : 28;
                graphics.setColor(0);
                graphics.fillRect(var2.x + var4 + super.a.x - 15, var2.y + var6 + super.a.y, 30, 3);
                graphics.setColor(4194304);
                graphics.fillRect(var2.x + var4 + super.a.x - 15 + 1, var2.y + var6 + super.a.y + 1, 28, 1);
                graphics.setColor(16711680);
                graphics.fillRect(var2.x + var4 + super.a.x - 15 + 1, var2.y + var6 + super.a.y + 1, var5, 1);
                return;
            case 1:
                var5 = this.e < this.g?7680 / this.g * this.e >> 8:30;
                graphics.setColor(0);
                graphics.fillRect(var2.x + var4 + super.a.x, var2.y + var6 + super.a.y, 32, 5);
                graphics.setColor(1973790);
                graphics.fillRect(var2.x + var4 + super.a.x + 1, var2.y + var6 + super.a.y + 1, 30, 3);
                graphics.setColor(13393245);
                graphics.fillRect(var2.x + var4 + super.a.x + 1, var2.y + var6 + super.a.y + 1, var5, 3);
            default:
        }
    }

    public final void d(int var1) {
        this.e = var1;
    }

    public final void e(int var1) {
        this.g = var1;
    }
}
