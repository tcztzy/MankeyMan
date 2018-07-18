//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

abstract class MankeyManCanvas extends GameCanvas implements Runnable, PlayerListener {
    public static Font font = Font.getFont(32, 0, 8);
    public static int b = -40;
    private static Image optionsImage = null;
    private static boolean f = false;
    public static MankeyManMIDlet midlet;
    private static v g;
    private static Thread h;
    private static int i;
    private static int flags;
    private static int k;
    private static int l;
    private static Point m;
    private static Point n;
    private static ImageSize o;
    private static ImageSize p;
    private static String loadingString;
    private static int process;
    private static int keyFlags;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static String[] optionStrings;
    private static String[] y;
    private static DataStoreBase[] z;
    private static int A;
    private static DataStoreBase B;
    private static wClass[] C;
    private static int D;
    private static int E;
    private static MankeyManPlayer F;
    public static boolean d;
    private static int G;
    private static int H;
    private static PNGImage[] pngImages;
    private static MankeyManAudio[] audioList;
    private static String[] messages;
    private static am[] L;
    private static int[] MagicArray = new int[]{0, 4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 48, 53, 57, 61, 66, 70, 74, 79, 83, 87, 91, 95, 100, 104, 108, 112, 116, 120, 124, 127, 131, 135, 139, 143, 146, 150, 154, 157, 161, 164, 167, 171, 174, 177, 181, 184, 187, 190, 193, 196, 198, 201, 204, 207, 209, 212, 214, 217, 219, 221, 223, 226, 228, 230, 232, 233, 235, 237, 238, 240, 242, 243, 244, 246, 247, 248, 249, 250, 251, 252, 252, 253, 254, 254, 255, 255, 255, 255, 255, 256, 256, 255, 255, 255, 255, 255, 254, 254, 253, 252, 252, 251, 250, 249, 248, 247, 246, 244, 243, 242, 240, 238, 237, 235, 233, 232, 230, 228, 226, 223, 221, 219, 217, 214, 212, 209, 207, 204, 201, 198, 196, 193, 190, 187, 184, 181, 177, 174, 171, 167, 164, 161, 157, 154, 150, 146, 143, 139, 135, 131, 128, 124, 120, 116, 112, 108, 104, 100, 95, 91, 87, 83, 79, 74, 70, 66, 61, 57, 53, 48, 44, 40, 35, 31, 26, 22, 17, 13, 8, 4, 0, 0, 40, 81, 122, 162, 203, 244, 285, 325, 366, 407, 447, 488, 529, 569, 610, 651, 691, 732, 772, 813, 853, 894, 934, 974, 1015, 1055, 1096, 1136, 1176, 1216, 1256, 1297, 1337, 1377, 1417, 1457, 1497, 1537, 1576, 1616, 1656, 1696, 1735, 1775, 1814, 1854, 1893, 1933, 1972, 2011, 2051, 2090, 2129, 2168, 2207, 2246, 2285, 2323, 2362, 2401, 2439, 2478, 2516, 2555, 2593, 2631, 2669, 2708, 2746, 2784, 2821, 2859, 2897, 2935, 2972, 3010, 3047, 3084, 3122, 3159, 3196, 3233, 3270, 3307, 3343, 3380, 3416, 3453, 3489, 3526, 3562, 3598, 3634, 3670, 3706, 3742, 3777, 3813, 3848, 3884, 3919, 3954, 3989, 4024, 4059, 4094, 4129, 4164, 4198, 4233, 4267, 4301, 4335, 4369, 4403, 4437, 4471, 4505, 4538, 4572, 4605, 4638, 4671, 4704, 4737, 4770, 4803, 4836, 4868, 4901, 4933, 4965, 4997, 5029, 5061, 5093, 5125, 5156, 5188, 5219, 5251, 5282, 5313, 5344, 5375, 5406, 5436, 5467, 5497, 5528, 5558, 5588, 5618, 5648, 5678, 5708, 5738, 5767, 5797, 5826, 5855, 5884, 5913, 5942, 5971, 6000, 6028, 6057, 6085, 6114, 6142, 6170, 6198, 6226, 6254, 6282, 6309, 6337, 6364, 6391, 6419, 6446, 6473, 6500, 6527, 6553, 6580, 6606, 6633, 6659, 6685, 6711, 6737, 6763, 6789, 6815, 6841, 6866, 6892, 6917, 6942, 6967, 6992, 7017, 7042, 7067, 7092, 7116, 7141, 7165, 7190, 7214, 7238, 7262, 7286, 7310, 7333, 7357, 7381, 7404, 7428, 7451, 7474, 7497, 7520, 7543, 7566, 7589, 7611, 7634, 7657, 7679, 7701, 7724, 7746, 7768, 7790, 7812, 7833, 7855, 7877, 7898, 7920, 7941, 7963, 7984, 8005, 8026, 8047, 8068, 8089, 8109, 8130, 8151, 8171};

    public MankeyManCanvas() {
        super(false);
        this.setFullScreenMode(true);
        midlet = null;
        g = new v(this);
        i = ((new Random()).nextInt() >>> 1) % 32768; // the unicode for 耀 is 32768, 2**16
        keyFlags = 0;
        t = 0;
        u = 0;
        v = 0;
        w = 0;
        flags = 524288; // the 20th bit is 1 and reset is 0
        p = new ImageSize(this.getWidth(), this.getHeight());
        o = new ImageSize(240, 320);
        n = new Point((p.width - o.width) / 2, (p.height - o.height) / 2);
        m = new Point(0, 0);
        z = new DataStoreBase[128];
        A = 0;
        C = new wClass[720];
        D = 0;
        E = 0;
        pngImages = new PNGImage[256];
        audioList = new MankeyManAudio[DataStore.d.length];
        messages = new String[DataStore.MESSAGES.length];
        L = new am[180];
        loadingString = "";
        process = 0;
        F = new MankeyManPlayer();
        MankeyManPlayer.a(this);
        optionStrings = new String[2];
        y = new String[2];

        for(int var1 = 0; var1 < 2; ++var1) {
            optionStrings[var1] = null;
        }

        try {
            optionsImage = Image.createImage("/131.png");
        } catch (Exception ignored) {}
    }

    public void playerUpdate(Player var1, String var2, Object var3) {
        if(!var2.equals("deviceUnavailable") && var2.equals("deviceAvailable")) {
            F.a();
        }
    }

    public void repaint(MankeyManMIDlet mmmidlet) {
        g.repaintGameCanvas();
        midlet = mmmidlet;
        (h = new Thread(this)).start();
    }

    public static void a() {
        midlet.a();
    }

    public static Font a(int var0) {
        return Font.getFont(32, 0, var0);
    }

    public static void a(boolean var0) {
        int var1;
        if(var0) {
            f = true;
            flags |= 8192;

            for(var1 = 0; var1 < D; ++var1) {
                if(!C[var1].getFlag(268435456)) {
                    C[var1].setFlagTrue(8);
                }
            }

            MankeyManPlayer.d();
        } else {
            f = false;
            flags &= -8193;

            for(var1 = 0; var1 < D; ++var1) {
                C[var1].setFlagFalse(8);
            }

            if(!DataStore.b && !DataStore.c) {
                F.a();
            }

        }
    }

    static void setFlagTrue(int var0) {
        flags |= var0;
    }

    public static void c(int var0) {
        flags &= -9;
    }

    public static Point b() {
        return new Point(n.x, n.y);
    }

    public static void a(int var0, int var1) {
        m.x = var0;
        m.y = var1;
    }

    public static Point getPoint() {
        return m;
    }

    public static void option(int selectOption, String optionString) {
        if(optionString == null) {
            optionStrings[selectOption] = "";
        } else {
            optionStrings[selectOption] = optionString;
        }

        if(selectOption == 0) {
            flags |= 2;
        }

        if(selectOption == 1) {
            flags |= 4;
        }

    }

    private static void i() {
        flags &= -7;
    }

    public void paint(Graphics graphics) {
        if((flags & 6) != 0) {
            i();
        }

        if((flags & 1048576) == 0) { // 21 bit, 1 followed by 20 zeros
            if(((flags |= 1048576) & 8) != 0 || l == 0) {
                graphics.setColor(E);
                graphics.fillRect(n.x, n.y, o.width, o.height);
            }

            if((flags & 16384) == 0) { // 15, 1 followed by 14 zeros

                for(int var4 = 0; var4 < D; ++var4) {
                    if(!C[var4].getFlag(1) && C[var4].getFlag(2)) {
                        C[var4].a(graphics);
                    }
                }
            } else {
                int process = MankeyManCanvas.process;
                String loadingString = MankeyManCanvas.loadingString;
                graphics.setFont(font);
                graphics.setColor(0);
                graphics.fillRect(n.x, n.y, 240, 320);
                graphics.setColor(16777215);
                graphics.drawRect(n.x + 40, n.y + 149, 160, 5);
                graphics.setColor(16777215);
                graphics.fillRect(n.x + 41, n.y + 150, process * 104857 >> 16, 4);
                graphics.setColor(16777215);
                graphics.drawString(loadingString, n.x + 40, n.y + 140, 68);

                // zfill
                loadingString = "";
                if(process < 10) {
                    loadingString = "  ";
                } else if(process < 100) {
                    loadingString = " ";
                }

                loadingString = loadingString + process;
                graphics.drawString(loadingString + "%", n.x + 176, n.y + 174, 68);
                if(MankeyManCanvas.process == 100 && k == 0) {
                    flags &= -16385;
                }
            }

            if(n.y > 0) {
                int var6 = (p.height - o.height) / 2;
                graphics.setColor(0);
                graphics.fillRect(0, 0, p.width, var6);
                if((p.height & 1) != 0) {
                    ++var6;
                }

                graphics.fillRect(0, p.height - var6, p.width, var6);
            }

            if(!DataStore.b && !DataStore.c) {
                if(optionStrings[0] != null && optionStrings[0].equals("中止")) {
                    graphics.drawRegion(optionsImage, 0, 0, 34, 18, 0, 0, 302, 20);
                } else if(optionStrings[0] != null && optionStrings[0].equals("是")) {
                    graphics.drawRegion(optionsImage, 0, 18, 34, 18, 0, 0, 302, 20);
                } else if(optionStrings[0] != null && optionStrings[0].equals("出发")) {
                    graphics.drawRegion(optionsImage, 0, 36, 34, 18, 0, 0, 302, 20);
                } else if(optionStrings[0] != null && optionStrings[0].equals("确定")) {
                    graphics.drawRegion(optionsImage, 0, 54, 34, 18, 0, 0, 302, 20);
                } else if(optionStrings[0] != null && optionStrings[0].equals("继续")) {
                    graphics.drawRegion(optionsImage, 0, 72, 34, 18, 0, 0, 302, 20);
                } else if(optionStrings[1] != null && optionStrings[1].equals("退出")) {
                    graphics.drawRegion(optionsImage, 34, 0, 34, 18, 0, 240, 302, 24);
                }

                if(optionStrings[1] != null && optionStrings[1].equals("否")) {
                    graphics.drawRegion(optionsImage, 34, 18, 34, 18, 0, 240, 302, 24);
                } else if(optionStrings[1] != null && optionStrings[1].equals("迁徙")) {
                    graphics.drawRegion(optionsImage, 34, 36, 34, 18, 0, 240, 302, 24);
                } else if(optionStrings[1] != null && optionStrings[1].equals("取消")) {
                    graphics.drawRegion(optionsImage, 34, 54, 34, 18, 0, 240, 302, 24);
                } else if(optionStrings[1] != null && optionStrings[1].equals("返回")) {
                    graphics.drawRegion(optionsImage, 34, 72, 34, 18, 0, 240, 302, 24);
                }
            }

            flags &= -1048577;
        }

        if(f) {
            graphics.setColor(0, 0, 0);
            graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
            graphics.setColor(255, 255, 255);
            graphics.drawString("按确定键继续", this.getWidth() >> 1, this.getHeight() >> 1, 33);
            graphics.drawRegion(optionsImage, 0, 54, 34, 18, 0, 0, 302, 20);
        }

    }

    protected void hideNotify() {
        super.hideNotify();
        a(true);
    }

    public void run() {
        System.currentTimeMillis();

        do {
            try {
                Thread.sleep(100L);
            } catch (Exception ignored) {}
        } while(!nClass.b);

        b(d = !nClass.a);

        do {
            if((flags & 6) != 0) {
                i();
            }

            long startTimeMillis = System.currentTimeMillis();
            if(k != 0) {
                if(k > 0) {
                    --k;
                }
            } else {
                if((flags & 524288) != 0) {
                    w = v;
                    v = keyFlags;
                    if(keyFlags != 0 && keyFlags == w) {
                        if(u > 2) {
                            t = keyFlags;
                        } else {
                            t = 0;
                            ++u;
                        }
                    } else {
                        u = 0;
                        t = keyFlags;
                    }
                } else if(keyFlags == 0 && k != 0) {
                    keyFlags = 0;
                    w = 0;
                    v = 0;
                    t = 0;
                    u = 0;
                } else {
                    flags |= 524288;
                    w = keyFlags;
                    v = keyFlags;
                }

                keyFlags &= -6291457;
                boolean var3;
                int var5;
                if((flags & 256) != 0) {
                    flags &= -257;

                    do {
                        var3 = false;

                        for(var5 = 0; var5 < A - 1; ++var5) {
                            if(z[var5].getB() > z[var5 + 1].getB()) {
                                DataStoreBase var4 = z[var5];
                                z[var5] = z[var5 + 1];
                                z[var5 + 1] = var4;
                                var3 = true;
                            }
                        }
                    } while(var3);
                }

                int var9 = A;

                int var10;
                for(var10 = 0; var10 < var9; ++var10) {
                    if((B = z[var10]).isFlag1() && !B.getFlag(4)) {
                        B.r();
                    }
                }

                var10 = 0;

                while(true) {
                    if((flags & 128) == 0) { // not flag8
                        if(var10 > 0) {
                            for(var5 = 0; var5 < A - 1; ++var5) {
                                if(z[var5] == null) {
                                    for(var9 = var5 + 1; var9 < A; ++var9) {
                                        if(z[var9] != null) {
                                            z[var5] = z[var9];
                                            z[var9] = null;
                                            break;
                                        }
                                    }
                                }
                            }

                            A -= var10;
                        }

                        wClass.a(n);
                        if((flags & 2048) != 0) { // flag21
                            flags &= -2049; // set flag21 false

                            do {
                                var3 = false;

                                for(var5 = 0; var5 < D - 1; ++var5) {
                                    if(C[var5].j() < C[var5 + 1].j()) {
                                        wClass var11 = C[var5];
                                        C[var5] = C[var5 + 1];
                                        C[var5 + 1] = var11;
                                        var3 = true;
                                    }
                                }
                            } while(var3);
                        }

                        for(var9 = 0; var9 < D; ++var9) {
                            if(!C[var9].getFlag(9)) {
                                C[var9].a();
                            }
                        }

                        var9 = 0;
                        if((flags & 1024) != 0) {
                            flags &= -1025;

                            for(var10 = 0; var10 < D; ++var10) {
                                if(C[var10].getFlag(1)) {
                                    C[var10] = null;
                                    ++var9;
                                }
                            }
                        }

                        if(var9 <= 0) {
                            break;
                        }

                        for(var10 = 0; var10 < D - 1; ++var10) {
                            if(C[var10] == null) {
                                for(var5 = var10 + 1; var5 < D; ++var5) {
                                    if(C[var5] != null) {
                                        C[var10] = C[var5];
                                        C[var5] = null;
                                        break;
                                    }
                                }
                            }
                        }

                        D -= var9;
                        break;
                    }

                    flags &= -129;
                    var9 = A;

                    for(var5 = 0; var5 < var9; ++var5) {
                        if(z[var5] != null && !z[var5].isFlag1()) {
                            z[var5].b();
                            b(z[var5]);
                            z[var5] = null;
                            ++var10;
                        }
                    }
                }
            }

            g.repaintGameCanvas();
            this.serviceRepaints();
            long stopTimeMillis = System.currentTimeMillis();
            int var8;
            if((var8 = (int)(72L - (stopTimeMillis - startTimeMillis))) < 20) {
                var8 = 20;
            }

            try {
                Thread.sleep((long)var8);
            } catch (Exception ignored) {}

            ++l;
        } while((flags & 4096) == 0);

        midlet.a();
    }

    public static boolean d(int var0) {
        return (var0 & (w ^ v) & v) != 0;
    }

    public static boolean e(int var0) {
        return (var0 & t) != 0;
    }

    public void keyPressed(int var1) {
        if(f && (var1 == -6 || var1 == -5 || var1 == 53)) {
            a(false);
        }

        if(var1 == 48) {
            keyFlags |= 1;
        } else if(var1 == 49) {
            keyFlags |= 2;
        } else if(var1 == 50) {
            keyFlags |= 131072;
        } else if(var1 == 51) {
            keyFlags |= 8;
        } else if(var1 == 52) {
            keyFlags |= 65536;
        } else if(var1 == 53) {
            keyFlags |= 1048576;
        } else if(var1 == 54) {
            keyFlags |= 262144;
        } else if(var1 == 55) {
            keyFlags |= 128;
        } else if(var1 == 56) {
            keyFlags |= 524288;
        } else if(var1 == 57) {
            keyFlags |= 512;
        } else if(var1 == 35) {
            keyFlags |= 2048;
        } else if(var1 == 42) {
            keyFlags |= 1024;
        } else if(var1 == -6) {
            keyFlags |= 2097152;
        } else if(var1 == -7) {
            keyFlags |= 4194304;
        } else if(var1 == -5) {
            keyFlags |= 1048576;
        } else if((var1 = this.getGameAction(var1)) == 8) {
            keyFlags |= 1048576;
        } else if(var1 == 1) {
            keyFlags |= 131072;
        } else if(var1 == 6) {
            keyFlags |= 524288;
        } else if(var1 == 2) {
            keyFlags |= 65536;
        } else {
            if(var1 == 5) {
                keyFlags |= 262144;
            }

        }
    }

    public void keyReleased(int var1) {
        if(var1 == 48) {
            keyFlags &= -2;
        } else if(var1 == 49) {
            keyFlags &= -3;
        } else if(var1 == 50) {
            keyFlags &= -131073;
        } else if(var1 == 51) {
            keyFlags &= -9;
        } else if(var1 == 52) {
            keyFlags &= -65537;
        } else if(var1 == 53) {
            keyFlags &= -1048577;
        } else if(var1 == 54) {
            keyFlags &= -262145;
        } else if(var1 == 55) {
            keyFlags &= -129;
        } else if(var1 == 56) {
            keyFlags &= -524289;
        } else if(var1 == 57) {
            keyFlags &= -513;
        } else if(var1 == 35) {
            keyFlags &= -2049;
        } else if(var1 == 42) {
            keyFlags &= -1025;
        } else if(var1 == -6) {
            keyFlags &= -2097153;
        } else if(var1 == -7) {
            keyFlags &= -4194305;
        } else if(var1 == -5) {
            keyFlags &= -1048577;
        } else if((var1 = this.getGameAction(var1)) == 8) {
            keyFlags &= -1048577;
        } else if(var1 == 1) {
            keyFlags &= -131073;
        } else if(var1 == 6) {
            keyFlags &= -524289;
        } else if(var1 == 2) {
            keyFlags &= -65537;
        } else {
            if(var1 == 5) {
                keyFlags &= -262145;
            }

        }
    }

    private static void o(int var0) {
        process = var0;
        if((flags & 16384) != 0) {
            g.repaintGameCanvas();
        }

    }

    public static DataStoreBase a(DataStoreBase var0, DataStoreBase var1) {
        if(var0 != null && A < 128) {
            var0.setA(var1);
            if(var0.a()) {
                z[A++] = var0;
                return var0;
            }
        }

        return null;
    }

    public static DataStoreBase a(DataStoreBase var0) {
        return a(var0, null);
    }

    public static void b(DataStoreBase var0) {
        for(int var1 = 0; var1 < A; ++var1) {
            if(z[var1] != null && z[var1].getA() == var0) {
                z[var1].f(0);
            }
        }

    }

    public static d a(d var0) {
        if(var0 != null && D < 720) {
            C[D++] = var0;
            return var0;
        } else {
            return null;
        }
    }

    public static boolean a(d[] var0) {
        for(int var1 = 0; var1 < var0.length; ++var1) {
            var0[var1] = a(new d());
        }

        return true;
    }

    public static void b(d[] var0) {
        for (d aVar0 : var0) {
            if (aVar0 != null) {
                aVar0.i();
            }
        }

    }

    public static void a(d[] var0, ap[] var1) {
        for (ap aVar1 : var1) {
            d var2 = var0[aVar1.a];
            if (aVar1.g != null) {
                var2.a(aVar1.b, aVar1.c, aVar1.g);
            } else {
                var2.a(aVar1.b, aVar1.c);
            }

            var2.changeTransform(aVar1.f);
            var2.b(aVar1.e);
            var2.g(aVar1.d);
            var2.setFlag2(aVar1.h);
        }

    }

    public static at a(at var0) {
        if(var0 != null && D < 720) {
            C[D++] = var0;
            return var0;
        } else {
            return null;
        }
    }

    public static boolean a(at[] var0) {
        for(int var1 = 0; var1 < var0.length; ++var1) {
            var0[var1] = a(new at());
        }

        return true;
    }

    public static void b(at[] var0) {
        for (at aVar0 : var0) {
            aVar0.i();
        }

    }

    public static void f(int var0) {
        E = 0;
    }

    public static boolean a(int var0, boolean var1) {
        if((flags & 16) != 0 && !var1) {
            return false;
        } else {
            if(MankeyManPlayer.isPlayerStarted()) {
                MankeyManPlayer.b();
            }

            if(var0 != -1) {
                MankeyManPlayer.a(var0, var1);
            }

            return true;
        }
    }

    public static boolean b(int var0, boolean var1) {
        return a(var0, false);
    }

    public static void d() {
        MankeyManPlayer.b();
    }

    public static void e() {
        F.a();
    }

    public static void b(boolean var0) {
        if(var0) {
            F.a(true);
            flags |= 16;
        } else {
            F.a(false);
            flags &= -17;
        }

        d = var0;
    }

    public static void f() {
        MankeyManPlayer.d();
    }

    public static boolean loading(l[] var0, AudioResource[] audioResources, Message[] messages, m[] var3, boolean var4) {
        String loading = "载入中...";
        y[0] = optionStrings[0];
        y[1] = optionStrings[1];
        optionStrings[0] = null;
        optionStrings[1] = null;
        if(var4) {
            flags |= 16390;
        } else {
            flags = (flags &= -16385) | 6;
        }

        loadingString = loading;
        o(0);
        G = 0;
        H = 0;
        int i;
        if(var0 != null) {
            G += var0.length;

            for(i = 0; i < var0.length; ++i) {
                getImage(var0[i].a, var0[i].b);
                o(++H * 100 / G);
            }
        }

        if(audioResources != null) {
            G += audioResources.length;

            for(i = 0; i < audioResources.length; ++i) {
                loadAudio(audioResources[i].audioIndex, audioResources[i].audioBaseName);
                o(++H * 100 / G);
            }
        }

        if(messages != null) {

            for(i = 0; i < messages.length; ++i) {
                MankeyManCanvas.messages[messages[i].index] = messages[i].message;
            }
        }

        if(var3 != null) {
            G += var3.length;

            for(i = 0; i < var3.length; ++i) {
                c[] var7 = var3[i].b;
                short var6 = var3[i].a;
                short var8 = var3[i].a;
                L[var8] = null;
                L[var6] = new am(var7, 0);
                o(++H * 100 / G);
            }
        }

        o(100);
        optionStrings[0] = y[0];
        optionStrings[1] = y[1];
        flags = (flags |= 6) | 6;
        k = 4;
        return true;
    }

    public static void a(l[] var0, AudioResource[] var1, Message[] var2, m[] var3) {
        if(var0 != null) {
            var0 = var0;

            for(int var4 = 0; var4 < var0.length; ++var4) {
                nullImage(var0[var0.length - var4 - 1].a);
            }
        }

    }

    public static boolean getImage(int imageId, int imageName) {
        nullImage(imageId);

        try {
            Image image = Image.createImage("/" + imageName + ".png");
            pngImages[imageId] = new PNGImage(image, imageName);
            return true;
        } catch (Exception var3) {
            pngImages[imageId] = null;
            return false;
        }
    }

    static void nullImage(int imageId) {
        if(pngImages[imageId] != null) {
            pngImages[imageId].image = null;
            pngImages[imageId] = null;
        }

    }

    static PNGImage getPNGImage(int imageId) {
        return imageId >= 0 && imageId < 256? pngImages[imageId]:null;
    }

    private static void loadAudio(int audioIndex, int audioBaseName) {
        checkAudioIndex(audioIndex);

        try {
            String audioPath = "/" + audioBaseName + ".mid";
            InputStream audio = MankeyManCanvas.class.getResourceAsStream(audioPath);
            int audioAvailable = audio.available();
            if(audioAvailable > 0) {
                byte[] audioBytes = new byte[audioAvailable];
                audio.read(audioBytes);
                audioList[audioIndex] = new MankeyManAudio(audioBytes, audioBaseName);
            }

        } catch (Exception ignored) {}
    }

    private static void checkAudioIndex(int audioIndex) {
        if(audioList[audioIndex] != null) {
            try {
                audioList[audioIndex].audioBytes = null;
            } catch (Exception ignored) {}

            audioList[audioIndex] = null;
        }

    }

    public static MankeyManAudio i(int index) {
        if (index >= 0 && index < DataStore.d.length)
            return audioList[index];
        else
            return null;
    }

    static String getMessage(int messageIndex) {
        return messageIndex >= 0 && messageIndex < DataStore.MESSAGES.length ? messages[messageIndex] : null;
    }

    public static am k(int var0) {
        return var0 >= 0 && var0 < 180 ? L[var0] : null;
    }

    public static void setI(int var0) {
        i = var0;
    }

    public static int getI() {
        return i;
    }

    public static int h() {
        if(i < 0) {
            i = -i;
        }

        return i = (i * 109 + 1021) % 32768; // '耀'
    }

    public static int sin(int var0) {
        byte var1 = 1;
        if(var0 < 0) {
            var1 = -1;
            var0 = Math.abs(var0);
        }

        var0 %= 360;
        int var2 = 0;
        if(var0 >= 0 && var0 < 90) {
            var2 = MagicArray[var0];
        }

        if(var0 >= 90 && var0 < 180) {
            var2 = MagicArray[180 - var0];
        }

        if(var0 >= 180 && var0 < 270) {
            var2 = -MagicArray[var0 - 180];
        }

        if(var0 >= 270 && var0 < 360) {
            var2 = -MagicArray[360 - var0];
        }

        return var1 * var2;
    }

    static int cos(int var0) {
        // Guess this is cos function. Get the degree and produce the 256 based cos value.
        if(var0 < 0) {
            var0 = Math.abs(var0);
        }

        var0 %= 360;
        int var1 = 0;
        if(var0 >= 0 && var0 < 90) {
            var1 = MagicArray[var0 + 91];
        }

        if(var0 >= 90 && var0 < 180) {
            var1 = -MagicArray[271 - var0];
        }

        if(var0 >= 180 && var0 < 270) {
            var1 = -MagicArray[var0 + 91 - 180];
        }

        if(var0 >= 270 && var0 < 360) {
            var1 = MagicArray[451 - var0];
        }

        return var1;
    }

    public static int c(int var0, int var1) {
        if (var0 == 0 && var1 == 0) {
            return 0;
        }
        else if (var1 < 0) {
            return (e(-var0, -var1) + 32768) / 182;
        }
        else {
            return e(var0, var1) / 182;
        }
    }

    private static int e(int var0, int var1) {
        if (var0 < 0) {
            return f(var1, -var0) + 16384;
        }
        else {
            return f(var0, var1);
        }
    }

    private static int f(int var0, int var1) {
        if (var0 == var1) {
            return 8192;
        }
        else if (var1 > var0) {
            return 16384 - g(var1, var0);
        }
        else {
            return g(var0, var1);
        }
    }

    private static int g(int var0, int var1) {
        if(var0 == 0) {
            return 0;
        } else {
            var0 = (var1 << 8) / var0;
            return MagicArray[182 + var0 % 256];
        }
    }

    public static int a(int var0, int var1, int var2) {
        switch (var2) {
            case 0:
                return 65536 / var0 * var1 >> 8;
            case 1:
                return ((var1 + 1) * var1 / 2 << 16) / ((var0 + 1) * var0 / 2) >> 8;
            case 2:
                return (((var0 << 1) - var1 + 1) * var1 / 2 << 16) / ((var0 + 1) * var0 / 2) >> 8;
            default:
                return 0;
        }
    }
}
