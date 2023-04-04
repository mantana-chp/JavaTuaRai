package obj.Mantana;

public class Obj113 {
    //4.1
    private static String id113;
    private String nameMantana;
    private double value113;

    //4.2
    public Obj113(String id113, String nameMantana, double value113) {
        Obj113.id113 = id113;
        this.nameMantana = nameMantana;
        this.value113 = value113;
    }

    //4.3
    public static String getId113() {
        return id113;
    }

    public static void setId113(String id113) {
        Obj113.id113 = id113;
    }

    public String getNameMantana() {
        return nameMantana;
    }

    public void setNameMantana(String nameMantana) {
        this.nameMantana = nameMantana;
    }

    public double getValue113() {
        return value113;
    }

    public void setValue113(double value113) {
        this.value113 = value113;
    }

    //4.4
    @Override
    public String toString() {
        return "Obj113{" + id113 +
                "nameMantana='" + nameMantana + '\'' +
                ", value113=" + value113 +
                '}';
    }

    //4.5
    public static int compare(Obj113 o1, Obj113 o2) {
        if (o1.value113 == 0 && o2.value113 == 0) {
            return 0;
        }
        if (o1.value113 < o2.value113) {
            return -1;
        }
        return 1;
    }

    //4.6
    public boolean isGreaterThan(Obj113 o) {
        return o != null && this.value113 > o.value113;
    }

}
