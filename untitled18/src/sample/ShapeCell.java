package sample;
import javafx.scene.layout.Pane;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

class ShapeCell extends ListCell<Shape> {// класс Product

    @Override
    public void updateItem(Shape item, boolean empty) {
        super.updateItem(item, empty);
        if (item != null) {
            Pane pane=new Pane();
            pane.setPrefSize(50, 80);// задание размера элемента отображения
            //GraphicsContext gr=cnv.getGraphicsContext2D();
            Shape item1=(Shape)item.clone();//текущая фигура из списка ObservableList
            item1.draw(pane,1.0,1.0); // ее отрисовка на канве
            setGraphic(pane); //установка канвы вместо cell
        }
    }
}