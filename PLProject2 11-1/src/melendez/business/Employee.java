package melendez.business;

/**
 * Created by Rolando on 2/13/16.
 */
public class Employee extends Person {
    private String socialSecurity;

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
    public String getSocialSecurity() {
        return socialSecurity;
    }

    @Override
    public String getDisplayText() {
        return (super.toString() + "\n" +
                "Social security number: " + socialSecurity);
    }
}
