package lab13;

public class VegBurger implements Item {
    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public float price() {
        return 11.90f;
    }
}
