package sample;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class ArrowDependence extends AbstractProductArrow implements Cloneable {
    double arrowHeadSize;// размер кончика стрелки

    public ArrowDependence(double x, double y, double w, double h ) {
        this.color = Color.BLACK;
        this.startX = x;
        this.startY = y;
        this.endX = w;
        this.endY = h;
        // определение пропорций кончика стрелки
        arrowHeadSize=0.09*Math.sqrt((startX-endX)*(startX-endX)+(startX-endX)*(startX-endX));
    }
    public void draw(Pane pane) {
        drawArrowstart(pane);//начало стрелки
        drawLine(pane);//линия
        drawArrowend(pane);//конец стрелки
    }

    public String toString() {
        return "Зависимость";
    }

    public void drawArrowstart(Pane pane) {
        Circle circle = new Circle(2.0f);
        circle.setLayoutY(startY - width);
        circle.setLayoutX(startX - width);
        circle.setFill(color);
        pane.getChildren().add(circle);
    }

    public void drawLine(Pane pane) {
        Line line = new Line();
        line.setStartX(startX);
        line.setStartY(startY);
        line.setEndX(endX);
        line.setEndY(endY);
        line.setStrokeDashOffset(3.0);
        pane.getChildren().add(line);
    }

    public void drawArrowend(Pane pane) {
        Line line = new Line();
        line.setEndX(endX);
        line.setEndY(endY);
        double angle = Math.atan2((endY - startY), (endX - startX)) - Math.PI / 2.0;
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        //point1
        double x1 = (- 1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + endX;
        double y1 = (- 1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + endY;
        //point2
        double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + endX;
        double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + endY;
        line.setStartX(x1);
        line.setStartY(y1);
        line.setEndX(endX);
        line.setEndY(endY);
        pane.getChildren().add(line);
    }

    public void setStartPoint(double startX, double startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public void setEndPoint(double endX, double endY) {
        this.endX = endX;
        this.endY = endY;
        arrowHeadSize=0.09*Math.sqrt((startX-this.endX)*(startX-this.endX)+(startX-this.endX)*(startX-this.endX));
    }
}