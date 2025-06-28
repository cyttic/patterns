package lab13;

public class ChickenBurger implements Item{
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 10.90f;
    }
}
