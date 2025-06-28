package Lab10;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Integer> workingQueue;
    private final int id;
    private final int amount; //Number of products to produce
    private final int PERIOD = 700; //Time period required for producing one product

    public Producer(Queue<Integer> wq, int id, int amount) {
        this.workingQueue = wq;
        this.id = id;
        this.amount = amount;
    }

    public void run() {
        try {
            for (int i = 0; i < amount; i++){
                Thread.sleep((long) (PERIOD*Math.random()));
                int product = id * amount + i;
                produce(id, product);
            }
        } catch (InterruptedException ignored) { }
    }

    public void produce(int id, int num) throws InterruptedException {
        System.out.println("====> Thread " + id + " starts producing");
        synchronized(workingQueue){
            while(ProdConsDriver.isQueueFull())
            {
                System.out.println("====> Thread " + id + " before wait");
                workingQueue.wait();
                System.out.println("====> Thread " + id + " after wait");
            }
            workingQueue.add(num);
            System.out.println("Producing ("+id+"): "+ num+"  *******> Queue size: " + workingQueue.size());
            workingQueue.notifyAll();
        }
    }
}
