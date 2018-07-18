//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

final class f extends aa {
    private d[] a;
    private int b;
    private int d;
    private int e;
    private boolean g;
    private boolean h;
    private static at[] i;
    private q j;
    private d[] k;
    private at[] l;
    private int m;
    private int n;
    private int o;
    private int q;
    private static ap[] r = new ap[]{new ap(1, 150, 1, 0, new q(0, 0), new z(0, 0, 86, 19), 16388, false), new ap(2, 150, 1, 0, new q(0, 0), new z(0, 19, 86, 19), 16388, false), new ap(3, 150, 1, 0, new q(0, 0), new z(0, 57, 86, 19), 16388, false), new ap(4, 150, 1, 0, new q(0, 0), new z(0, 76, 86, 19), 16388, false), new ap(5, 150, 1, 0, new q(0, 0), new z(0, 95, 86, 19), 16388, false), new ap(6, 164, 1, 0, new q(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(7, 164, 1, 0, new q(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(8, 164, 1, 0, new q(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(9, 164, 1, 0, new q(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(10, 164, 1, 0, new q(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(11, 164, 1, 0, new q(0, 0), new z(0, 0, 0, 0), 16388, false), new ap(12, 163, 2, 0, new q(0, 0), new z(0, 0, 13, 14), 16388, false)};

    f() {
    }

    public final boolean a() {
        this.i(1664);
        Canvas.getImage(150, 96);
        this.b = 0;
        this.a = new d[14];
        Canvas.a(this.a);
        Canvas.a(this.a, r);
        boolean var1 = (aiClass.a & 16) == 0;
        this.a[2].a(150, 1, var1?new z(0, 19, 86, 19):new z(0, 38, 86, 19));
        Canvas.option(0, null);
        Canvas.option(1, null);
        int score = aiClass.score;
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
        Canvas.b(this.a);
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
                    aiClass.y.a(1, 1, "", "", 24);
                }

                if(c == 1) {
                    for(var1 = 0; var1 < 11; ++var1) {
                        this.a[var1].setFlag2(true);
                    }

                    if(!acClass.a) {
                        this.a[4].setFlag2(false);
                    }
                } else if(aiClass.y.d()) {
                    this.h(1);
                }

                this.d();
                return;
            case 1:
                if(c == 0) {
                    Canvas.option(1, "返回");
                    Canvas.option(0, null);
                }

                if(Canvas.d(1048576)) {
                    switch(this.b) {
                        case 0:
                            this.h(4);
                            break;
                        case 1:
                            if((aiClass.a & 16) != 0) {
                                aiClass.a &= -17;
                                this.a[2].a(150, 1, new z(0, 19, 86, 19));
                                Canvas.b(true);
                            } else {
                                aiClass.a |= 16;
                                this.a[2].a(150, 1, new z(0, 38, 86, 19));
                                Canvas.b(false);
                            }

                            aiClass.a(0);
                            break;
                        case 2:
                            this.h(3);
                            break;
                        case 3:
                            this.h(7);
                    }
                } else if(Canvas.d(4194304)) {
                    this.e = 5;
                    this.h(2);
                } else if(Canvas.e(131072)) {
                    if(--this.b < 0) {
                        if(acClass.a) {
                            this.b = 3;
                        } else {
                            this.b = 2;
                        }
                    }

                    this.d = 0;
                } else if(Canvas.e(524288)) {
                    if(acClass.a) {
                        if(++this.b >= 4) {
                            this.b = 0;
                        }
                    } else if(++this.b >= 3) {
                        this.b = 0;
                    }

                    this.d = 0;
                }

                this.j = this.a[1 + this.b].f();
                this.a[12].f(this.j.a - 24, this.j.b + 10);
                this.a[12].setFlag2(this.d / 3 % 2 == 0);
                this.a[12].b(2);
                ++this.d;
                return;
            case 2:
                if(c == 0) {
                    this.a[12].setFlag2(false);
                    aiClass.y.a(1);
                } else if(aiClass.y.e()) {
                    for(var1 = 0; var1 < 12; ++var1) {
                        this.a[var1].setFlag2(false);
                    }

                    this.f(this.e);
                    Canvas.nullImage(150);
                    Canvas.nullImage(133);
                    Canvas.nullImage(205);
                }

                this.d();
                return;
            case 3:
                if(!this.g) {
                    this.n = 0;
                    this.o = 0;
                    this.m = 0;
                    this.l = new at[1];
                    Canvas.a(this.l);
                    this.k = new d[3];
                    Canvas.a(this.k);
                    this.k[0].b(240, 320);
                    this.k[0].setColor(14993624);
                    this.k[0].g(6144);
                    this.k[1].a(163, 0, new z(13, 0, 12, 15));
                    this.k[1].g(6143);
                    this.k[1].setFlag2(false);
                    this.k[2].a(163, 0, new z(25, 0, 12, 15));
                    this.k[2].g(6143);
                    this.k[2].setFlag2(false);
                    this.e();
                    Canvas.option(1, "返回");
                    Canvas.option(0, null);
                    this.g = true;
                    return;
                }

                c = this.getC();
                switch(this.m) {
                    case 0:
                        Canvas.option(1, "返回");
                        Canvas.option(0, null);
                        this.k[1].setFlag2(true);
                        this.k[2].setFlag2(true);
                        this.m = 1;
                        this.g(0);
                        break;
                    case 1:
                        if(!Canvas.e(65536) && !Canvas.e(131072)) {
                            if(!Canvas.e(262144) && !Canvas.e(524288)) {
                                if(Canvas.d(4194304)) {
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

                var2 = Canvas.sin(18 * (this.n % 6)) << 3 >> 8;
                this.k[1].f(20 - var2, 160);
                this.k[2].f(var2 + 220, 160);
                ++this.n;
                if(!this.g) {
                    Canvas.b(this.k);
                    this.k = null;
                    Canvas.b(this.l);
                    this.l = null;
                    this.h(1);
                    return;
                }
                break;
            case 4:
                if(!this.h) {
                    if(aiClass.x != null) {
                        aiClass.x.e();
                    }

                    this.i(1536);
                    this.n = 0;
                    this.o = 0;
                    this.q = 4 + aiClass.l / 9;
                    this.m = 0;
                    this.l = new at[1];
                    Canvas.a(this.l);
                    this.k = new d[3];
                    Canvas.a(this.k);
                    this.k[0].b(240, 320);
                    this.k[0].setColor(14674610);
                    this.k[0].g(6144);
                    this.k[1].a(163, 0, new z(13, 0, 12, 15));
                    this.k[1].g(6143);
                    this.k[1].setFlag2(false);
                    this.k[2].a(163, 0, new z(25, 0, 12, 15));
                    this.k[2].g(6143);
                    this.k[2].setFlag2(false);
                    this.f();
                    Canvas.option(1, "返回");
                    Canvas.option(0, null);
                    this.h = true;
                    return;
                }

                c = this.getC();
                switch(this.m) {
                    case 0:
                        Canvas.option(1, "返回");
                        Canvas.option(0, null);
                        this.m = 1;
                        this.g(0);
                        break;
                    case 1:
                        if(c == 0) {
                            this.k[1].setFlag2(true);
                            this.k[2].setFlag2(true);
                        } else if(this.o == 2 && c % 15 == 0) {
                            this.f();
                        } else {
                            if(!Canvas.e(65536) && !Canvas.e(131072)) {
                                if(!Canvas.e(262144) && !Canvas.e(524288)) {
                                    if(Canvas.d(4194304)) {
                                        this.m = 2;
                                        this.g(0);
                                    }
                                    break;
                                }

                                if(++this.o >= this.q) {
                                    this.o = 0;
                                }

                                this.f();
                                break;
                            }

                            if(--this.o < 0) {
                                this.o = this.q - 1;
                            }

                            this.f();
                        }
                        break;
                    case 2:
                        if(c == 2) {
                            Canvas.option(0, null);
                            this.h = false;
                        }
                }

                var2 = Canvas.sin(18 * (this.n % 6)) << 3 >> 8;
                this.k[1].f(20 - var2, 160);
                this.k[2].f(var2 + 220, 160);
                ++this.n;
                if(!this.h) {
                    Canvas.b(this.k);
                    this.k = null;
                    Canvas.b(this.l);
                    this.l = null;
                    this.h(1);
                    if(aiClass.x != null) {
                        aiClass.x.d();
                        return;
                    }
                }
            case 5:
            case 6:
            default:
                break;
            case 7:
                if(c == 0) {
                    Canvas.a(i = new at[1]);
                    i[0].setColor(10703744);
                    i[0].a(12, 12);
                    i[0].f(240 - Canvas.font.stringWidth("是否返回主菜单？") >> 1, 160);
                    i[0].a("是否返回主菜单？");
                    i[0].g(0);
                    i[0].setFlag2(true);
                    this.a[13].b(240, 320);
                    this.a[13].setColor(14993624);
                    this.a[13].g(1);
                    this.a[13].setFlag2(true);
                    Canvas.option(1, "否");
                    Canvas.option(0, "是");
                    return;
                }

                if(Canvas.d(4194304)) {
                    i[0].setFlag2(false);
                    this.a[13].setFlag2(false);
                    this.a[13].b(0, 0);
                    this.e = 6;
                    this.h(1);
                    return;
                }

                if(Canvas.d(2097152)) {
                    i[0].setFlag2(false);
                    this.a[13].setFlag2(false);
                    this.a[13].b(0, 0);
                    this.e = 6;
                    this.h(2);
                }
        }

    }

    private void d() {
        this.j = aiClass.y.g();
        this.a[1].f(this.j.a + 56, this.j.b + 72);
        this.a[2].f(this.j.a + 56, this.j.b + 100);
        this.a[3].f(this.j.a + 56, this.j.b + 125);
        this.a[4].f(this.j.a + 56, this.j.b + 150);
        this.a[5].f(this.j.a + 34, this.j.b + 180);
        this.a[6].f(this.j.a + 78, this.j.b + 184);
        this.a[7].f(this.j.a + 88, this.j.b + 184);
        this.a[8].f(this.j.a + 98, this.j.b + 184);
        this.a[9].f(this.j.a + 108, this.j.b + 184);
        this.a[10].f(this.j.a + 118, this.j.b + 184);
        this.a[11].f(this.j.a + 128, this.j.b + 184);
    }

    private void e() {
        this.l[0].f(36, 24);
        this.l[0].a(12, 25);
        this.l[0].g(6142);
        this.l[0].a(86 + this.o);
        this.l[0].setColor(10703744);
    }

    private void f() {
        this.l[0].f(36, 24);
        this.l[0].a(12, 25);
        this.l[0].g(6142);
        this.l[0].setColor(5470627);
        int hour;
        int minute;
        int second;
        switch(this.o) {
            case 0:
                String _message = Canvas.getMessage(245);     // "───────　部落人数▽"
                _message = _message + Canvas.getMessage(246); // "男  -------　"
                _message = _message + acClass.getNumberString(aiClass.records[0], 4, true);
                _message = _message + Canvas.getMessage(249); // " ▽"
                _message = _message + Canvas.getMessage(247); // "女  -------　"
                _message = _message + acClass.getNumberString(aiClass.records[1], 4, true);
                _message = _message + Canvas.getMessage(249); // " ▽"
                _message = _message + Canvas.getMessage(248); // "合计  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[2], 4, true);
                _message = _message + Canvas.getMessage(250); // " ▽▽"
                _message = _message + Canvas.getMessage(251); // "───────　死亡人数▽"
                _message = _message + Canvas.getMessage(252); // "寿终  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[3], 4, true);
                _message = _message + Canvas.getMessage(249); // " ▽"
                _message = _message + Canvas.getMessage(253); // "饿死  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[4], 4, true);
                _message = _message + Canvas.getMessage(249); // " ▽"
                _message = _message + Canvas.getMessage(254); // "病死  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[5], 4, true);
                _message = _message + Canvas.getMessage(249); // " ▽"
                _message = _message + Canvas.getMessage(255); // "伤亡  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[6], 4, true);
                _message = _message + Canvas.getMessage(249); // " ▽"
                this.l[0].a(_message);
                return;
            case 1:
                _message = Canvas.getMessage(256);            // "───────　狩猎记录▽"
                _message = _message + Canvas.getMessage(257); // "兔子  -------　"
                _message = _message + acClass.getNumberString(aiClass.records[9], 4, true);
                _message = _message + Canvas.getMessage(249); // " ▽"
                _message = _message + Canvas.getMessage(258); // "羚羊  -------　"
                _message = _message + acClass.getNumberString(aiClass.records[10], 4, true);
                _message = _message + Canvas.getMessage(249); //
                _message = _message + Canvas.getMessage(259); // "老虎  -------　"
                _message = _message + acClass.getNumberString(aiClass.records[11], 4, true);
                _message = _message + Canvas.getMessage(249);
                _message = _message + Canvas.getMessage(260); // "猛犸象  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[12], 4, true);
                _message = _message + Canvas.getMessage(249);
                _message = _message + Canvas.getMessage(261); // "鱼   ---------　"
                _message = _message + acClass.getNumberString(aiClass.records[13], 4, true);
                _message = _message + Canvas.getMessage(249);
                _message = _message + Canvas.getMessage(262); // "鹦鹉螺  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[14], 4, true);
                _message = _message + Canvas.getMessage(249);
                _message = _message + Canvas.getMessage(263); // "鲸鱼  -------　"
                _message = _message + acClass.getNumberString(aiClass.records[15], 4, true);
                _message = _message + Canvas.getMessage(249);
                _message = _message + Canvas.getMessage(264); // "恐龙  -------　"
                _message = _message + acClass.getNumberString(aiClass.records[16], 4, true);
                _message = _message + Canvas.getMessage(249);
                _message = _message + Canvas.getMessage(265); // "合计  ----　"
                _message = _message + acClass.getNumberString(aiClass.records[17], 5, true);
                _message = _message + Canvas.getMessage(249);
                this.l[0].a(_message);
                return;
            case 2:
                _message = Canvas.getMessage(266);            // "───────　采集记录▽"
                _message = _message + Canvas.getMessage(267); // "食物  --- "
                _message = _message + acClass.getNumberString(aiClass.records[7], 5, true);
                _message = _message + Canvas.getMessage(268); // "个▽▽"
                _message = _message + Canvas.getMessage(269); // "───────　石器记录▽"
                _message = _message + Canvas.getMessage(270); // "石器  --- "
                _message = _message + acClass.getNumberString(aiClass.records[8], 5, true);
                _message = _message + Canvas.getMessage(268); // "个▽▽"
                _message = _message + Canvas.getMessage(276); // "───────　其　它▽"
                _message = _message + Canvas.getMessage(271); // "积分  --- "
                _message = _message + acClass.getNumberString(aiClass.score, 6, true);
                _message = _message + Canvas.getMessage(272); // "点▽"
                hour = aiClass.gameTime / 54000 % 99; // '티': 54000
                minute = aiClass.gameTime % 54000 / 900 % 60; // '티': 54000
                second = aiClass.gameTime / 15 % 60;
                _message = _message + Canvas.getMessage(273); // "计时＝"
                _message = _message + acClass.getNumberString(hour, 2, true);
                _message = _message + "：";
                _message = _message + acClass.getNumberString(minute, 2, true);
                _message = _message + "：";
                _message = _message + acClass.getNumberString(second, 2, true);
                this.l[0].a(_message);
                return;
            default:
                hour = (this.o - 3) * 9;
                this.l[0].f(6, 24);
                _message = Canvas.getMessage(275); // "─────────　大事记▽"

                for(minute = 0; minute < 9; ++minute) {
                    for(second = 0; second < 20; ++second) {
                        _message = _message + String.valueOf(aiClass.n[hour * 20 + second]);
                    }

                    _message = _message + "▽";
                    if(hour >= 64 || hour >= aiClass.l) {
                        break;
                    }

                    ++hour;
                }

                String s = "";

                for(hour = 0; hour < _message.length(); ++hour) {
                    if(_message.charAt(hour) != 0) {
                        s = s + _message.charAt(hour);
                    }
                }

                this.l[0].a(s);
        }
    }
}
