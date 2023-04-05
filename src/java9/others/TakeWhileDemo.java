package java9.others;

import java.util.Arrays;
import java.util.List;

public class TakeWhileDemo {

    public static void main(String... s) {
        List<Product> productList = Arrays.asList(
                new Product("Denim", "Garment", 1500.00),
                new Product("T Shirt", "Garment", 700.00),
                new Product("Nike", "Sports", 1500.00),
                new Product("T Shirt", "Garment", 700.00));
        productList.stream().takeWhile(e -> e.getProductCategory().equals("Garment")).forEach(System.out::println);
    }
}
