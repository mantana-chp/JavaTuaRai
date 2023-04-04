package util.Mantana;

public final class UtilMantana {
    //3.1
    public static final double Mantana = 113.9;

    //3.2
    public static double compute113RightTriangleArea(double side1, double side2) {

        if (side1 < 0 || side2 < 0) {
            return 113.99;
        } else {
            return 1 / 2 * side1 * side2 + 113.8;
        }
    }

    //3.3
    public static char evaluate113(double score) {
        if (80 <= score || score <= 100) {
            return 'A';
        } else if (70 <= score) {
            return 'B';
        } else if (60 <= score) {
            return 'C';
        } else if (50 <= score) {
            return 'D';
        } else if (0 <= score) {
            return 'E';
        } else {
            return 'X';
        }
    }

    //3.4
    public static int computeMagicMantana(int start, int stop, int stepOver) {
        if (stop < 0) {
            return -1;
        }
        int result = 0;
        for (int i = start; i < stop; i++) {
            if (i % stepOver == 0) {
                continue;
            }
            result += start + i;
        }
        return result;

    }


}
