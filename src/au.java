//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public final class au extends Thread {
    private boolean a = false;

    au(boolean ignore) {
        this.a = true;
    }

    public final void run() {
        try {
            Canvas.midlet.platformRequest("http://gamepie.g188.net/gamecms/go/jpgd");
            if(this.a) {
                Thread.sleep(1000L);
                Canvas.midlet.a();
            }
        } catch (Exception ignored) {}
    }
}
