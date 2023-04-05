package java9.io;

import java.io.*;

public class DeserializationExample {

    public static void main(String... s) throws FileNotFoundException {

        FileInputStream file = new FileInputStream("/Users/lalitgoyal/Desktop/aws/LearnnigJava9/src/java9/io/file.dat");
        try (ObjectInputStream in = new ObjectInputStream(file)) {
            in.setObjectInputFilter(new FilterEmployee());
            // Method for deserialization of object
            Employee object1 = (Employee) in.readObject();

            System.out.println("Object has been deserialized ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
