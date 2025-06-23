package lab14;

public class Lab14Demo {
    public static void main(String[] args){
        BinaryObserver ob2 = new BinaryObserver();
        OctalObserver ob8 = new OctalObserver();
        HexObserver ob16 = new HexObserver();

        subject ss = new subject();
        ss.add(ob2);
        ss.add(ob8);
        ss.add(ob16);
        ss.setState(65);
    }
}
