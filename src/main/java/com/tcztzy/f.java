//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class f extends DataStoreBase {
    private d[] a;
    private int b;
    private int d;
    private int e;
    private boolean g;
    private boolean h;
    private static at i;
    private Point j;
    private d[] k;
    private at[] l;
    private int m;
    private int n;
    private int o;
    private int q;
    private static ap[] r = new ap[]{new ap(1, 150, 1, 0, new Point(0, 0), new z(0, 0, 86, 19), 16388, false), new ap(2, 150, 1, 0, new Point(0, 0), new z(0, 19, 86, 19), 16388, false), new ap(3, 150, 1, 0, new Point(0, 0), new z(0, 57, 86, 19), 16388, false), new ap(4, 150, 1, 0, new Point(0, 0), new z(0, 76, 86, 19), 16388, false), new ap(5, 150, 1, 0, new Point(0, 0), new z(0, 95, 86, 19), 16388, false), new ap(6, 164, 1, 0, new Point(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(7, 164, 1, 0, new Point(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(8, 164, 1, 0, new Point(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(9, 164, 1, 0, new Point(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(10, 164, 1, 0, new Point(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(11, 164, 1, 0, new Point(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(12, 163, 2, 0, new Point(0, 0), new z(0, 0, 13, 14), 16388, false)};

    f() {
    }

    public final boolean a() {
        this.i(1664);
        MankeyManCanvas.setImage(150, 96);
        this.b = 0;
        this.a = new d[14];
        MankeyManCanvas.a(this.a);
        MankeyManCanvas.a(this.a, r);
        boolean var1 = (MankeyManRecordStore.a & 16) == 0;
        this.a[2].a(150, 1, var1?new z(0, 19, 86, 19):new z(0, 38, 86, 19));
        MankeyManCanvas.option(0, null);
        MankeyManCanvas.option(1, null);
        int score = MankeyManRecordStore.score;
        int var2 = 100000;

        for(int digit = 0; digit < 6; var2 /= 10) {
            int var4 = score / var2;
            score -= var4 * var2;
            this.a[digit + 6].a(143, 1, new z(var4 << 3, 0, 8, 10));
            ++digit;
        }

        this.d();
        return true;
    }

    public final void b() {
        MankeyManCanvas.b(this.a);
        this.a = null;
    }

    public final void c() {
        int c = this.getC();
        int var1;
        int var2;
        switch(this.getD()) {
            case 0:
                if(c == 0) {
                    this.a[12].setFlag2(false);
                    MankeyManRecordStore.y.a(1, 1, "", "", 24);
                }

                if(c == 1) {
                    for(var1 = 0; var1 < 11; ++var1) {
                        this.a[var1].setFlag2(true);
                    }

                    if(!DataStore.a) {
                        this.a[4].setFlag2(false);
                    }
                } else if(MankeyManRecordStore.y.d()) {
                    this.h(1);
                }

                this.d();
                return;
            case 1:
                if(c == 0) {
                    MankeyManCanvas.option(1, "返回");
                    MankeyManCanvas.option(0, null);
                }

                if(MankeyManCanvas.d(1048576)) {
                    switch(this.b) {
                        case 0:
                            this.h(4);
                            break;
                        case 1:
                            if((MankeyManRecordStore.a & 16) != 0) {
                                MankeyManRecordStore.a &= -17;
                                this.a[2].a(150, 1, new z(0, 19, 86, 19));
                                MankeyManCanvas.b(true);
                            } else {
                                MankeyManRecordStore.a |= 16;
                                this.a[2].a(150, 1, new z(0, 38, 86, 19));
                                MankeyManCanvas.b(false);
                            }

                            MankeyManRecordStore.a(0);
                            break;
                        case 2:
                            this.h(3);
                            break;
                        case 3:
                            this.h(7);
                    }
                } else if(MankeyManCanvas.d(4194304)) {
                    this.e = 5;
                    this.h(2);
                } else if(MankeyManCanvas.e(131072)) {
                    if(--this.b < 0) {
                        if(DataStore.a) {
                            this.b = 3;
                        } else {
                            this.b = 2;
                        }
                    }

                    this.d = 0;
                } else if(MankeyManCanvas.e(524288)) {
                    if(DataStore.a) {
                        if(++this.b >= 4) {
                            this.b = 0;
                        }
                    } else if(++this.b >= 3) {
                        this.b = 0;
                    }

                    this.d = 0;
                }

                this.j = this.a[1 + this.b].f();
                this.a[12].f(this.j.x - 24, this.j.y + 10);
                this.a[12].setFlag2(this.d / 3 % 2 == 0);
                this.a[12].changeTransform(2);
                ++this.d;
                return;
            case 2:
                if(c == 0) {
                    this.a[12].setFlag2(false);
                    MankeyManRecordStore.y.a(1);
                } else if(MankeyManRecordStore.y.e()) {
                    for(var1 = 0; var1 < 12; ++var1) {
                        this.a[var1].setFlag2(false);
                    }

                    this.f(this.e);
                    MankeyManCanvas.nullImage(150);
                    MankeyManCanvas.nullImage(133);
                    MankeyManCanvas.nullImage(205);
                }

                this.d();
                return;
            case 3:
                if(!this.g) {
                    this.n = 0;
                    this.o = 0;
                    this.m = 0;
                    this.l = new at[1];
                    MankeyManCanvas.a(this.l);
                    this.k = new d[3];
                    MankeyManCanvas.a(this.k);
                    this.k[0].setStart(240, 320);
                    this.k[0].setColor(14993624);
                    this.k[0].g(6144);
                    this.k[1].a(163, 0, new z(13, 0, 12, 15));
                    this.k[1].g(6143);
                    this.k[1].setFlag2(false);
                    this.k[2].a(163, 0, new z(25, 0, 12, 15));
                    this.k[2].g(6143);
                    this.k[2].setFlag2(false);
                    this.e();
                    MankeyManCanvas.option(1, "返回");
                    MankeyManCanvas.option(0, null);
                    this.g = true;
                    return;
                }

                c = this.getC();
                switch(this.m) {
                    case 0:
                        MankeyManCanvas.option(1, "返回");
                        MankeyManCanvas.option(0, null);
                        this.k[1].setFlag2(true);
                        this.k[2].setFlag2(true);
                        this.m = 1;
                        this.g(0);
                        break;
                    case 1:
                        if(!MankeyManCanvas.e(65536) && !MankeyManCanvas.e(131072)) {
                            if(!MankeyManCanvas.e(262144) && !MankeyManCanvas.e(524288)) {
                                if(MankeyManCanvas.d(4194304)) {
                                    this.m = 2;
                                    this.g(0);
                                }
                                break;
                            }

                            if(++this.o >= 21) {
                                this.o = 0;
                            }

                            this.e();
                            break;
                        }

                        if(--this.o < 0) {
                            this.o = 20;
                        }

                        this.e();
                        break;
                    case 2:
                        if(c == 0) {
                            this.k[1].setFlag2(false);
                            this.k[2].setFlag2(false);
                        } else if(c == 2) {
                            this.g = false;
                        }
                }

                var2 = MankeyManCanvas.sin(18 * (this.n % 6)) << 3 >> 8;
                this.k[1].f(20 - var2, 160);
                this.k[2].f(var2 + 220, 160);
                ++this.n;
                if(!this.g) {
                    MankeyManCanvas.b(this.k);
                    this.k = null;
                    MankeyManCanvas.b(this.l);
                    this.l = null;
                    this.h(1);
                    return;
                }
                break;
            case 4:
                if(!this.h) {
                    if(MankeyManRecordStore.x != null) {
                        MankeyManRecordStore.x.e();
                    }

                    this.i(1536);
                    this.n = 0;
                    this.o = 0;
                    this.q = 4 + MankeyManRecordStore.l / 9;
                    this.m = 0;
                    this.l = new at[1];
                    MankeyManCanvas.a(this.l);
                    this.k = new d[3];
                    MankeyManCanvas.a(this.k);
                    this.k[0].setStart(240, 320);
                    this.k[0].setColor(14674610);
                    this.k[0].g(6144);
                    this.k[1].a(163, 0, new z(13, 0, 12, 15));
                    this.k[1].g(6143);
                    this.k[1].setFlag2(false);
                    this.k[2].a(163, 0, new z(25, 0, 12, 15));
                    this.k[2].g(6143);
                    this.k[2].setFlag2(false);
                    this.someMethod();
                    MankeyManCanvas.option(1, "返回");
                    MankeyManCanvas.option(0, null);
                    this.h = true;
                    return;
                }

                c = this.getC();
                switch(this.m) {
                    case 0:
                        MankeyManCanvas.option(1, "返回");
                        MankeyManCanvas.option(0, null);
                        this.m = 1;
                        this.g(0);
                        break;
                    case 1:
                        if(c == 0) {
                            this.k[1].setFlag2(true);
                            this.k[2].setFlag2(true);
                        } else if(this.o == 2 && c % 15 == 0) {
                            this.someMethod();
                        } else {
                            if(!MankeyManCanvas.e(65536) && !MankeyManCanvas.e(131072)) {
                                if(!MankeyManCanvas.e(262144) && !MankeyManCanvas.e(524288)) {
                                    if(MankeyManCanvas.d(4194304)) {
                                        this.m = 2;
                                        this.g(0);
                                    }
                                    break;
                                }

                                if(++this.o >= this.q) {
                                    this.o = 0;
                                }

                                this.someMethod();
                                break;
                            }

                            if(--this.o < 0) {
                                this.o = this.q - 1;
                            }

                            this.someMethod();
                        }
                        break;
                    case 2:
                        if(c == 2) {
                            MankeyManCanvas.option(0, null);
                            this.h = false;
                        }
                }

                var2 = MankeyManCanvas.sin(18 * (this.n % 6)) << 3 >> 8;
                this.k[1].f(20 - var2, 160);
                this.k[2].f(var2 + 220, 160);
                ++this.n;
                if(!this.h) {
                    MankeyManCanvas.b(this.k);
                    this.k = null;
                    MankeyManCanvas.b(this.l);
                    this.l = null;
                    this.h(1);
                    if(MankeyManRecordStore.x != null) {
                        MankeyManRecordStore.x.d();
                        return;
                    }
                }
            case 5:
            case 6:
            default:
                break;
            case 7:
                if(c == 0) {
                    MankeyManCanvas.a(i = new at());
                    i.setColor(10703744);
                    i.a(12, 12);
                    i.f(240 - MankeyManCanvas.font.stringWidth("是否返回主菜单？") >> 1, 160);
                    i.a("是否返回主菜单？");
                    i.g(0);
                    i.setFlag2(true);
                    this.a[13].setStart(240, 320);
                    this.a[13].setColor(14993624);
                    this.a[13].g(1);
                    this.a[13].setFlag2(true);
                    MankeyManCanvas.option(1, "否");
                    MankeyManCanvas.option(0, "是");
                    return;
                }

                if(MankeyManCanvas.d(4194304)) {
                    i.setFlag2(false);
                    this.a[13].setFlag2(false);
                    this.a[13].setStart(0, 0);
                    this.e = 6;
                    this.h(1);
                    return;
                }

                if(MankeyManCanvas.d(2097152)) {
                    i.setFlag2(false);
                    this.a[13].setFlag2(false);
                    this.a[13].setStart(0, 0);
                    this.e = 6;
                    this.h(2);
                }
        }

    }

    private void d() {
        this.j = MankeyManRecordStore.y.g();
        this.a[1].f(this.j.x + 56, this.j.y + 72);
        this.a[2].f(this.j.x + 56, this.j.y + 100);
        this.a[3].f(this.j.x + 56, this.j.y + 125);
        this.a[4].f(this.j.x + 56, this.j.y + 150);
        this.a[5].f(this.j.x + 34, this.j.y + 180);
        this.a[6].f(this.j.x + 78, this.j.y + 184);
        this.a[7].f(this.j.x + 88, this.j.y + 184);
        this.a[8].f(this.j.x + 98, this.j.y + 184);
        this.a[9].f(this.j.x + 108, this.j.y + 184);
        this.a[10].f(this.j.x + 118, this.j.y + 184);
        this.a[11].f(this.j.x + 128, this.j.y + 184);
    }

    private void e() {
        this.l[0].f(36, 24);
        this.l[0].a(12, 25);
        this.l[0].g(6142);
        this.l[0].a(86 + this.o);
        this.l[0].setColor(10703744);
    }

    private void someMethod() {
        this.l[0].f(36, 24);
        this.l[0].a(12, 25);
        this.l[0].g(6142);
        this.l[0].setColor(5470627);
        int hour;
        int minute;
        int second;
        String m;
        switch(this.o) {
            case 0:
                m = MankeyManCanvas.getMessage(245);
                assert m != null;
                StringBuilder _message = new StringBuilder(m);     // "───────　部落人数▽"
                _message = (_message).append(MankeyManCanvas.getMessage(246)); // "男  -------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[0], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); // " ▽"
                _message.append(MankeyManCanvas.getMessage(247)); // "女  -------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[1], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); // " ▽"
                _message.append(MankeyManCanvas.getMessage(248)); // "合计  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[2], 4, true));
                _message.append(MankeyManCanvas.getMessage(250)); // " ▽▽"
                _message.append(MankeyManCanvas.getMessage(251)); // "───────　死亡人数▽"
                _message.append(MankeyManCanvas.getMessage(252)); // "寿终  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[3], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); // " ▽"
                _message.append(MankeyManCanvas.getMessage(253)); // "饿死  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[4], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); // " ▽"
                _message.append(MankeyManCanvas.getMessage(254)); // "病死  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[5], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); // " ▽"
                _message.append(MankeyManCanvas.getMessage(255)); // "伤亡  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[6], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); // " ▽"
                this.l[0].a(_message.toString());
                return;
            case 1:
                m = MankeyManCanvas.getMessage(256);
                assert m != null;
                _message = new StringBuilder(m);            // "───────　狩猎记录▽"
                _message = (_message).append(MankeyManCanvas.getMessage(257)); // "兔子  -------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[9], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); // " ▽"
                _message.append(MankeyManCanvas.getMessage(258)); // "羚羊  -------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[10], 4, true));
                _message.append(MankeyManCanvas.getMessage(249)); //
                _message.append(MankeyManCanvas.getMessage(259)); // "老虎  -------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[11], 4, true));
                _message.append(MankeyManCanvas.getMessage(249));
                _message.append(MankeyManCanvas.getMessage(260)); // "猛犸象  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[12], 4, true));
                _message.append(MankeyManCanvas.getMessage(249));
                _message.append(MankeyManCanvas.getMessage(261)); // "鱼   ---------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[13], 4, true));
                _message.append(MankeyManCanvas.getMessage(249));
                _message.append(MankeyManCanvas.getMessage(262)); // "鹦鹉螺  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[14], 4, true));
                _message.append(MankeyManCanvas.getMessage(249));
                _message.append(MankeyManCanvas.getMessage(263)); // "鲸鱼  -------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[15], 4, true));
                _message.append(MankeyManCanvas.getMessage(249));
                _message.append(MankeyManCanvas.getMessage(264)); // "恐龙  -------　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[16], 4, true));
                _message.append(MankeyManCanvas.getMessage(249));
                _message.append(MankeyManCanvas.getMessage(265)); // "合计  ----　"
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[17], 5, true));
                _message.append(MankeyManCanvas.getMessage(249));
                this.l[0].a(_message.toString());
                return;
            case 2:
                m = MankeyManCanvas.getMessage(266);
                assert m != null;
                _message = new StringBuilder(m);            // "───────　采集记录▽"
                _message = (_message).append(MankeyManCanvas.getMessage(267)); // "食物  --- "
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[7], 5, true));
                _message.append(MankeyManCanvas.getMessage(268)); // "个▽▽"
                _message.append(MankeyManCanvas.getMessage(269)); // "───────　石器记录▽"
                _message.append(MankeyManCanvas.getMessage(270)); // "石器  --- "
                _message.append(DataStore.getNumberString(MankeyManRecordStore.records[8], 5, true));
                _message.append(MankeyManCanvas.getMessage(268)); // "个▽▽"
                _message.append(MankeyManCanvas.getMessage(276)); // "───────　其　它▽"
                _message.append(MankeyManCanvas.getMessage(271)); // "积分  --- "
                _message.append(DataStore.getNumberString(MankeyManRecordStore.score, 6, true));
                _message.append(MankeyManCanvas.getMessage(272)); // "点▽"
                hour = MankeyManRecordStore.gameTime / 54000 % 99; // '티': 54000
                minute = MankeyManRecordStore.gameTime % 54000 / 900 % 60; // '티': 54000
                second = MankeyManRecordStore.gameTime / 15 % 60;
                _message.append(MankeyManCanvas.getMessage(273)); // "计时＝"
                _message.append(DataStore.getNumberString(hour, 2, true));
                _message.append("：");
                _message.append(DataStore.getNumberString(minute, 2, true));
                _message.append("：");
                _message.append(DataStore.getNumberString(second, 2, true));
                this.l[0].a(_message.toString());
                return;
            default:
                hour = (this.o - 3) * 9;
                this.l[0].f(6, 24);
                m = MankeyManCanvas.getMessage(275);
                assert m != null;
                _message = new StringBuilder(m); // "─────────　大事记▽"

                for(minute = 0; minute < 9; ++minute) {
                    for(second = 0; second < 20; ++second) {
                        _message = (_message).append(String.valueOf(MankeyManRecordStore.n[hour * 20 + second]));
                    }

                    _message.append("▽");
                    if(hour >= 64 || hour >= MankeyManRecordStore.l) {
                        break;
                    }

                    ++hour;
                }

                StringBuilder s = new StringBuilder();

                for(hour = 0; hour < _message.length(); ++hour) {
                    if(_message.charAt(hour) != 0) {
                        s.append(_message.charAt(hour));
                    }
                }

                this.l[0].a(s.toString());
        }
    }
}
