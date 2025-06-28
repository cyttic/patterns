package lab13;


import java.util.List;

public class CostBridge {

    public static float getCost(List<Item> lst) {
        float cost = 0.0f;
        for (Item item : lst) {
            cost += item.price();
        }
        return cost;

    }
}