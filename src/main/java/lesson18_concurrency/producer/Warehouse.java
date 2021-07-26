package lesson18_concurrency.producer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Warehouse {

    private static final int STORAGE_LIMIT = 10;
    private Deque<Integer> storage = new LinkedList<>();
    private final Object LOCK = new Object();

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (LOCK) {
                while (storage.size() == STORAGE_LIMIT) {
                    System.out.println("Producer waits");
                    LOCK.wait();
                }
                System.out.println("Producing an element");
                storage.add(1);
                Thread.sleep(2000);
                System.out.println("Count elements: " + storage.size());
                Thread.sleep(2000);
                LOCK.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(100);
        while (true) {
            synchronized (LOCK) {
                while (storage.isEmpty()) {
                    System.out.println("Consumer waits");
                    LOCK.wait();
                }
                Integer element = storage.removeFirst();
                System.out.println("Retrieving an element: " + element);
                Thread.sleep(2000);
                System.out.println("Count elements: " + storage.size());
                Thread.sleep(2000);
                LOCK.notify();
            }
        }
    }

}
