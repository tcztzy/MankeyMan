//
// Source code recreated from option .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

abstract class MID extends MIDlet {
    MID() {
    }

    protected void startApp() {
    }

    protected void pauseApp() {
    }

    protected void destroyApp(boolean var1) {
    }

    public final void a() {
        this.destroyApp(false);
        this.notifyDestroyed();
    }
}
