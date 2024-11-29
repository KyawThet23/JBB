package thread;

public class Main {

    public static void main(String[] args) {
        show();
        System.out.println(Thread.activeCount());
    }

    public static void show() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new ThreadDemo());
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("File is ready.");
        }
    }
}
