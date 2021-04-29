package sample;
import javafx.scene.layout.Pane;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

public class ArrayCell extends ListCell<AbstractProductArrow>{
    public void updateItem(AbstractProductArrow item2, boolean empty) {
            super.updateItem(item2, empty);
            AbstractProductArrow apa = ((AbstractProductArrow) item2);
            if(apa != null) {
                Canvas cnv=new Canvas();
                cnv.setHeight(60);// задание размера элемента отображения
                cnv.setWidth(100);
                GraphicsContext gr=cnv.getGraphicsContext2D();
                apa.setStartX(10);
                apa.setEndX(55);
                apa.setStartY(10);
                apa.setEndY(55);
                apa.draw(gr);
                setGraphic(cnv);
            }
        }
}
