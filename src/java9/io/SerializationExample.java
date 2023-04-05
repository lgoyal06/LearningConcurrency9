package java9.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String... s) {
        try {
            Employee employee = new Employee("LALIT", "Male", 200000000000d);
            String filename = "/Users/lalitgoyal/Desktop/aws/LearnnigJava9/src/java9/io/file.dat";
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(employee);

            out.close();
            file.close();
        } catch (Exception e) {

        }
    }

}
