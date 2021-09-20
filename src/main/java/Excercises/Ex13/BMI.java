package Excercises.Ex13;

public class BMI {
    double chieuCao, canNang, BMI;

    public static void calculateBMI(double canNang, double chieuCao) {
        double bmi = 0;
        bmi = canNang / Math.pow(chieuCao, 2);
        if (bmi < 18)
            System.out.println("Chỉ số BMI của bạn: " + bmi + "");
        else if (bmi < 25.0)
            System.out.println("Chỉ số BMI của bạn: " + bmi);
        else if (bmi < 30.0)
            System.out.println("Chỉ số BMI của bạn: " + bmi);
        else
            System.out.println("Chỉ số BMI của bạn: " + bmi);
    }
}
