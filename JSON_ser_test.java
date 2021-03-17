import org.junit.jupiter.api.Test;

import java.io.StringWriter;

public class JSON_ser_test {
    private Object Person;

    @Test
    void test_serialize () {
        Person person = new Person();
        person.setFirstName("Ignat");
        person.setLastName("Ignatov");
        person.setChamber(10);

        StringWriter writer = new StringWriter ();
        ObjectMapper mapper =new ObjectMapper();
        mapper.writeValue (writer, Person);
        System.out.println (writer.toString());
        //разобраться https://javarush.ru/quests/lectures/questcollections.level03.lecture04
    }
}
