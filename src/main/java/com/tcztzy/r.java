//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

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
        q var2 = Canvas.b();
        q var3 = Canvas.c(); // q(0, 0)
        int var4;
        int var6;
        if((super.flags & 1073741824) != 0) {
            var4 = var3.a; // 0
            var6 = var3.b; // 0
        } else {
            var4 = 0;
            var6 = 0;
        }

        int var5;
        switch(this.d) {
            case 0:
                var5 = this.e < this.g ? 7168 / this.g * this.e >> 8 : 28;
                graphics.setColor(0);
                graphics.fillRect(var2.a + var4 + super.a.a - 15, var2.b + var6 + super.a.b, 30, 3);
                graphics.setColor(4194304);
                graphics.fillRect(var2.a + var4 + super.a.a - 15 + 1, var2.b + var6 + super.a.b + 1, 28, 1);
                graphics.setColor(16711680);
                graphics.fillRect(var2.a + var4 + super.a.a - 15 + 1, var2.b + var6 + super.a.b + 1, var5, 1);
                return;
            case 1:
                var5 = this.e < this.g?7680 / this.g * this.e >> 8:30;
                graphics.setColor(0);
                graphics.fillRect(var2.a + var4 + super.a.a, var2.b + var6 + super.a.b, 32, 5);
                graphics.setColor(1973790);
                graphics.fillRect(var2.a + var4 + super.a.a + 1, var2.b + var6 + super.a.b + 1, 30, 3);
                graphics.setColor(13393245);
                graphics.fillRect(var2.a + var4 + super.a.a + 1, var2.b + var6 + super.a.b + 1, var5, 3);
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
