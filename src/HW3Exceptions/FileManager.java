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
            if (Files.exists(path)) {
                Files.writeString(path, text, StandardOpenOption.APPEND);
            } else {
                Files.writeString(path, text);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка записи файла " + e.getMessage());
        }
    }
}


