package utilMantana;

/*1. Create a "Tool999" class in "utilnnn" package as a utility class and
   implements the following public static methods:
1.1 "isUsable999" method that receives an input argument of type String and
    returns a boolean. It returns true if its input argument is not null and
    not a blank string.
1.2 "isUsable999" method that receives an input argument of type Object[] and
    returns a boolean. It returns true if its input argument is not null and
    is an array with length more than 0.
1.3 "count999" method that receives an input argument of type Object[] and
    returns an int, which is the number of objects in the array.
    Note that if its argument is not usable according to 1.2, return -1. ????????
*/
public class Tool113 {
    //1.1
    public static boolean isUsable113(String string) {
        return string != null && !string.isBlank();
    }
    //1.2
    public static boolean isUsable113(Object[] array) {
        return array != null && array.length > 0;
    }
    //1.3
    public static int count113(Object[] array2) {
        return -1;
    }

}
