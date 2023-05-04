package int101.id120;

import history.id120.Log120;

public class Int101120 {

    public static void main(String[] args) {
        testLog120();
        testPerform();
        testToString();
        testGetLogName();
    }

    public static void testLog120(){
        Log120 log1 = new Log120("",5);
        System.out.println("If name is invaild: " + log1);
        System.out.println();
        Log120 log2 = new Log120("Apisara",2);
        System.out.println("If size is less than 3: " + log2);
    }

    public static void testPerform(){
        Log120 log1 = new Log120("Apisara",3);
        log1.perform("coding");
        log1.perform("singing");
        log1.perform("reading");
        System.out.println(log1);
        System.out.println();
        System.out.println("if activity is blank or null: ");
        Log120 log2 = new Log120("Apisara",3);
        log1.perform("coding");
        log1.perform("");
        log1.perform(null);
        System.out.println(log2);
    }

    public static void testToString(){
        Log120 log1 = new Log120("Apisara",3);
        log1.perform("coding");
        log1.perform("singing");
        log1.perform("reading");
        System.out.println(log1.toString());
    }

    public static void testGetLogName(){
        Log120 log1 = new Log120("Apisara",3);
        Log120 log2 = new Log120("Apisara2",3);
        Log120 log3 = new Log120("Apisara3",3);
        System.out.println(log1.getLogName(0));
        System.out.println(log2.getLogName(1));
        System.out.println(log3.getLogName(2));
        System.out.println("if no log in array: " + log3.getLogName(3));
    }



}
