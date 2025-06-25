package test_mivhanim.iterator2018;

public class Test {

    public static void main(String[] args) {
        Olympics o = new Olympics(2020, "Beijing");
        o.addSportsman(new Sportsman("Shimon", "Israel", "ski"));
        o.addSportsman(new Sportsman("Shlomo", "Israel", "hockey"));
        o.addSportsman(new Sportsman("John", "USA", "ski"));
        o.addSportsman(new Sportsman("George", "Greece", "ski"));
        o.addSportsman(new Sportsman("Bob", "Canada", "hockey"));
        o.addSportsman(new Sportsman("Anna", "Israel", "figure skating"));
        o.addSportsman(new Sportsman("Jessika", "USA", "ski"));
        CountryIterator<Sportsman> ci = (CountryIterator<Sportsman>) o.getIterator("country", "Israel");
        while (ci.hasNext())
            System.out.println(ci.next());
        System.out.println("*********************************");
        SportIterator<Sportsman> si = (SportIterator<Sportsman>) o.getIterator("sport", "ski");
        while (si.hasNext())
            System.out.println(si.next());
    }
}