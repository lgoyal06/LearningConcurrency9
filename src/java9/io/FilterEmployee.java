package java9.io;

import java.io.ObjectInputFilter;

public class FilterEmployee implements ObjectInputFilter {
    @Override
    public Status checkInput(FilterInfo filterInfo) {
        Class<?> serialClass = filterInfo.serialClass();
        if (serialClass != null) {
            return (Employee.class.isAssignableFrom(serialClass)) ? Status.ALLOWED : Status.REJECTED;
        } else {
            System.out.println("Null");
            return Status.UNDECIDED;
        }
    }
}
