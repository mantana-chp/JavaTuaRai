package exam.unit;

public class Department extends OrgUnit{

    private School school;

    public Department(int code, String name, School school) {
        super(code, name);
        this.school = school;
        this.logging = school.getCode() + ";";
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
        this.logging += school.getCode() + ";";
    }

//    public Department(int code, String name, School school) {
//        this.code = code;
//        this.name = name;
//        this.school = school;
//    }

//    public int getCode() {
//        return code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//
//    public String getLog() {
//        return logging;
//    }
}
