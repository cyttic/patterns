package test_mivhanim.semaphores;



public class A implements Runnable{

    private StringBuffer buffer;

    public A(StringBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
//            Test.s.acquire(); //alef (s is initialized to 0) and bet (s is initialized to 1)
            System.out.println("A begins with buffer = "+buffer);
            for (int i = 0; i < 10; i++) {
				Test.a.acquire(); //gimel
//				System.out.println("A works");
                buffer.append("A");
                System.out.println(buffer);
                Thread.sleep((long) (Math.random()*1000));
				Test.b.release(); //gimel = mutual exclusion
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("A ends with buffer = "+buffer);
 //       Test.s.release(); //bet
    }

}