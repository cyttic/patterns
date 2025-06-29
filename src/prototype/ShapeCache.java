package prototype;

// Create a class to get concreate classes from database and store them in a Hashtable.
import java.util.Hashtable;
public class ShapeCache {
    private static int idCouner = 1;
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(new Integer(idCouner++).toString());
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId(new Integer(idCouner++).toString());
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(""+idCouner++);
        shapeMap.put(rectangle.getId(),rectangle);
    }
}