package lab13;

public class Coke implements Item {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.90f;
    }
}
