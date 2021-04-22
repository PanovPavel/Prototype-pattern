package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {
    public Square(){
        type = "Квадрат";
    }
    @Override
    public void draw(GraphicsContext gr, Double pointX, Double pointY) {
        gr.setFill(Color.BLUE);
        gr.fillPolygon(new double[]{pointX, pointX+50, pointX+50, pointX}, new double[]{pointY, pointY, pointY+50, pointY+50}, 4);
    }
}
