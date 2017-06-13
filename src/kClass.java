//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

final class kClass {
    private static boolean b = false;
    private static Player player;
    private static int d;
    private static boolean e;
    private static PlayerListener playerListener = null;

    kClass() {
    }

    public static void a(int var0, boolean var1) {
        d = var0;
        e = var1;
        if(!b) {
            try {
                i var6;
                if((var6 = Canvas.i(var0)) != null) {
                    b();

                    try {
                        ByteArrayInputStream var7 = new ByteArrayInputStream(var6.a);
                        player = Manager.createPlayer(new DataInputStream(var7), "audio/midi");
                        if(playerListener != null) {
                            player.addPlayerListener(playerListener);
                        }
                    } catch (Exception ignored) {}

                    try {
                        player.realize();
                        player.prefetch();
                    } catch (Exception ignored) {}

                    try {
                        if(var1) {
                            player.setLoopCount(-1);
                        } else {
                            player.setLoopCount(1);
                        }

                        player.start();
                        int a = 90;
                        ((VolumeControl) player.getControl("VolumeControl")).setLevel(a);
                    } catch (Exception ignored) {}
                }
            } catch (Exception ignored) {}

        }
    }

    public final void a() {
        a(d, e);
    }

    public static void b() {
        try {
            if(player != null) {
                if(player.getState() == 400) {
                    player.stop();
                }

                player.close();
                player = null;
            }
        } catch (Exception ignored) {}

    }

    public static boolean c() {
        return player != null && player.getState() == 400;
    }

    public final void a(boolean var1) {
        if(var1) {
            b = true;

            b();
        } else {
            b = false;

            try {
                this.a();
            } catch (Exception ignored) {}
        }

    }

    public static void d() {
        if(player != null) {
            try {
                if(player.getState() == 400) {
                    player.stop();
                }

                player.close();
                player = null;
            } catch (MediaException ignored) {}
        }

    }

    public static void a(PlayerListener var0) {
        playerListener = var0;
    }
}
