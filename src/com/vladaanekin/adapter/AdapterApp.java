package com.vladaanekin.adapter;

public class AdapterApp {

    public static void main(String[] args) {

        // 1 способ реализацыи, через наследования
        VectorGraphics vg = new VectorAdaptersFromRaster();

        vg.drawLine();
        vg.drawSquare();



        // 2 способ реализацыи, через композитор
        VectorGraphics vg2 = new VectorAdaptersFromRaster();

        vg2.drawLine();
        vg2.drawSquare();
    }

}

interface VectorGraphics {
    void drawLine();
    void drawSquare();
}

class RasterGraphics{

    void drawRasterLine(){
        System.out.println("Рисуем линию");
    }
    void drawRasterSquare(){
        System.out.println("Рисуем квадрат");
    }
}

class VectorAdaptersFromRaster extends RasterGraphics implements VectorGraphics {

    public void drawLine() {
        drawRasterLine();
    }

    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdaptersFromRaster2 implements VectorGraphics {

    RasterGraphics rasterGraphics = new RasterGraphics();

    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}