package lab13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Coke implements Item{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.90f;
    }
}
