package sample;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.event.*;
import javafx.scene.input.MouseButton;
public class Square extends Shape{
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
        TextField textField = (TextField) getPicture();// для отображения
        textField.setPrefSize(w, h);
        textField.setLayoutX(pointX);
        textField.setLayoutY(pointY);
        textField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.SECONDARY)
                {
                    pane.getChildren().remove(textField);
                }
            }
        });
        pane.getChildren().add(textField);

    }

    @Override
    public Node getPicture() {
        String text = new String(prefix.toString());
        text +=" "+name+":"+type;
        TextField field = new TextField(text);
        field.setStyle(style);

        return field;
    }
}
