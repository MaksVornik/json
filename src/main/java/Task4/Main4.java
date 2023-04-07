package Task4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) throws IOException {
        //4️⃣Создайте класс User с полями name, email и address.
        // Поле address должно быть объектом класса Address с полями street, city и zip.
        // Напишите код, который прочитает JSON файл, содержащий объект User, и преобразует его в Java объект User.
        String separator = File.separator;
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "file4.json");

        User user = objectMapper.readValue(file, User.class);
        System.out.println(user);
    }
}
