package lab14;

public class HexObserver   implements observ{
    @Override
    public void notify2(int f) {
        System.out.println("HEX observer: " + Integer.toHexString(f));
    }
}
