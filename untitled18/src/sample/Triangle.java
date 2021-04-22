package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {
    public Triangle(){
        type = "Треугольник";
    }
    @Override
    public void draw(GraphicsContext gr, Double pointX, Double pointY) {
        gr.setFill(Color.GREEN);
        gr.fillPolygon(new double[]{pointX, pointX+50, pointX+25}, new double[]{pointY, pointY, pointY+50}, 3);
    }
}
