package test2.id103;

import account.id103.Person;
import account.id103.UserAccount;

public class Int101ReExam103 {
    public static void main(String[] args) {

        Person person = new Person("John");

        UserAccount account1 = person.addAccount("john123");
        System.out.println(account1);


        UserAccount account2 = person.addAccount("");
        System.out.println(account2);

        UserAccount account3 = person.addAccount("john123");
        System.out.println(account3);


        person.addAccount("john456");
        person.addAccount("john789");
        person.addAccount("john1011");
        person.addAccount("john1213");


        UserAccount account4 = person.addAccount("john1415");
        System.out.println(account4);


        System.out.println(person);
    }
}

