package exam.unit;

public class School extends OrgUnit{

    private double balance;

    public School(int code, String name) {
        super(code, name);
    }

    public double getBalance() {
        return balance;
    }

    public void earn(double amount) {
        balance += amount;
        logging += "earn(" + amount + ")";
    }

    public void spend(double amount) {
        balance -= amount;
        logging += "spend(" + amount + ")";
    }

//    public String getLog() {
//        return logging;
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




}
