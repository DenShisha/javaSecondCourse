package lesson17.orchestra;

public class Singer1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;

        while (!needStop) {
            for (int i = 0; i < 3; i++) {
                System.out.println("LaLaLa-----");
                count++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitor.MICROPHON) {
                Monitor.MICROPHON.notify();
            }
            synchronized (Monitor.MICROPHON) {
                try {
                    Monitor.MICROPHON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (count > 3) {
                needStop = true;
            }
        }
    }
}
