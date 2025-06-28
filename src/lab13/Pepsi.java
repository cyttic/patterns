package lab13;

public class Pepsi implements Item{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.50f;
    }
}
