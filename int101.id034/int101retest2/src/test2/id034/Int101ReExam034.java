package test2.id034;
import account.id034.Person;
import account.id034.UserAccount;

//StudentID :65130500034
//Full Name :Nalinee Ninthongkam
//Seat No: 3.4

public class Int101ReExam034 {
    public static void main(String[] args) {

    Person person = new Person("Nalinee");


    UserAccount account1 = person.addAccount("Nalinee034");
    if (account1 != null) {
        System.out.println("Account created successfully : " + account1.toString());
    } else {
        System.out.println("Failed to create account.");
    }


    UserAccount account2 = person.addAccount(null);
    if (account2 != null) {
        System.out.println("Account created successfully: " + account2.toString());
    } else {
        System.out.println("Failed to create account.");
    }


    UserAccount account3 = person.addAccount("Nalinee034");
    if (account3 != null) {
        System.out.println("Account created successfully: " + account3.toString());
    } else {
        System.out.println("Failed to create account.");
    }

    System.out.println(person.toString());
    }
}


