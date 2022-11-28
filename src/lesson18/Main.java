package lesson18;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IOFilesCopy ioFilesCopy = new IOFilesCopy();
        ioFilesCopy.copy("C:\\Users\\Mr. Den\\Downloads\\JAVA_Methods_Programming_v2.march2015.pdf", "1.pdf");
        long end = System.currentTimeMillis();
        System.out.println("io - " + (end - start));

        long start1 = System.currentTimeMillis();
        NIOFilesCopy nioFilesCopy = new NIOFilesCopy();
        nioFilesCopy.copy("C:\\Users\\Mr. Den\\Downloads\\JAVA_Methods_Programming_v2.march2015.pdf", "2.pdf");
        long end1 = System.currentTimeMillis();
        System.out.println("nio - " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        ApacheCommonIOCopy apacheCommonIOCopy = new ApacheCommonIOCopy();
        apacheCommonIOCopy.copy("C:\\Users\\Mr. Den\\Downloads\\JAVA_Methods_Programming_v2.march2015.pdf", "3.pdf");
        long end2 = System.currentTimeMillis();
        System.out.println("apache - " + (end2 - start2));
    }
}
