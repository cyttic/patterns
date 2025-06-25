package test_mivhanim.iterator2018;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Olympics implements Iterable{

    private List<Sportsman> delegates;
    Integer year;
    String city;

    public Olympics(int year, String city) {
        this.year = year;
        this.city = city;
        delegates = new ArrayList<Sportsman>();
    }

    public void addSportsman(Sportsman s) {
        delegates.add(s);
    }

    @Override
    public Iterator<Sportsman> getIterator(String filter, String value) {
        if (filter == "country")
            return new CountryIterator<Sportsman>(delegates, value);
        if(filter == "sport")
            return new SportIterator<Sportsman>(delegates, value);
        return delegates.iterator();
    }

}