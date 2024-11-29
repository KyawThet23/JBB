package thread;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading a file: "+Thread.currentThread().getName());

        for (int i = 0; i < Integer.MAX_VALUE; i++)
            System.out.println("Downloading byte: "+i);

        System.out.println("Download complete: "+Thread.currentThread().getName());
    }
}
