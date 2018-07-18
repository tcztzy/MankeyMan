//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.microedition.lcdui.Graphics;

final class al extends d {
    private int d = 0;
    private int e;

    al() {
    }

    public final void a(Graphics graphics) {
        switch(this.d) {
            case 1:
                graphics.setColor(super.color);
                graphics.fillRect(wClass.c.a, wClass.c.b, 240, 320);
                return;
            case 2:
                graphics.setColor(super.color);
                graphics.fillRect(wClass.c.a, wClass.c.b, 240, 320);
            default:
        }
    }

    public final void a() {
        if(this.d == 2 && this.e == 1) {
            this.d = 0;
            this.setFlag2(false);
        }

        ++this.e;
    }

    public final void d(int var1) {
        this.d = var1;
        this.e = 0;
        this.setFlag2(true);
    }

    final boolean dNotEqualToZero() {
        return this.d != 0;
    }
}
