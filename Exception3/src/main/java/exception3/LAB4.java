package exception3;

public class LAB4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (ArithmeticException e) {
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new RuntimeException();
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");

    }
}
