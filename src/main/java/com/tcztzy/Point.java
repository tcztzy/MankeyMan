//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

final class Point {
    public int x;
    public int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public final void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final void moveTo(Point point) {
        this.x = point.x;
        this.y = point.y;
    }
}
