//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;

public final class WelcomeCanvas extends Canvas implements Runnable {
    static boolean audioEnabled = false;
    private static boolean c = true;
    public static boolean b = false;
    private boolean d = true;
    private boolean e = true;
    private int f = 0;
    private int KEY_YES = -6;
    private int KEY_NO = -7;
    private int width;
    private int height;
    private MIDlet midlet;
    private Displayable displayable;
    private Image backgroundImage;
    private Image brandImage;
    private Image gstarImage;
    private Image soundAskImage;
    private Image bannerImage;
    private Image yesImage;
    private Image noImage;
    private Image[] logoImages;
    private Image logo51Image = null;
    private Image logo52Image = null;
    private Player player;
    private int[] x = new int[]{-52, 0, 52};
    private int[] z = new int[]{18, 15, -2, 0};
    private int[][] A;
    private volatile Thread thread;
    private long timeAnchor;
    private static int interval = 40;
    private int E;
    private int[] x_shifts;

    WelcomeCanvas(MIDlet var1, Displayable var2) {
        int[] y = new int[]{16, 14, 5, 1, -3, -2, 2};
        this.A = new int[][]{{2, y[6], 0, y[6], 1, y[6], 500}, {2, y[2], 0, y[2], 1, y[2], interval}, {2, y[1], 0, y[1], 1, y[1], interval}, {2, y[0], 0, y[0], 1, y[0], interval, 2}, {-1, this.z[0], -1, this.z[0], -1, this.z[0], interval}, {-1, this.z[0], 5, this.z[0], -1, this.z[0], interval}, {-1, this.z[0], 5, this.z[1], -1, this.z[0], interval}, {-1, this.z[0], 5, this.z[2], -1, this.z[0], interval}, {-1, this.z[0], 5, this.z[3], -1, this.z[0], interval}, {-1, this.z[0], 5, this.z[0], -1, this.z[0], interval}, {-1, this.z[0], 5, this.z[1], 5, this.z[0], interval, 1}, {-1, this.z[0], 5, this.z[2], 5, this.z[1], interval}, {5, this.z[0], 5, this.z[3], 5, this.z[2], interval}, {5, this.z[1], 5, this.z[0], 5, this.z[3], interval}, {5, this.z[2], 5, this.z[1], 5, this.z[0], interval}, {5, this.z[3], 5, this.z[2], 5, this.z[1], interval}, {5, this.z[0], 5, this.z[3], 5, this.z[2], interval}, {5, this.z[1], 5, this.z[0], 5, this.z[3], interval}, {5, this.z[2], 2, y[0], 5, this.z[0], interval}, {5, this.z[3], 2, y[1], 5, this.z[1], interval}, {5, this.z[0], 2, y[2], 5, this.z[2], interval}, {5, this.z[1], 2, y[3], 5, this.z[3], interval}, {5, this.z[2], 2, y[4], 5, this.z[0], interval}, {5, this.z[3], 2, y[5], 5, this.z[1], interval}, {3, y[0], 2, y[6], 5, this.z[2], interval}, {3, y[1], 2, y[6], 5, this.z[3], interval}, {3, y[2], 2, y[6], 5, this.z[0], interval}, {3, y[3], 2, y[6], 5, this.z[1], interval}, {3, y[4], 2, y[6], 5, this.z[2], interval}, {3, y[5], 2, y[6], 5, this.z[3], interval}, {4, y[0], 2, y[6], 3, y[6], interval}, {4, y[1], 2, y[6], 3, y[6], interval}, {4, y[2], 2, y[6], 3, y[6], interval}, {4, y[6], 2, y[6], 3, y[6], 1000}};
        this.timeAnchor = 0L;
        this.x_shifts = new int[]{0, -1, -1};
        this.setFullScreenMode(true);
        this.midlet = var1;
        this.displayable = var2;
        this.width = this.getWidth();
        this.height = this.getHeight();
        this.loadImages();
        WelcomeCanvas self = this;

        try {
            self.player = Manager.createPlayer(self.midlet.getClass().getResourceAsStream("/sound.mid"), "audio/midi");
            self.player.realize();
            VolumeControl volumeControl = (VolumeControl)self.player.getControl("VolumeControl");
            if(volumeControl != null) {
                volumeControl.setLevel(60);
            }
        } catch (Exception ignored) {}

        Display.getDisplay(this.midlet).setCurrent(this);
        this.thread = new Thread(this);
        this.thread.start();
    }

    private void loadImages() {
        try {
            this.brandImage = Image.createImage("/111.png");
            this.gstarImage = Image.createImage("/gstar.png");
            this.soundAskImage = Image.createImage("/soundask.png");
            this.bannerImage = Image.createImage("/202.png");
            this.yesImage = Image.createImage("/200.png");
            this.noImage = Image.createImage("/201.png");
            this.backgroundImage = Image.createImage("/bg.png");
            this.logoImages = new Image[6];

            for(int i = 0; i < 6; ++i) {
                this.logoImages[i] = Image.createImage("/logo" + i + ".png");
            }

            this.logo51Image = Image.createImage("/logo51.png");
            this.logo52Image = Image.createImage("/logo52.png");
        } catch (Exception ignored) {}
    }

    public final void keyPressed(int keyCode) {
        if(this.e) {
            if(keyCode == this.KEY_YES) {
                audioEnabled = true;
                c = true;
                this.e = false;
                return;
            }

            if(keyCode == this.KEY_NO) {
                audioEnabled = false;
                c = true;
                this.e = false;
            }
        }

    }

    protected final void pointerPressed(int x, int y) {
        super.pointerPressed(x, y);
        if(x > 0 && x < this.yesImage.getWidth() + 5 && y > this.height - this.yesImage.getHeight() - 5 && y < this.height) {
            this.keyPressed(this.KEY_YES);
        } else {
            if(x > this.width - this.noImage.getWidth() - 5 && x < this.width && y > this.height - this.noImage.getHeight() - 5 && y < this.height) {
                this.keyPressed(this.KEY_NO);
            }

        }
    }

    public final void paint(Graphics graphics) {
        graphics.setClip(0, 0, this.width, this.height);
        if(this.d) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.width, this.height);
            graphics.drawImage(this.brandImage, this.width >> 1, this.height >> 2, 3);
            graphics.drawImage(this.gstarImage, this.width >> 1, this.height >> 1, 17);
        } else if(this.e) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.width, this.height);
            graphics.drawImage(this.brandImage, this.width >> 1, this.height >> 2, 3);
            graphics.drawImage(this.gstarImage, this.width >> 1, this.height >> 1, 17);
            graphics.drawImage(this.soundAskImage, this.width >> 1, this.height - this.yesImage.getHeight() - this.bannerImage.getHeight() - 15, 33);
            graphics.drawImage(this.bannerImage, this.width >> 1, this.height - this.yesImage.getHeight() - 10, 33);
            graphics.drawImage(this.yesImage, 0, this.height - 2, 36);
            graphics.drawImage(this.noImage, this.width - 2, this.height - 2, 40);
        } else if(c) {
            WelcomeCanvas self = this;
            graphics.setClip(0, 0, graphics.getClipWidth(), graphics.getClipHeight());
            graphics.setColor(0);
            graphics.fillRect(0, 0, graphics.getClipWidth(), graphics.getClipHeight());
            graphics.drawImage(this.backgroundImage, graphics.getClipWidth() >> 1, graphics.getClipHeight() >> 1, 3);

            for(int i = 0; i < 3; ++i) {
                if(self.A[self.f][i << 1] != -1) {
                    self.E = self.x[i];
                    if(self.A[self.f][i << 1] == 3) {
                        self.E = self.x[0];
                    } else if(self.A[self.f][i << 1] == 4) {
                        self.E = self.x[2];
                    }

                    self.E += self.width >> 1;
                    if(self.A[self.f][i << 1] == 5) {
                        if(self.A[self.f][(i << 1) + 1] == self.z[0]) {
                            graphics.drawImage(self.logo51Image, self.E + self.x_shifts[i], (self.height >> 1) - 30, 17);
                        } else if(self.A[self.f][(i << 1) + 1] == self.z[1]) {
                            graphics.drawImage(self.logoImages[self.A[self.f][i*2]], self.E, self.height >> 1, 3);
                        } else if(self.A[self.f][(i << 1) + 1] == self.z[2]) {
                            graphics.drawImage(self.logo52Image, self.E + self.x_shifts[i], (self.height >> 1) - 31, 17);
                        }
                    } else {
                        graphics.drawImage(self.logoImages[self.A[self.f][i << 1]], self.E, self.A[self.f][(i << 1) + 1] + (self.height >> 1), 3);
                    }
                }
            }

        } else {
            graphics.setColor(0);
            graphics.fillRect(0, 0, graphics.getClipWidth(), graphics.getClipHeight());
        }
    }

    private synchronized void killThread() {
        if(this.thread != null) {
            this.thread = null;
        }

    }

    public final void run() {
        try {
            if(this.d) {
                this.repaint();
                this.serviceRepaints();
                Thread.sleep(1600L);
                this.d = false;
            }

            while(this.e) {
                this.width = this.getWidth();
                this.height = this.getHeight();
                this.repaint();
                this.serviceRepaints();
                Thread.sleep(200L);
            }

            while(c) {
                this.width = this.getWidth();
                this.height = this.getHeight();
                if(this.f == 0) {
                    WelcomeCanvas var1 = this;

                    try {
                        if(audioEnabled) {
                            if(var1.player != null) {
                                var1.player.start();
                            }
                        } else {
                            var1.player.stop();
                            var1.player.close();
                            var1.player = null;
                        }
                    } catch (Exception ignored) {}
                }

                this.repaint();
                this.serviceRepaints();
                Thread.sleep((long)this.A[this.f][6]);
                ++this.f;
                long timeUsage = System.currentTimeMillis() - this.timeAnchor;
                if(this.timeAnchor != 0L && timeUsage < (long) interval) {
                    Thread.sleep((long) interval - timeUsage);
                }

                this.timeAnchor = System.currentTimeMillis();
                if(this.f >= this.A.length) {
                    c = false;
                }
            }

        }
        catch (Exception ignored) {}
        finally {
            this.killThread();
            if(this.displayable != null) {
                Display.getDisplay(this.midlet).setCurrent(this.displayable);
                b = true;
                this.close();
            }

        }

    }

    private void close() {
        this.brandImage = null;
        this.gstarImage = null;
        this.soundAskImage = null;
        this.bannerImage = null;
        this.yesImage = null;
        this.noImage = null;
        this.backgroundImage = null;
        this.logoImages = null;
        this.logo51Image = null;
        this.logo52Image = null;
        if(this.player != null) {
            try {
                this.player.stop();
                this.player.close();
                this.player = null;
            } catch (MediaException ignored) {}
        }
    }
}
