package test_mivhanim.iterator2018;


import java.util.List;

public class CountryIterator<E> extends FilterIterator<E> {

    public CountryIterator(List<E> coll, String value) {
        super(coll, value);
    }

    @Override
    public boolean filter(E el, String value) {
        return value.equals(((Sportsman)el).getCountry());
    }

}