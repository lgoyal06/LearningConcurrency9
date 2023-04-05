package java9.collections;

public class Employee {

    int empId;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    String name;

}
