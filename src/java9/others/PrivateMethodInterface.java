package java9.others;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;

public interface PrivateMethodInterface {

    default void method1() {
        utilResource();
    }

    default void method2() {
        utilResource();
    }

    private static void utilResource() {
        System.out.println("==Reading from comment resource==");
    }
}

