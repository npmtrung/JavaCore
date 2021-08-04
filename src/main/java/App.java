public class App {
    public static void main(String[] args){
//        String str;
//        str =  "Data Type";

    String str = "Data Type";
    //System.out.println(str);

    short s = 10;
    int i = 100;
    long l = 1000000000;
    long l2 = 100L;
    float f = 3.1f;
    double d = 5.7;
    char c = 'a';
    char c2 = '5';
    boolean t = true;
    boolean f1 = false;

    Integer a = 100;
    Integer b = 200;
    System.out.println("Số a là " + a + " Số b là " + b);
    swap(a,b);
    System.out.println("Số a swap sai là " + a + " Số b swap sai là " + b);

    SimpleSeason sse = SimpleSeason.AUTUMN;
    System.out.println(sse);
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b =  temp;
        System.out.println("Số a swap đúng là " + a + " Số b swap đúng là " + b);
    }



};


