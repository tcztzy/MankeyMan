//
// Source code recreated from option .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tcztzy;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class RegionDraw {
    public RegionDraw() {
    }

    public static void drawRegionA(Graphics graphics, Image image, int x_src, int y_src, int width, int height, int transform, int x_dst, int y_dst, int anchor) {
        graphics.drawRegion(image, x_src, y_src, width, height, transform, x_dst, y_dst, 20);
    }

    public static void drawRegionB(Graphics graphics, Image image, int x_src, int y_src, int width, int height, int transform, int x_dst, int y_dst, int anchor) {
        graphics.drawRegion(image, x_src, y_src, width, height, transform, x_dst, y_dst, 20);
    }
}
