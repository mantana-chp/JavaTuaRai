package account.id103;

import java.util.Arrays;
import account.id103.UserAccount;

public class Person {
    private final String name;
    private final UserAccount[] accounts;
    private int count;

    public Person(String name) {
        this.name = name;
        this.accounts = new UserAccount[5];
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public UserAccount addAccount(String userName) {
        if (count >= accounts.length) {
            return null;
        }

        if (UserAccount.isValid(userName) && !UserAccount.exists(userName)) {
            UserAccount account = new UserAccount(userName, this);
            accounts[count] = account;
            count++;
            return account;
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person name: ").append(name).append("\n");

        if (count == 0) {
            sb.append("No accounts created.");
        } else {
            sb.append("Accounts:\n");
            for (int i = 0; i < count; i++) {
                sb.append(accounts[i]).append("\n");
            }
        }

        return sb.toString();
    }
}
