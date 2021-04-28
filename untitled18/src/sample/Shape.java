package sample;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;

public abstract class Shape implements Cloneable{
    String type;
    String name;
    Character prefix;
    protected String style;
    protected double w;
    protected double h;
    protected double x;
    protected double y;
    public abstract void draw(Pane pane, Double pointX, Double pointY);
    public abstract Node getPicture();

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