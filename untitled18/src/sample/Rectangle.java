package sample;

import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    public Rectangle(){
        type = "Прямогугольник";
    }

    @Override
    public void draw(GraphicsContext gr, Double pointX, Double pointY) {
        gr.setFill(Color.RED);
        gr.fillPolygon(new double[]{pointX, pointX+25, pointX+25, pointX}, new double[]{pointY, pointY, pointY+75, pointY+75}, 4);
    }

    public String toString(){
        return "Rectangle";
    }
}