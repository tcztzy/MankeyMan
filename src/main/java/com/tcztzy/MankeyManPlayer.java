//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

final class MankeyManPlayer {
    private static boolean paused = false;
    private static Player player;
    private static int _audioIndex;
    private static boolean _repeat;
    private static PlayerListener playerListener = null;

    MankeyManPlayer() {
    }

    static void play(int index, boolean repeat) {
        _audioIndex = index;
        _repeat = repeat;
        if(!paused) {
            try {
                MankeyManAudio audio = MankeyManCanvas.getAudio(index);
                if(audio != null) {
                    close();

                    try {
                        ByteArrayInputStream in = new ByteArrayInputStream(audio.audioBytes);
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
                        if(repeat) {
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

    final void play() {
        play(_audioIndex, _repeat);
    }

    static void close() {
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

    final void pause(boolean p) {
        if(p) {
            paused = true;

            close();
        } else {
            paused = false;

            try {
                this.play();
            } catch (Exception ignored) {}
        }

    }

    static void setListener(PlayerListener listener) {
        playerListener = listener;
    }
}
