package Tu.checking;
import java.text.NumberFormat;

/**
 * Created by Chia-LinCatherine on 2/19/2016.
 */
public class Account implements Depositable, Withdrawable, Balanceable {
    private double balance = 1000;

    public double getBalance() {return balance;}
    public void setBalance(double amount) {this.balance = amount;}
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public String getBalanceFormatted() {
        NumberFormat balanceFormatted = NumberFormat.getCurrencyInstance();
        return balanceFormatted.format(this.getBalance());
    }
}
