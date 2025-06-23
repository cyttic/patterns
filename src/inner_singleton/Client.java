package inner_singleton;

public class Client {
    public static void main(String [] args){
        InnerStaticSingleton.getInstance().printHello();
    }
}
