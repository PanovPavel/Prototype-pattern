package sample;
import javafx.scene.layout.Pane;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

public class ArrowCell extends ListCell<AbstractProductArrow>{
    public void updateItem(AbstractProductArrow item2, boolean empty) {
            super.updateItem(item2, empty);
            AbstractProductArrow apa = ((AbstractProductArrow) item2);
            if(apa != null) {
                Pane pane=new Pane();
                pane.setPrefSize(60, 100);
                apa.setStartX(10);
                apa.setEndX(55);
                apa.setStartY(10);
                apa.setEndY(55);
                apa.draw(pane);
                setGraphic(pane);
            }
        }
}
