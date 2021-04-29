package sample;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Obj extends Shape{
    public Obj(){
        prefix=new Character(' ');
        name=new String("Объект");
        type=new String("");
        x=1;
        y=1;
        w=130;
        h=70;
        style="-fx-font-weight: 60; -fx-font-size: 14; -fx-alignment: center; -fx-min-width: 50; -fx-min-height: 20; -fx-background-color: white; -fx-text-fill: black; -fx-border-insets: 3; -fx-border-width: 1; -fx-border-style: solid;";
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
    public void draw_for_list(Pane pane, double v, double v1) {
        TextField textField = (TextField) getPicture();// для отображения
        textField.setPrefSize(w, h);
        textField.setLayoutX(v);
        textField.setLayoutY(v1);
        pane.getChildren().add(textField);
    }
    @Override
    public Node getPicture() {
        String text = new String(prefix.toString());
        text +=" "+name+" "+type;
        TextField field = new TextField(text);
        field.setStyle(style);

        return field;
    }


}
