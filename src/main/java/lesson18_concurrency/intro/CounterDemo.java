package lesson18_concurrency.intro;

public class CounterDemo {
    private static Counter counter = new Counter();
    public static void main(String[] args) {

        IncrementThread incrementThread1 = new IncrementThread();
        DecrementThread decrementThread = new DecrementThread();
        IncrementThread incrementThread2 = new IncrementThread();
        incrementThread1.start();
        incrementThread2.start();
        decrementThread.start();

        try {
            incrementThread1.join();
            incrementThread2.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.get());
    }
    private static class IncrementThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        }
    }
    private static class DecrementThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                counter.decrement();
            }
        }
    }

    public static class Counter {
        private int value;

        public synchronized void increment() {
            value++;
        }
        public synchronized void decrement() {
            value--;
        }
        public int get() {
            return value;
        }
    }
}
