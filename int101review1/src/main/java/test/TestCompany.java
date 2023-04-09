package test;

import human.Person;
import world.Company;

public class TestCompany {
    public static void main(String[] args) {
        testCompany();
    }

    private static void testCompany() {
        Person person = new Person("Mantana");
        Company company = new Company("ABC Company", "Bangkok", 100000, person);
        System.out.println(company.toString());
        System.out.println(company.divident(2.0));
    }
}
