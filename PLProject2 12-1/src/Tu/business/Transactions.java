package Tu.business;
import Tu.account.interfaces.Depositable;
import Tu.account.interfaces.Withdrawable;

/**
 * Created by Chia-LinCatherine on 2/19/2016.
 */
public class Transactions {

    public static void deposit(Depositable account, double amount) {account.deposit(amount);}
    public static void withdraw(Withdrawable account, double amount) {account.withdraw(amount);}

}
