package Task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        //2️⃣Создайте Java класс Book с полями title, author и published. Напишите код,
        // который прочитает JSON файл, содержащий объект Book, и преобразует его в Java объект Book.
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "file2.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Book book = objectMapper.readValue(file, Book.class);
            System.out.println(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
