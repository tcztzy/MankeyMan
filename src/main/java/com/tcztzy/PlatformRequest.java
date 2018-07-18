//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

public final class PlatformRequest extends Thread {
    private boolean a;

    PlatformRequest() {
        this.a = true;
    }

    public final void run() {
        try {
            MankeyManCanvas.midlet.platformRequest("http://gamepie.g188.net/gamecms/go/jpgd");
            if(this.a) {
                Thread.sleep(1000L);
                MankeyManCanvas.midlet.destroy();
            }
        } catch (Exception ignored) {}
    }
}
