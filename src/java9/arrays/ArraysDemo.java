package java9.arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String... s) {
        int[] data1 = {10, 20, 30, 40, 50};
        int[] data2 = {10, 20, 30, 40, 50};
        int[] data3 = {10, 80, 30, 40};
        System.out.println("Check mismatch between Data 1 and data 2");
        System.out.println(Arrays.mismatch(data1, data2));
        System.out.println(Arrays.mismatch(data1, data3));

        System.out.println(Arrays.equals(data1, data2));
        System.out.println(Arrays.equals(data1, data3));

        System.out.println(Arrays.compare(data1, data2));
        System.out.println(Arrays.compare(data3, data1));

    }
}
