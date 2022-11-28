package lesson17.orchestra;

public class Singer2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("FaFaFa");
        }

        synchronized (Monitor.MICROPHON) {
            try {
                Monitor.MICROPHON.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (Monitor.MICROPHON) {
                Monitor.MICROPHON.notify();
            }
        }
    }
}
