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
import javafx.scene.transform.Rotate;
public class Nodes extends Shape{
    public Nodes(){
        prefix=new Character(' ');
        name=new String("Узел(Node)");
        type=new String("");
        x=1;
        y=1;
        w=130;
        h=70;
        style="-fx-font-weight: 800; -fx-font-size: 16; -fx-alignment: center; -fx-min-width: 50; -fx-min-height: 20; -fx-background-color: darkslateblue; -fx-text-fill: black; -fx-border-insets: 3; -fx-border-width: 1; -fx-border-style: solid;";
    }
    @Override
    public void draw(Pane pane, Double pointX, Double pointY) {
        TextField textField = (TextField) getPicture();// для отображения
        textField.setPrefSize(w, h);
        textField.setLayoutX(pointX);
        textField.setLayoutY(pointY);
        Label label = new Label();
        label.setPrefSize(w, h);
        label.setLayoutX(pointX+10);
        label.setLayoutY(pointY-10);
        label.setStyle("-fx-background-color: darkslateblue; -fx-border-width:2; -fx-border-color: darkslateblue; ");
        textField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.SECONDARY)
                {
                    pane.getChildren().remove(textField);
                    pane.getChildren().remove(label);
                }
            }
        });
        pane.getChildren().add(label);
        pane.getChildren().add(textField);
    }
    @Override
    public void draw_for_list(Pane pane, double v, double v1) {
        TextField textField = (TextField) getPicture();// для отображения
        textField.setPrefSize(w, h);
        textField.setLayoutX(v);
        textField.setLayoutY(v1);

        Label label = new Label();
        label.setPrefSize(w, h);
        label.setLayoutX(v+10);
        label.setLayoutY(v1-10);
        label.setStyle("-fx-background-color: darkslateblue; -fx-border-width:2; -fx-border-color: darkslateblue; ");

        pane.getChildren().add(label);
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
