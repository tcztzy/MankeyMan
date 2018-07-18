//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

final class MankeyManPlayer {
    private static boolean b = false;
    private static Player player;
    private static int d;
    private static boolean e;
    private static PlayerListener playerListener = null;

    MankeyManPlayer() {
    }

    public static void a(int var0, boolean var1) {
        d = var0;
        e = var1;
        if(!b) {
            try {
                MankeyManAudio var6;
                if((var6 = MankeyManCanvas.i(var0)) != null) {
                    b();

                    try {
                        ByteArrayInputStream in = new ByteArrayInputStream(var6.audioBytes);
                        player = Manager.createPlayer(new DataInputStream(in), "audio/midi");
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
                        int level = 90;
                        ((VolumeControl) player.getControl("VolumeControl")).setLevel(level);
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
                if(player.getState() == Player.STARTED) {
                    player.stop();
                }

                player.close();
                player = null;
            }
        } catch (Exception ignored) {}

    }

    static boolean isPlayerStarted() {
        return player != null && player.getState() == Player.STARTED;
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
                if(player.getState() == Player.STARTED) {
                    player.stop();
                }

                player.close();
                player = null;
            } catch (MediaException ignored) {}
        }

    }

    public static void a(PlayerListener listener) {
        playerListener = listener;
    }
}
