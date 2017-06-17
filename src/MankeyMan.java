//
// Source code recreated from option .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class MankeyMan extends MID {
    public MankeyMan() {
        g var1 = new g();
        new nClass(this, var1);
        var1.a(this);
    }

    protected void pauseApp() {
        aiClass.recordGame();
        super.pauseApp();
        Canvas.a(true);
    }

    protected void destroyApp(boolean destroy) {
        aiClass.recordGame();
        super.destroyApp(destroy);
    }
}
