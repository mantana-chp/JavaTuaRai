package account.id034;

//StudentID :65130500034
//Full Name :Nalinee Ninthongkam
//Seat No: 3.4

public class UserAccount {

    private final String userName;


    final Person owner;


    private static final String[] allUsers = new String[10];


    private static int userNameCount = 0;




    UserAccount(String userName, Person owner) {
        this.userName = userName;
        this.owner = owner;
        allUsers[userNameCount++] = userName;
    }

    static boolean exists(String userName) {
        for (String user : allUsers) {
            if (user != null && user.equals(userName)) {
                return true;
            }
        }
        return false;
    }


    static boolean isValid(String userName) {
        return userName != null && !userName.isBlank();
    }


    @Override
        public String toString() {
        return "Username: " + userName + ", Owner Name: " + owner.getName();
    }

}




