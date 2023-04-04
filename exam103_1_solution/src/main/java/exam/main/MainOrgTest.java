package exam.main;

import exam.unit.Department;
import exam.unit.School;

public class MainOrgTest {
    public static void main(String[] args) {
//        testSchool();
//        testDepartment();
    }


    //3.1
    // OrgUnit: getCode(), getName(), setName(), getLog()
    // School: getBalance(), earn(), spend()
    private static void testSchool() {
        System.out.println("Test School...");
        School s = new School(1, "SIT");
        System.out.printf("School: code[%d] name[%s] balance[%.2f] log[%s]%n", s.getCode(), s.getName(), s.getBalance(), s.getLog());
        s.setName("School of IT");
        s.earn(500);
        s.spend(20);
        System.out.printf("School: code[%d] name[%s] balance[%.2f] log[%s]%n", s.getCode(), s.getName(), s.getBalance(), s.getLog());
    }

    //3.2
    // OrgUnit: getCode(), getName(), setName(), getLog()
    // Department: getSchool(), setSchool()
    private static void testDepartment() {
        System.out.println("\nTest Department");
        School s = new School(1, "SIT");
        Department d = new Department(2,"CP", s);
        System.out.printf("Department: code[%d] name[%s] school[%s] log[%s]%n", d.getCode(), d.getName(), d.getSchool().getName(), d.getLog());
        d.setSchool(new School(2,"School of IT"));
        System.out.printf("Department: code[%d] name[%s] school[%s] log[%s]%n", d.getCode(), d.getName(), d.getSchool().getName(), d.getLog());
    }

    //3.3 testSchoolAsOrgUnit() tests that School objects work correctly as OrgUnit.\


    //4.2
}
