package lab14;

public class BinaryObserver implements observ{
    @Override
    public void notify2(int f) {
        System.out.println("Binary observer: " + Integer.toBinaryString(f));
    }
}
