package Excercises.Ex13;

    public class CheckBMIException extends RuntimeException {
        public CheckBMIException(String message) {
            super(message);
        }

        public static boolean isDouble(String x) {
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

