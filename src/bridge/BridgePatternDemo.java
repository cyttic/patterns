package bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(50, 200, 80, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}