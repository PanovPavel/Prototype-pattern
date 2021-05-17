/*package sample;
import javafx.scene.layout.Pane;

import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import java.awt.event.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;

public class Rectangle extends Shape implements MouseListener{
    public Rectangle(){
        type = "Прямогугольник";
    }

    @Override
    public void draw(GraphicsContext gr, Double pointX, Double pointY) {
        gr.setFill(Color.RED);
        gr.fillPolygon(new double[]{pointX, pointX+25, pointX+25, pointX}, new double[]{pointY, pointY, pointY+75, pointY+75}, 4);
        gr.fillText("asd", pointX+20, pointY+20);
    }

    public String toString(){
        return "Rectangle";
    }
    public void init() {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        System.out.println("asddsa");
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

}*/