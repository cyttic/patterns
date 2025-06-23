package lab14;

public class OctalObserver  implements observ{
    @Override
    public void notify2(int f) {
        System.out.println("Octal observer: " + Integer.toOctalString(f));
    }
}
