package sample;
import javafx.fxml.*;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import  javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseDragEvent;
import  javafx.scene.input.MouseEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.collections.*;
import javafx.collections.FXCollections;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public class Controller {
    ObservableList<Shape> items;
    @FXML
    ListView listboxforfigure = new ListView();
    @FXML
    public void initialize(){
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        items = FXCollections.observableArrayList(rectangle, rectangle2);
        listboxforfigure.setItems(items);
        listboxforfigure.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    Canvas canvas = new Canvas();

    public void drawShapes(MouseEvent mouseEvent) {
        Rectangle rectangle3 = new Rectangle();
        GraphicsContext gr = canvas.getGraphicsContext2D();
        int a =listboxforfigure.getSelectionModel().getSelectedIndex();
        Shape new_figure = (Shape) rectangle3.clone();
        new_figure.draw(gr, mouseEvent.getX(), mouseEvent.getY());
    }

    public void click(ActionEvent actionEvent) {
        System.out.println("123");
    }
}
