package HW3Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileManager {

    public void writeFile(String filePath, String text) {
        try {
            Path path = Paths.get(filePath);
            Files.writeString(path, text, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Ошибка записи файла " + e.getMessage());
        }
    }
}
