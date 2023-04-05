package java9.arrays;

import java.util.Arrays;

public class TransactionDemo {
    public static void main(String ...s) {
        Transaction t1 = new Transaction("1",234f);
        Transaction t2 = new Transaction("2",345f);
        Transaction t3 = new Transaction("3",667f);
        Transaction t4 = new Transaction("4",23f);

        Transaction t5 = new Transaction("1",234f);
        Transaction t6 = new Transaction("2",345f);
        Transaction t7 = new Transaction("7",667f);
        Transaction t8 = new Transaction("4",23f);

        Transaction[] transactions1 = {t1,t2,t3,t4};
        Transaction[] transactions2 = {t5,t6,t7,t8};
        System.out.println(Arrays.compare(transactions1,transactions2,new TransactionComparator()));
    }
}
