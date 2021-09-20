package Excercises.Ex13;

public class CheckException extends Exception{
    public CheckException(String message) {
        super(message);
    }
    public static boolean isDouble(String x) { //check số kiểu double
        if (x == null)
            return false;
        try {
            double a = Double.parseDouble(x);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
