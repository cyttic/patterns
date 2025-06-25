package test_mivhanim.iterator2018;


import java.util.Iterator;
import java.util.List;

public abstract class FilterIterator<E> implements Iterator<E> {

    private List<E> coll;
    private String value;
    int pos;

    public FilterIterator(List<E> coll, String value) {
        this.coll = coll; //copy reference or list???
        this.value = value;//copy ref or string???
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        for (int i = pos; i < coll.size(); i++) {
            if (filter(coll.get(i),value))
                return true;
        }
        return false;
    }

    @Override
    public E next() {
        E s = null;
        for (; pos < coll.size(); pos++) {
            if (filter(coll.get(pos),value)) {
                s = coll.get(pos);
                pos++;
                break;
            }
        }
        return s;
    }

    public abstract boolean filter(E el, String value);

}