package utilMantana;

public class Tool113 {

    //1.1
    public static boolean isUsable113(String string) {
        return string != null && ! string.isBlank();
    }
    //1.2
    public static boolean isUsable113(Object[] obj) {
        return obj != null && obj.length > 0;
    }
    //1.3
    public static int count113(Object[] obj2) {
        if (obj2 != null && obj2.length > 0) {
            return -1;
        }
        return obj2.length;
    }
}
