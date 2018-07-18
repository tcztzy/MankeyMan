//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.rms.RecordStore;

final class MankeyManRecordStore {
    private static int G;
    public static int a;
    public static int[] b = new int[5];
    static int gameTime;
    public static int d;
    static int score;
    public static Point f = new Point(0, 0);
    public static int[] g = new int[4];
    public static int[] h = new int[29];
    public static int i;
    public static int j;
    public static int[] k = new int[5000];
    public static int l;
    public static int m;
    public static char[] n = new char[1800];
    static int[] records = new int[20];
    static int year;
    public static int q;
    public static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    public static boolean w;
    public static sClass x;
    static p y;
    public static av z;
    static al A;
    static ae B;
    public static an C;
    static ao D;
    static byte[] E = new byte[36];
    static String[] F = new String[3];
    private static RecordStore recordStore;
    private static int I;
    private static byte[] record = new byte[20706];

    public MankeyManRecordStore() {
    }

    static void recordGame() {
        recordStore = null;

        try {
            if((recordStore = RecordStore.openRecordStore("save", true)).getNumRecords() <= 0) {
                recordStore.addRecord(record, 0, record.length);
            } else {
                recordStore.setRecord(1, record, 0, record.length);
            }

            recordStore.closeRecordStore();
        } catch (Exception var1) {
            try {
                if(recordStore != null) {
                    recordStore.closeRecordStore();
                }
            } catch (Exception ignored) {}
        }

        recordStore = null;
    }

    public static void a(int var0) {
        I = 0;
        G = 1;
        appendIntToRecord(1);
        appendIntToRecord(a);
        if(var0 == 1) {
            for(var0 = 0; var0 < 5; ++var0) {
                appendIntToRecord(b[var0]);
            }

            appendIntToRecord(gameTime);
            appendIntToRecord(d);
            appendIntToRecord(score);
            appendIntToRecord(f.x);
            appendIntToRecord(f.y);

            for(var0 = 0; var0 < 4; ++var0) {
                appendIntToRecord(g[var0]);
            }

            for(var0 = 0; var0 < 8; ++var0) {
                appendIntToRecord(h[var0]);
            }

            appendIntToRecord(i);
            appendIntToRecord(j);

            for(var0 = 0; var0 < 5000; ++var0) {
                appendShortToRecord((short)k[var0]);
            }

            appendShortToRecord((short)l);
            appendShortToRecord((short)m);
            char[] var2 = n;

            for(int var1 = 0; var1 < var2.length; ++var1) {
                record[I++] = (byte)(var2[var1] >>> 8);
                record[I++] = (byte)var2[var1];
            }

            for(var0 = 0; var0 < 20; ++var0) {
                appendShortToRecord((short) records[var0]);
            }
        }

    }

    private static void appendIntToRecord(int var0) {
        record[I++] = (byte)(var0 >>> 24);
        record[I++] = (byte)(var0 >>> 16);
        record[I++] = (byte)(var0 >>> 8);
        record[I++] = (byte)var0;
    }

    private static void appendShortToRecord(short var0) {
        record[I++] = (byte)(var0 >>> 8);
        record[I++] = (byte)var0;
    }

    public static void b() {
        recordStore = null;

        int var0;
        try {
            record = (recordStore = RecordStore.openRecordStore("save", false)).getRecord(1);
            recordStore.closeRecordStore();
        } catch (Exception var4) {
            for(var0 = 0; var0 < record.length; ++var0) {
                record[var0] = 0;
            }

            try {
                if(recordStore != null) {
                    recordStore.closeRecordStore();
                }
            } catch (Exception ignored) {
            }
        }

        recordStore = null;
        I = 0;
        if((G = getIntFromRecord()) == 0) {
            a |= 16;
            b[0] = 5000;
            b[1] = 4000;
            b[2] = 3000;
            b[3] = 2000;
            b[4] = 1000;
        } else {
            a = getIntFromRecord();

            for(var0 = 0; var0 < 5; ++var0) {
                b[var0] = getIntFromRecord();
            }

            gameTime = getIntFromRecord();
            d = getIntFromRecord();
            score = getIntFromRecord();
            f.x = getIntFromRecord();
            f.y = getIntFromRecord();

            for(var0 = 0; var0 < 4; ++var0) {
                g[var0] = getIntFromRecord();
            }

            for(var0 = 0; var0 < 8; ++var0) {
                h[var0] = getIntFromRecord();
            }

            i = getIntFromRecord();
            j = getIntFromRecord();

            for(var0 = 0; var0 < 5000; ++var0) {
                k[var0] = getShortFromRecord();
            }

            l = getShortFromRecord();
            m = getShortFromRecord();
            char[] var5 = n;

            for(int var2 = 0; var2 < var5.length; ++var2) {
                int var1 = (record[I++] & 255) << 8 | record[I++] & 255;
                var5[var2] = (char)var1;
            }

            for(var0 = 0; var0 < 20; ++var0) {
                records[var0] = getShortFromRecord();
            }

        }
    }

    private static int getIntFromRecord() {
        return (record[I++] & 255) << 24 | (record[I++] & 255) << 16 | (record[I++] & 255) << 8 | record[I++] & 255;
    }

    private static int getShortFromRecord() {
        return (record[I++] & 255) << 8 | record[I++] & 255;
    }

    public static void b(int var0) {
        DataStore.a(var0, 255);
    }

    public static void c() {
        DataStore.a(0, 128);
    }

    public static void a(String var0) {
        x.b(var0);
    }

    public static void d(int var0) {
        x.e(var0);
    }
}
