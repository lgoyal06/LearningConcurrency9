package java9.others;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionEnchancements {

    static List<Employee> empList = Arrays.asList(new Employee("A", 17, 12101.00), new Employee("B", 15, 32.00), new Employee("C", 14, 121.00), new Employee("D", 12, 123.00));

    public static void main(String... s) {
        Optional<Employee> maxPaidEmployee = empList.stream().filter(e -> e.getSalary() > 50000).findFirst();

        maxPaidEmployee.ifPresentOrElse(e -> System.out.println(e), () -> System.out.println("Not present"));

        Supplier<Optional<Employee>> optionalSupplier = () -> Optional.of(new Employee("Optional", 45, 100d));

        maxPaidEmployee = maxPaidEmployee.or(optionalSupplier);

        Employee emp = maxPaidEmployee.get();

        //System.out.println(emp.getName());


        List<Optional<Employee>> list = Arrays.asList(Optional.empty(), Optional.of(new Employee("B", 34, 5665.67)), Optional.of(new Employee("c", 34, 5635.67)));
        List<Employee> filteredlist = list.stream().flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty()).collect(Collectors.toList());
        //filteredlist.stream().forEach(e -> System.out.println(e.getName()));


        List<Employee> filteredListJava = list.stream().flatMap(Optional::stream).collect(Collectors.toList());

        filteredListJava.stream().forEach(e -> System.out.println(e.getName()));

    }
}
