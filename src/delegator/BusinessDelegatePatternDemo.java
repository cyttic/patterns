package delegator;

public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        ClassA c3 = new ClassC();
        c3.funcA();
        System.out.println(c3);


        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}