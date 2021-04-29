package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import  javafx.scene.control.ListView;
import javafx.scene.input.MouseButton;
import  javafx.scene.input.MouseEvent;
import javafx.collections.*;
import javafx.collections.FXCollections;
import javafx.util.*;
import javafx.scene.layout.Pane;
import javafx.scene.control.ListCell;
import javafx.scene.control.Label;

public class Controller {
    ObservableList<Shape> item;
    ObservableList<AbstractProductArrow> item2;
    @FXML
    Label label;
    @FXML
    Pane panels;
    @FXML
    ListView listboxforfigure = new ListView();
    @FXML
    ListView listForArray = new ListView();
    @FXML
    public void initialize(){
        Nodes nodes = new Nodes();
        Obj obj = new Obj();
        ActiveObj activeObj = new ActiveObj();
        Component component = new Component();
        item = FXCollections.observableArrayList(nodes, obj, activeObj, component);
        listboxforfigure.setItems(item);
        listboxforfigure.setCellFactory(new Callback<ListView<Shape>, ListCell<Shape>>(){
            @Override
            public ListCell<Shape> call(ListView<Shape> list) {
                return new ShapeCell();
            }
        });

        //линии
        ArrowDependence arrowDependence = new FactoryDependence().CreateArrow(1, 5, 55, 55);
        ArrowAssociation arrowAssociation = new FactoryAssociation().CreateArrow(1, 5, 55, 55);
        ArrowFour arrowFour = new FactoryFour().CreateArrow(1, 5, 55, 55);
        item2 =FXCollections.observableArrayList(arrowAssociation, arrowDependence, arrowFour);
        listForArray.setItems(item2);
        listForArray.setCellFactory(new Callback<ListView<AbstractProductArrow>, ListCell<AbstractProductArrow>>() {
            @Override
            public ListCell<AbstractProductArrow> call(ListView<AbstractProductArrow> param) {
                return new ArrayCell();
            }
        });
    }


    public void clear(ActionEvent actionEvent){
        panels.getChildren().clear();
    }

    public void drawShapes(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == MouseButton.PRIMARY) {
            int a = listboxforfigure.getSelectionModel().getSelectedIndex();
            Shape new_figure = (Shape) item.get(a).clone();
            new_figure.draw(panels, mouseEvent.getX(), mouseEvent.getY());
        }
    }
}
