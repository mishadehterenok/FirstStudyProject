package lesson18_concurrency.intro;

public class PrintThreadDemo {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread(0);
        printThread.start();

    }

    private static class PrintThread extends Thread {
        private int threadNumber;

        public PrintThread(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            if (threadNumber < 50) {
                PrintThread childThread = new PrintThread(++threadNumber);
                childThread.start();
                try {
                    childThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(threadNumber);
            }
        }
    }
}
