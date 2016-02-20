package Tu.checking;
import java.text.NumberFormat;

/**
 * Created by Chia-LinCatherine on 2/19/2016.
 */
public class CheckingAccount extends Account {
    private double monthlyFee = 1;

    public void subtractMonthlyFee() {
        double beginningBalance = this.getBalance();
        double endingBalance = beginningBalance - this.monthlyFee;
        this.setBalance(endingBalance);
    }
    public void setMonthlyFee(double monthlyFee) {this.monthlyFee = monthlyFee;}
    private double getMonthlyFee() {return monthlyFee;}
    public String getMonthlyFeeFormatted() {
        NumberFormat monthlyFeeFormatted = NumberFormat.getCurrencyInstance();
        return monthlyFeeFormatted.format(monthlyFee);
    }


}
