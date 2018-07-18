//
// Source code recreated from option .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

public class MankeyMan extends MankeyManMIDlet {
    public MankeyMan() {
        MainCanvas var1 = new MainCanvas();
        new WelcomeCanvas(this, var1);
        var1.repaint(this);
    }

    protected void pauseApp() {
        MankeyManRecordStore.recordGame();
        super.pauseApp();
        MankeyManCanvas.a(true);
    }

    protected void destroyApp(boolean destroy) {
        MankeyManRecordStore.recordGame();
        super.destroyApp(destroy);
    }
}
