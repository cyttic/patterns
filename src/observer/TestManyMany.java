package observer;


import java.util.Observer;

public class TestManyMany {

    private final static  int COUNT_CATS = 5;

    public static void main(String[] args) {
        //create two listeners
        Observer o = new Owner();
        Observer v = new Vet();
        //count of cats

        //create and run cats
        Cat[] c = new Cat[COUNT_CATS];
        for(int i = 0; i<COUNT_CATS; i++){
            c[i] = new Cat("Kot " + i);
            //add listeners to a cat
            c[i].addObserver(o);
            c[i].addObserver(v);
            new Thread(c[i]).start();
        }
    }

}