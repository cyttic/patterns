package test_mivhanim.iterator2018;

import java.util.Iterator;

public interface Iterable {

    public Iterator<?> getIterator(String filter, String value);

}