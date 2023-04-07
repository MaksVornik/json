package Task3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        //3️⃣Создайте класс Order с полями id, date и items.
        // Поле items должно быть списком объектов OrderItem с полями productId и quantity.
        // Напишите код, который прочитает JSON файл, содержащий объект Order, и преобразует его в Java объект Order.
        String separator = File.separator;
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "file3.json");

        Order order = objectMapper.readValue(file, Order.class);
        System.out.println(order);
    }
}
