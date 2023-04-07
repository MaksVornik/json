package Task1;

import Task1.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        //1️⃣Создайте Java класс Person с полями id, name и age. Напишите код, который читает JSON файл,
        // содержащий массив объектов Person, и преобразует его в список Java объектов Person.
        String separator = File.separator;
        File file = new File("src" +separator +"main" + separator +"resources" + separator + "file1.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Person> personList =  objectMapper.readValue(file, new TypeReference<List<Person>>() {});
            System.out.println(personList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
