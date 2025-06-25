package test_mivhanim.iterator2018;


public class Sportsman {
    private String name;
    private String country;
    private String sport;

    public Sportsman(String name, String country, String sport) {
        this.name = name;
        this.country = country;
        this.sport = sport;
    }

    public String getCountry() {
        return country;
    }

    public String getSport() {
        return sport;
    }

    public String toString() {
        return name;
    }
}