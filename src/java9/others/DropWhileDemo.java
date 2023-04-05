package java9.others;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileDemo {

    public static void main(String ...s){
        List<Customer> customerList = Arrays.asList(new Customer(21, "lucky", 700), new Customer(2, "lalit1", 700), new Customer(1, "lUCKY", 456.00));
        customerList.stream().sorted().forEach(System.out::println);
        System.out.println("***********************");
        List<Customer> eligibleCustomer = customerList.stream().sorted().dropWhile(e->e.getCustomerBalance() < 500).collect(Collectors.toList());
        Iterator<Customer> iter = eligibleCustomer.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

