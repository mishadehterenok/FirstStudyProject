package lesson18_concurrency.intro;

public class IncrementVariable {
    private static int counter = 0;

    public static void main(String[] args) {

        IncrementThread incrementThread = new IncrementThread();
        incrementThread.start();
        try {
            incrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

    private static class IncrementThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                counter++;
            }
        }
    }
}
