package test_mivhanim.semaphores;

public class B implements Runnable{

    private StringBuffer buffer;

    public B(StringBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
//            Test.s.acquire(); //bet (in alef, B starts to work without locking)
            System.out.println("B begins with buffer = "+buffer);
            for (int i = 0; i < 10; i++) {
				Test.b.acquire(); //gimel
//				System.out.println("B works");
                buffer.append("B");
                System.out.println(buffer);
                Thread.sleep((long) (Math.random()*1000));
				Test.a.release(); //gimel - mutual exclusion
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B ends with buffer = "+buffer);
  //      Test.s.release(); //alef (if s is initialized to 0) or bet (if s is intialized to 1)
    }

}