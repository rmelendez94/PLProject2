package melendez;

/**
 * Created by Rolando on 2/13/16.
 */
public class Customer extends Person{
    private int customerNumber;

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public int getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + "\n" +
                "Customer number: " + customerNumber;
    }
}
