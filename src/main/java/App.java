import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        String str;
//        str =  "Data Type";

//        String str = "Data Type";
//        //System.out.println(str);
//
//        short s = 10;
//        int i = 100;
//        long l = 1000000000;
//        long l2 = 100L;
//        float f = 3.1f;
//        double d = 5.7;
//        char c = 'a';
//        char c2 = '5';
//        boolean t = true;
//        boolean f1 = false;
//
//        Integer a = 100;
//        Integer b = 200;
//        System.out.println("Số a là " + a + " Số b là " + b);
//        swap(a, b);
//        System.out.println("Số a swap sai là " + a + " Số b swap sai là " + b);
//
//        SimpleSeason sse = SimpleSeason.AUTUMN;
//        System.out.println(sse);
//
//
//        System.out.println("n: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[];
//        for (int i1 = 0; i1<n; i1++){
//            System.out.format("a[%d] = ",i1);
//        }

        int[] array = generateArray(5,10,100);
        System.out.println(array);

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println("Số a swap đúng là " + a + " Số b swap đúng là " + b);
    }

    public static int sumElements(int[] arr){
        int ret = 0;
        for (int ele : arr){
            ret += ele;
        }
        return ret;
    }

    public static int[] generateArray(int n, int min,int max){
        int[] ret1 = new int[n];
        for (int i = 0; i < ret1.length; i++){
            ret1[i] = (int)Math.floor(Math.random() * (max - min)) + min;
        }
        return ret1;
    }
};


