package lesson18_concurrency.intro;

public class VisibilityDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();

        Stopper stopper = new Stopper(worker);
        stopper.start();

        try {
            worker.join();
            stopper.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished");
    }

    private static class Stopper extends Thread {

        private Worker worker;
        public Stopper(Worker worker) {
            this.worker = worker;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            worker.shouldStop = true;
        }
    }

    private static class Worker extends Thread {
        public volatile boolean shouldStop = false;

        @Override
        public void run() {
            while (!shouldStop) {
                try {
                    Thread.sleep(10);
                    System.out.println("Not stopped yet");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
