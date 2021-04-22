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
import javafx.util.*;

import javafx.scene.control.ListCell;
public class Controller {
    ObservableList<Shape> item;
    @FXML
    ListView listboxforfigure = new ListView();
    @FXML
    public void initialize(){
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        item = FXCollections.observableArrayList(rectangle, rectangle2);
        listboxforfigure.setItems(item);
        listboxforfigure.setCellFactory(new Callback<ListView<Shape>, ListCell<Shape>>(){
            @Override
            public ListCell<Shape> call(ListView<Shape> list) {
                return new ShapeCell();
            }
        });
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

    public void clear(ActionEvent actionEvent){
        GraphicsContext gr = canvas.getGraphicsContext2D();
        gr.clearRect(0,0,600,600);
    }

}
