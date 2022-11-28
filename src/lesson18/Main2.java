package lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main2 {
    public static void main(String[] args) {
        File startDir = new File("C:\\dsfsf\\dfddf");
        if (!startDir.exists()) {
            startDir.mkdirs();
        }

        File secDir = new File("C:\\Users\\Mr. Den\\Downloads");
        File[] files = secDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return  !pathname.getName().endsWith(".jpeg") ||
                    pathname.getName().endsWith(".pdf");
                }
        });

        for (File f : files) {
            System.out.println(f.getName());
        }

        System.out.println();
    }
}
