//
// Source code recreated from option .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

abstract class MankeyManMIDlet extends MIDlet {
    MankeyManMIDlet() {
    }

    protected void startApp() {
    }

    protected void pauseApp() {
    }

    protected void destroyApp(boolean var1) {
    }

    final void destroy() {
        this.destroyApp(false);
        this.notifyDestroyed();
    }
}
