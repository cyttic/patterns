package builder;

public class BuilderSample {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Builder constructed 1: "+house);

        System.out.println("**********************");

        HouseBuilder tipiBuilder = new TipiHouseBuilder();
        engineer = new CivilEngineer(tipiBuilder);
        engineer.constructHouse();
        house = engineer.getHouse();
        System.out.println("Builder constructed 2: "+house);

    }
}
