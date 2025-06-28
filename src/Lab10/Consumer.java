package Lab10;

import java.util.Queue;

class Consumer implements Runnable {
    private Queue<Integer> workingQueue;
    private final int id;
    private final int amount; //Number of products to consume
    private final int PERIOD = 2000; //Time period for consuming one product

    public Consumer(Queue<Integer> wq, int id, int amount) {
        workingQueue = wq;
        this.id = id;
        this.amount = amount;
    }
    public void run() {
        try {
            for (int i = 0; i < amount; i++){
                Thread.sleep((long) (PERIOD*Math.random()));
                consume(id);//consume an Integer product
            }
        }
        catch (InterruptedException ignored) { }
    }
    public Integer consume(int id) throws InterruptedException {
        Integer ret = null;
        synchronized(workingQueue){
            while (workingQueue.isEmpty())
                workingQueue.wait();
            ret = workingQueue.poll();
            System.out.println("Consuming ("+id+"): "+ret+"  *******> Queue size: "+ workingQueue.size());
            workingQueue.notifyAll();
        }
        return ret;
    }
}