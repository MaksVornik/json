package Task5;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main5 {
    public static void main(String[] args) throws IOException {
        //5️⃣Создайте класс Product с полями id, name, price, description и reviews.
        // Напишите код, который прочитает JSON файл, содержащий массив объектов Product,
        // и преобразует его в список Java объектов Product.
        // Каждый объект Product должен содержать список объектов Review с полями rating и comment.
        String separator = File.separator;
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "file5.json");

        List<Product> product = objectMapper.readValue(file, new TypeReference<List<Product>>(){});

        System.out.println(product);
    }
}
