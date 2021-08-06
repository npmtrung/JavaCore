import org.w3c.dom.Text;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;

public class Excercise_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        //bai1
//        System.out.println("Input number: ");
//        int inputNumber = scanner.nextInt();
//        if (inputNumber >= 1  && inputNumber <= 9) {
//            System.out.println("Input number is " + inputNumber);
//        }
//        else {
//            System.out.println("Can not read input number");
//        }

        //bai2
        System.out.println("Input a character: ");
        Character inputChar = scanner.nextByte();
        if (isLowerCase(inputChar)) {
            System.out.println("Input number is " + inputNumber);
        }
        else {
            System.out.println("Can not read input number");
        }


//        //bai4
//        float a = 1.0f;
//        float b = 2.0f;
//        float c = 3.0f;
//        Float x1, x2;
//
//        float delta = b * b - 4 * a * c;
//
//        if (delta > 0) {
//            float deltaSqrt = (float) Math.sqrt(delta);
//            x1 = (-b + deltaSqrt) / (2.0f * a);
//            x2 = (-b - deltaSqrt) / (2.0f * a);
//        } else if (delta == 0) {
//            x1 = x2 = -b / (2.0f * a);
//        } else if (delta < 0) {
//            x1 = x2 = null;
//        }
//    }
    }
}