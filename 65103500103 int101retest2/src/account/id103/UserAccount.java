package account.id103;

import account.id103.Person;
public class UserAccount {
    private final String userName;
    final Person owner;
    private static final String[] allUsers = new String[10];
    private static int userNameCount = 0;

    public UserAccount(String userName, Person owner) {
        this.userName = userName;
        this.owner = owner;
        allUsers[userNameCount] = userName;
        userNameCount++;
    }

    static boolean isValid(String userName) {
        return userName != null && !userName.isBlank();
    }

    static boolean exists(String userName) {
        for (int i = 0; i < userNameCount; i++) {
            if (allUsers[i].equals(userName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Username: " + userName + ", Owner name: " + owner.getName();
    }
}