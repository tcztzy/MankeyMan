//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

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

public final class nClass extends Canvas implements Runnable {
    public static boolean a = false;
    private static boolean c = true;
    public static boolean b = false;
    private boolean d = true;
    private boolean e = true;
    private int f = 0;
    private int g = -6;
    private int h = -7;
    private int i;
    private int j;
    private MIDlet k;
    private Displayable l;
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
    private Player w;
    private int[] x = new int[]{-52, 0, 52};
    private int[] y = new int[]{16, 14, 5, 1, -3, -2, 2};
    private int[] z = new int[]{18, 15, -2, 0};
    private int[][] A;
    private volatile Thread B;
    private long C;
    private static int D = 40;
    private int E;
    private int[] F;

    public nClass(MIDlet var1, Displayable var2) {
        this.A = new int[][]{{2, this.y[6], 0, this.y[6], 1, this.y[6], 500}, {2, this.y[2], 0, this.y[2], 1, this.y[2], D}, {2, this.y[1], 0, this.y[1], 1, this.y[1], D}, {2, this.y[0], 0, this.y[0], 1, this.y[0], D, 2}, {-1, this.z[0], -1, this.z[0], -1, this.z[0], D}, {-1, this.z[0], 5, this.z[0], -1, this.z[0], D}, {-1, this.z[0], 5, this.z[1], -1, this.z[0], D}, {-1, this.z[0], 5, this.z[2], -1, this.z[0], D}, {-1, this.z[0], 5, this.z[3], -1, this.z[0], D}, {-1, this.z[0], 5, this.z[0], -1, this.z[0], D}, {-1, this.z[0], 5, this.z[1], 5, this.z[0], D, 1}, {-1, this.z[0], 5, this.z[2], 5, this.z[1], D}, {5, this.z[0], 5, this.z[3], 5, this.z[2], D}, {5, this.z[1], 5, this.z[0], 5, this.z[3], D}, {5, this.z[2], 5, this.z[1], 5, this.z[0], D}, {5, this.z[3], 5, this.z[2], 5, this.z[1], D}, {5, this.z[0], 5, this.z[3], 5, this.z[2], D}, {5, this.z[1], 5, this.z[0], 5, this.z[3], D}, {5, this.z[2], 2, this.y[0], 5, this.z[0], D}, {5, this.z[3], 2, this.y[1], 5, this.z[1], D}, {5, this.z[0], 2, this.y[2], 5, this.z[2], D}, {5, this.z[1], 2, this.y[3], 5, this.z[3], D}, {5, this.z[2], 2, this.y[4], 5, this.z[0], D}, {5, this.z[3], 2, this.y[5], 5, this.z[1], D}, {3, this.y[0], 2, this.y[6], 5, this.z[2], D}, {3, this.y[1], 2, this.y[6], 5, this.z[3], D}, {3, this.y[2], 2, this.y[6], 5, this.z[0], D}, {3, this.y[3], 2, this.y[6], 5, this.z[1], D}, {3, this.y[4], 2, this.y[6], 5, this.z[2], D}, {3, this.y[5], 2, this.y[6], 5, this.z[3], D}, {4, this.y[0], 2, this.y[6], 3, this.y[6], D}, {4, this.y[1], 2, this.y[6], 3, this.y[6], D}, {4, this.y[2], 2, this.y[6], 3, this.y[6], D}, {4, this.y[6], 2, this.y[6], 3, this.y[6], 1000}};
        this.C = 0L;
        this.F = new int[]{0, -1, -1};
        this.setFullScreenMode(true);
        this.k = var1;
        this.l = var2;
        this.i = this.getWidth();
        this.j = this.getHeight();
        this.a();
        nClass var4 = this;

        try {
            var4.w = Manager.createPlayer(var4.k.getClass().getResourceAsStream("/sound.mid"), "audio/midi");
            var4.w.realize();
            VolumeControl var5;
            if((var5 = (VolumeControl)var4.w.getControl("VolumeControl")) != null) {
                var5.setLevel(60);
            }
        } catch (Exception var3) {
            ;
        }

        Display.getDisplay(this.k).setCurrent(this);
        this.B = new Thread(this);
        this.B.start();
    }

    private void a() {
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

    public final void keyPressed(int var1) {
        if(this.e) {
            if(var1 == this.g) {
                a = true;
                c = true;
                this.e = false;
                return;
            }

            if(var1 == this.h) {
                a = false;
                c = true;
                this.e = false;
            }
        }

    }

    protected final void pointerPressed(int var1, int var2) {
        super.pointerPressed(var1, var2);
        if(var1 > 0 && var1 < this.yesImage.getWidth() + 5 && var2 > this.j - this.yesImage.getHeight() - 5 && var2 < this.j) {
            this.keyPressed(this.g);
        } else {
            if(var1 > this.i - this.noImage.getWidth() - 5 && var1 < this.i && var2 > this.j - this.noImage.getHeight() - 5 && var2 < this.j) {
                this.keyPressed(this.h);
            }

        }
    }

    public final void paint(Graphics var1) {
        var1.setClip(0, 0, this.i, this.j);
        if(this.d) {
            var1.setColor(0);
            var1.fillRect(0, 0, this.i, this.j);
            var1.drawImage(this.brandImage, this.i >> 1, this.j >> 2, 3);
            var1.drawImage(this.gstarImage, this.i >> 1, this.j >> 1, 17);
        } else if(this.e) {
            var1.setColor(0);
            var1.fillRect(0, 0, this.i, this.j);
            var1.drawImage(this.brandImage, this.i >> 1, this.j >> 2, 3);
            var1.drawImage(this.gstarImage, this.i >> 1, this.j >> 1, 17);
            var1.drawImage(this.soundAskImage, this.i >> 1, this.j - this.yesImage.getHeight() - this.bannerImage.getHeight() - 15, 33);
            var1.drawImage(this.bannerImage, this.i >> 1, this.j - this.yesImage.getHeight() - 10, 33);
            var1.drawImage(this.yesImage, 0, this.j - 2, 36);
            var1.drawImage(this.noImage, this.i - 2, this.j - 2, 40);
        } else if(c) {
            Graphics var2 = var1;
            nClass var4 = this;
            var1.setClip(0, 0, var1.getClipWidth(), var1.getClipHeight());
            var1.setColor(0);
            var1.fillRect(0, 0, var1.getClipWidth(), var1.getClipHeight());
            var1.drawImage(this.backgroundImage, var1.getClipWidth() >> 1, var1.getClipHeight() >> 1, 3);

            for(int var3 = 0; var3 < 3; ++var3) {
                if(var4.A[var4.f][var3 << 1] != -1) {
                    var4.E = var4.x[var3];
                    if(var4.A[var4.f][var3 << 1] == 3) {
                        var4.E = var4.x[0];
                    } else if(var4.A[var4.f][var3 << 1] == 4) {
                        var4.E = var4.x[2];
                    }

                    var4.E += var4.i >> 1;
                    if(var4.A[var4.f][var3 << 1] == 5) {
                        if(var4.A[var4.f][(var3 << 1) + 1] == var4.z[0]) {
                            var2.drawImage(var4.logo51Image, var4.E + var4.F[var3], (var4.j >> 1) - 30, 17);
                        } else if(var4.A[var4.f][(var3 << 1) + 1] == var4.z[1]) {
                            var2.drawImage(var4.logoImages[var4.A[var4.f][var3 << 1]], var4.E, var4.j >> 1, 3);
                        } else if(var4.A[var4.f][(var3 << 1) + 1] == var4.z[2]) {
                            var2.drawImage(var4.logo52Image, var4.E + var4.F[var3], (var4.j >> 1) - 31, 17);
                        }
                    } else {
                        var2.drawImage(var4.logoImages[var4.A[var4.f][var3 << 1]], var4.E, var4.A[var4.f][(var3 << 1) + 1] + (var4.j >> 1), 3);
                    }
                }
            }

        } else {
            var1.setColor(0);
            var1.fillRect(0, 0, var1.getClipWidth(), var1.getClipHeight());
        }
    }

    private synchronized void b() {
        if(this.B != null) {
            this.B = null;
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
                this.i = this.getWidth();
                this.j = this.getHeight();
                this.repaint();
                this.serviceRepaints();
                Thread.sleep(200L);
            }

            while(c) {
                this.i = this.getWidth();
                this.j = this.getHeight();
                if(this.f == 0) {
                    nClass var1 = this;

                    try {
                        if(a) {
                            if(var1.w != null) {
                                var1.w.start();
                            }
                        } else {
                            var1.w.stop();
                            var1.w.close();
                            var1.w = null;
                        }
                    } catch (Exception var6) {
                        ;
                    }
                }

                this.repaint();
                this.serviceRepaints();
                Thread.sleep((long)this.A[this.f][6]);
                ++this.f;
                long var9;
                if(this.C != 0L && (var9 = System.currentTimeMillis() - this.C) < (long)D) {
                    Thread.sleep((long)D - var9);
                }

                this.C = System.currentTimeMillis();
                if(this.f >= this.A.length) {
                    c = false;
                }
            }

            return;
        } catch (Exception var7) {
            ;
        } finally {
            this.b();
            if(this.l != null) {
                Display.getDisplay(this.k).setCurrent(this.l);
                b = true;
                this.c();
            }

        }

    }

    private void c() {
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
        if(this.w != null) {
            try {
                this.w.stop();
                this.w.close();
                this.w = null;
                return;
            } catch (MediaException var1) {
                ;
            }
        }

    }
}
