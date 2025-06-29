package prototype;

// PrototypePatternDemo uses ShapeCache class to get clones of shapes stored in a Hashtable.
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape 1 : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape 2 : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape 3 : " + clonedShape3.getType());

        Shape clonedShape4 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape 4 : " + clonedShape4.getType());

        System.out.println("*****************************************************");

        System.out.println("Is Shape 2 == Shape 4? "+(clonedShape2 == clonedShape4));
        System.out.println("Is Shape 2 equal to Shape 4? "+clonedShape2.equals(clonedShape4));

        System.out.println("Is Shape 3 == Shape 4? "+(clonedShape3 == clonedShape4));
        System.out.println("Is Shape 3 equal to Shape 4? "+clonedShape3.equals(clonedShape4));

        // Additional option of object creation
//      Class<Shape> c = null;
//      try {
//    	  c = (Class<Shape>) Class.forName("Circle");
//      } catch (ClassNotFoundException e) {
//    	  // TODO Auto-generated catch block
//    	  e.printStackTrace();
//      }
//      try {
//      		Circle cr = (Circle) c.newInstance();
//      		System.out.println("Shape : " + cr.getType());
//      } catch (InstantiationException e) {
//      		// TODO Auto-generated catch block
//      		e.printStackTrace();
//      } catch (IllegalAccessException e) {
//      		// TODO Auto-generated catch block
//      		e.printStackTrace();
//      }

    }
}