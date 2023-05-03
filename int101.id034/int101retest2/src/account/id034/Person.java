package account.id034;

import java.util.Arrays;

//StudentID :65130500034
//Full Name :Nalinee Ninthongkam
//Seat No: 3.4

public class Person {

    private String name;

    private final UserAccount[] accounts = new UserAccount[5];

    private int count = 0;


    public Person(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append(" ");
        if (count == 0) {
            sb.append(" ");
        } else {
            sb.append(" ");
            for (int i = 0; i < count; i++) {
                sb.append(accounts[i].toString()).append(" ");
            }
        }
        return sb.toString();
    }


    public UserAccount addAccount(String userName) {
        if (UserAccount.isValid(userName) && !UserAccount.exists(userName)) {
            if (count == accounts.length) {
                return null;
            }
            UserAccount newAccount = new UserAccount(userName, this);
            accounts[count] = newAccount;
            count++;
            return newAccount;
        }
        return null;
    }


    String getName() {
        return name;
    }
}
