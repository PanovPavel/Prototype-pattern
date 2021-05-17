package sample;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;

public class Component extends Shape {
    public Component() {
        prefix = new Character(' ');
        name = new String("Компонент");
        type = new String("");
        x = 1;
        y = 1;
        w = 130;
        h = 70;
        style = "-fx-font-weight: 60; -fx-font-size: 14; -fx-alignment: center; -fx-min-width: 50; -fx-min-height: 20; -fx-background-color: white; -fx-text-fill: black; -fx-border-color: black; -fx-border-width: 1;";
    }

    @Override
    public void draw(Pane pane, Double pointX, Double pointY) {
        TextField textField = (TextField) getPicture();// для отображения
        textField.setPrefSize(w, h);
        textField.setLayoutX(pointX);
        textField.setLayoutY(pointY);

        Label label = new Label();
        label.setPrefSize(30, 1.0);
        label.setLayoutX(pointX - 15);
        label.setLayoutY(pointY + 10);
        label.setStyle("-fx-background-color: white; -fx-border-color: black");

        Label label2 = new Label();
        label2.setPrefSize(30, 1.0);
        label2.setLayoutX(pointX - 15);
        label2.setLayoutY(pointY + 40);
        label2.setStyle("-fx-background-color: white; -fx-border-color: black");
        textField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.SECONDARY) {
                    pane.getChildren().remove(textField);
                    pane.getChildren().remove(label);
                    pane.getChildren().remove(label2);

                }
            }
        });
        pane.getChildren().add(textField);
        pane.getChildren().add(label);
        pane.getChildren().add(label2);
    }

    @Override
    public void draw_for_list(Pane pane, double v, double v1) {
        TextField textField = (TextField) getPicture();// для отображения
        textField.setPrefSize(w, h);
        textField.setLayoutX(v);
        textField.setLayoutY(v1);

        Label label = new Label();
        label.setPrefSize(30, 1.0);
        label.setLayoutX(v - 15);
        label.setLayoutY(v1 + 10);
        label.setStyle("-fx-background-color: white; -fx-border-color: black");

        Label label2 = new Label();
        label2.setPrefSize(30, 1.0);
        label2.setLayoutX(v - 15);
        label2.setLayoutY(v1 + 40);
        label2.setStyle("-fx-background-color: white; -fx-border-color: black");

        pane.getChildren().add(textField);
        pane.getChildren().add(label);
        pane.getChildren().add(label2);

    }

    @Override
    public Node getPicture() {
        String text = new String(prefix.toString());
        text += " " + name + " " + type;
        TextField field = new TextField(text);
        field.setStyle(style);

        return field;
    }
}
