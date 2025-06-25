package test_mivhanim.semaphores;


import java.util.concurrent.Semaphore;

public class Test {

    //	public static Semaphore s = new Semaphore(0); //alef
//    public static Semaphore s = new Semaphore(1); //bet
	public static Semaphore a = new Semaphore(1); //gimel
	public static Semaphore b = new Semaphore(0); //gimel

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();
        Runnable task2 = new A(buffer);
        Runnable task1 = new B(buffer);
        new Thread(task2).start();
        new Thread(task1).start();

        //general comment:
        //There is no need in a joint mutex for accessing System.out and a buffer by threads because we have exactly 1 thread of each type (A or B)
        //BUT, if we allow more than 1, mutex is necessary!
    }

}