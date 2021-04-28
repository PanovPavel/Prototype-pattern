package sample;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;

public class Square extends Shape {
    public Square(){
        prefix=new Character('-');
        name=new String("varname");
        type=new String("typevar");
        x=1;
        y=1;
        w=130;
        h=70;
        style="-fx-min-width: 50; -fx-min-height: 20; -fx-background-color: darkslateblue; -fx-text-fill: black; -fx-border-insets: 3; -fx-border-width: 1; -fx-border-style: solid;";
    }

    @Override
    public void draw(Pane pane, Double pointX, Double pointY) {
        Label field = (Label) getPicture();// для отображения
        field.setPrefSize(w, h);
        field.setLayoutX(pointX);
        field.setLayoutY(pointY);
        pane.getChildren().add(field);

    }

    @Override
    public Node getPicture() {
        String text = new String(prefix.toString());
        text +=" "+name+":"+type;
        Label field = new Label(text);
        field.setStyle(style);
        return field;
    }
}
