package lesson17.hw;

import java.util.ArrayList;
import java.util.List;

/**
 1.
    * В методе main добавить в статический объект list 5 нитей.
    * Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.
    *
    * public static volatile List<Thread> list = new ArrayList<Thread>(5);
    *
    *     public static void main(String[] args) {
    *         //напишите тут ваш код
    *     }
    *
    *     public static class SpecialThread implements Runnable {
    *         public void run() {
    *             System.out.println("it's a run method inside SpecialThread");
    *         }
    *     }
 2.
    *
    * 1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
    * 2. SpecialThread должен выводить в консоль свой стек-трейс.
    *
    * Подсказка: main thread уже выводит в консоль свой стек-трейс.
 3.
    * 1. Разберись, что делает программа.
    * 2. Реализуй логику метода printTikTak:
    * 2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik
    * 2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak
    *
    * public static volatile boolean isStopped = false;
    *
    *     public static void main(String[] args) throws InterruptedException {
    *         Clock clock = new Clock();
    *         Thread.sleep(2000);
    *         isStopped = true;
    *         System.out.println("The clock has to be stopped");
    *         Thread.sleep(2000);
    *         System.out.println("Double-check");
    *     }
    *
    *     public static class Clock extends Thread {
    *         public Clock() {
    *             setPriority(MAX_PRIORITY);
    *             start();
    *         }
    *
    *         public void run() {
    *             try {
    *                 while (!isStopped) {
    *                     printTikTak();
    *                 }
    *             } catch (InterruptedException e) {
    *             }
    *         }
    *
    *         private void printTikTak() throws InterruptedException {
    *             //add your code here - добавь код тут
    *         }
    *     }
 */

public class HomeWork {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {

        //1, 2
//        Thread thread = new Thread(new SpecialThread());
//        thread.start();
//
//        for (int i = 0; i < 5; i++) {
//            list.add(new Thread(new SpecialThread()));
//        }
//
//        System.out.println("======================================");
//
//        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
//            System.out.println(element);
//        }

    //=============================================================================================================

        //3.
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            System.out.println("it's a run method inside SpecialThread");

            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }

    }

    public static class Clock extends Thread {

        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        @Override
        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void printTikTak() throws InterruptedException {
            Thread.sleep(500);
            System.out.println("Tik");
            Thread.sleep(500);
            System.out.println("Tak");

        }
    }
}
