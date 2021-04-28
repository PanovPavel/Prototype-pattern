package sample;
import javafx.fxml.*;
import javafx.scene.effect.BlurType;
import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import  javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.effect.InnerShadow;
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
import javafx.scene.layout.Pane;
import javafx.scene.control.ListCell;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller {
    ObservableList<Shape> item;
    @FXML
    ListView listboxforfigure = new ListView();
    @FXML
    public void initialize(){
        //Rectangle rectangle = new Rectangle();
       //Triangle triangle=new Triangle();
        Square square = new Square();
        //item = FXCollections.observableArrayList(rectangle, square, triangle);
        item = FXCollections.observableArrayList(square, square);

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
    @FXML
    Pane panel;
    @FXML
    Pane panels;
    public void clear(ActionEvent actionEvent){
        panels.getChildren().clear();
    }

    public void drawShapes(MouseEvent mouseEvent) {
        int a =listboxforfigure.getSelectionModel().getSelectedIndex();
        Shape new_figure = (Shape) item.get(a).clone();
        new_figure.draw(panels, mouseEvent.getX(), mouseEvent.getY());
    }
}
