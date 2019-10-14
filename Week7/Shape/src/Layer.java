import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Layer
 */
public class Layer {
    private List<Shape> shapes;
    public Layer() {
        shapes = new ArrayList<Shape>();
    }
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void removeCircles() {
        Predicate<Shape> checkIsCricle = (Shape shape) -> {
            return shape instanceof Circle;
        };

        shapes.removeIf(checkIsCricle);
    }
    public String getInfo() {
        StringBuilder info = new StringBuilder();

        for(Shape shape: shapes) {
            info.append(shape.toString());
            info.append("\n");
        }
        return info.toString();
    }
    public void removeDuplicates() {
        Set<Shape> setShapeContains = new HashSet<Shape>();
        ArrayList<Shape> listShapeToRemove = new ArrayList<Shape>();

        for(Shape shape: shapes) {
            if (setShapeContains.contains(shape)) {
                listShapeToRemove.add(shape);
            } else {
                setShapeContains.add(shape);
            }
        }
        shapes.removeAll(listShapeToRemove);
    }
    public static void main(String[] args) {
        Layer layer = new Layer();
        layer.addShape(new Rectangle());
        layer.addShape(new Circle());
        layer.addShape(new Circle());
        System.out.println(layer.getInfo());
        layer.removeCircles();
        System.out.println(layer.getInfo());
    }
}
