package melendez.business;

/**
 * Created by Rolando on 2/13/16.
 */
public class Customer extends Person{
    private String customerNumber;

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String getDisplayText() {
        return (super.toString() + "\n" +
                "Customer number: " + customerNumber);
    }
}
