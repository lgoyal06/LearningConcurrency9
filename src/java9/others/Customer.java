package java9.others;

public class Customer implements Comparable<Customer> {

    int customerId;

    @Override
    public String toString() {
        return "java9.others.Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerBalance=" + customerBalance +
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    String customerName;

    public Customer(int customerId, String customerName, double customerBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBalance = customerBalance;
    }

    double customerBalance;

    @Override
    public int compareTo(Customer o) {
        if (this.customerId > o.customerId)
            return 1;
        else if (this.customerId < o.customerId) {
            return -1;
        }
        return 0;
    }
}
