package lesson18.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FirstHW {

    public static byte[] readBytes(String fileName) throws IOException {
        return Files.readAllBytes(Path.of(fileName));
    }

    public static List<String> readLines(String fileName) throws IOException {
        return Files.readAllLines(Path.of(fileName));
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
        Files.write(Paths.get(fileName), bytes);
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
        Files.copy(Paths.get(resourceFileName), Paths.get(destinationFileName));
    }
}
