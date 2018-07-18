//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.lcdui.Graphics;

final class at extends wClass {
    private ImageSize d = new ImageSize(12, 12);
    private ImageSize e = new ImageSize(240, 320);
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int whiteDownTriangleNumber;
    private int m = 0;
    private boolean n = false;
    private String message = null;

    at() {
        super.flags |= 16;
    }

    public final void a() {
        if(this.message != null && !this.n) {
            if(this.message.length() > this.h) {
                if(this.i == 0) {
                    this.h = this.message.length();
                } else if(++this.j >= this.i) {
                    ++this.h;
                    this.j = 0;
                }
            } else {
                this.n = true;
            }
        }

        super.a();
    }

    public final void a(Graphics graphics) {
        if(this.message != null) {
            int fontSize = 8;
            graphics.setFont(MankeyManCanvas.setFontSize(fontSize));
            graphics.setColor(super.color);
            int fontHeight = MankeyManCanvas.setFontSize(fontSize).getHeight();
            int x_shift = super.a.x;
            int y_shift = super.a.y + fontHeight;
            int var5 = 0;
            int var6 = 0;
            if((super.flags & 16) != 0) {
                int j = 0;

                for(int i = 0; i < this.h; ++i) {
                    if(this.message.charAt(i) == 9661/* ▽ */ || i == this.message.length() - 1) {
                        ++var6;
                        if(i > 0 &&
                                x_shift >= 0 - fontHeight - (i - j) * fontHeight &&
                                x_shift <= fontHeight + 240 &&
                                y_shift >= 0 - fontHeight &&
                                y_shift <= fontHeight + 320 &&
                                0 < this.e.width &&
                                var5 < this.e.height &&
                                var6 > this.m) {
                            if(this.message.charAt(i) == 9661/* ▽ */) {
                                graphics.drawString(this.message.substring(j, i), wClass.c.x + x_shift, wClass.c.y + y_shift, 68);
                            } else {
                                graphics.drawString(this.message.substring(j, i + 1), wClass.c.x + x_shift, wClass.c.y + y_shift, 68);
                            }
                        }

                        y_shift += this.d.height;
                        var5 += this.d.height;
                        j = i + 1;
                        if(var6 <= this.m) {
                            var5 = 0;
                            y_shift = super.a.y + fontHeight;
                        }
                    }
                }
            }
        }

    }

    void a(String message) {
        this.i = 0;
        this.j = 0;
        this.h = 0;
        int messageLength;
        this.n = false;
        this.message = message;
        this.m = 0;
        this.whiteDownTriangleNumber = 0;
        if(this.message != null) {
            messageLength = this.message.length();

            for(int i = 0; i < messageLength; ++i) {
                if(this.message.charAt(i) == 9661/* ▽ */) {
                    ++this.whiteDownTriangleNumber;
                }
            }
        }

    }

    public final void a(int messageId) {
        this.a(MankeyManCanvas.getMessage(messageId));
    }

    public final void a(int var1, int var2) {
        this.d.width = 12;
        this.d.height = var2;
    }

    public final void a(ImageSize imageSize) {
        this.e.width = imageSize.width;
        this.e.height = imageSize.height;
    }

    final int getWhiteDownTriangleNumber() {
        return this.whiteDownTriangleNumber;
    }

    public final void b(int var1) {
        this.m = var1;
    }
}
