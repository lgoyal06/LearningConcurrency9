package java9.collections;

import java.util.List;

public class UnmodifiableList {

    public static void main(String ...s) {
        List<Employee> employeeList = List.of(new Employee(1,"lalit"));
        //employeeList.add(new Employee(1,"lalit"));
        employeeList.forEach(e->System.out.println(e));
    }
}
