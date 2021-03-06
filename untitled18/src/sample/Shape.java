package sample;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape implements Cloneable{
    protected  String type;
    public abstract void draw(GraphicsContext gr, Double pointX, Double pointY);



    @Override
    public String toString(){
        return super.toString();
    }

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println("asd");
        }
        return clone;
    }

}