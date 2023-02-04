package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {

    public static List<String> readFromFile(String url) throws IOException {
        return Files.readAllLines(Path.of(url));
    }

    public static void WriteInTheFile(String text, String url) throws IOException {
        Files.write(Path.of(url), text.getBytes(), StandardOpenOption.APPEND);
    }
}
