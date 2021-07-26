package lesson18_concurrency.producer;

public class ProducerConsumer {
    private static final Warehouse WAREHOUSE = new Warehouse();

    public static void main(String[] args) {
        Thread producerThread = new Thread(ProducerConsumer::runProducer);
        Thread consumerThread = new Thread(ProducerConsumer::runConsumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void runProducer(){
        try {
            WAREHOUSE.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void runConsumer(){
        try {
            WAREHOUSE.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
