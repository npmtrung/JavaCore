import java.time.Year;

public class Excercies_01 {
    public static void main(String[] args) {

        //Bài 4
        int currentYear = Year.now().getValue();
        int birthYear = 1994;
        int age = currentYear - birthYear;
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Tuổi hiện tại là: " + age);
        System.out.println("--------------------");

        //Bài 5
        int A = 5;
        int B = 10;
        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        double div = (double) A / B;
        System.out.println("Số A: "+ A);
        System.out.println("Số B: "+ B);
        System.out.println("Tổng của 2 số là: " + sum);
        System.out.println("Hiệu của 2 số là:" + sub);
        System.out.println("Tích của 2 số là: " + mul);
        System.out.println("Thương của 2 số là: " + div);
        System.out.println("--------------------");

        //Bài 6
        String productName = "Kem Ốc Quế";
        int quantity = 10;
        double unitPrice = 7000;
        double price = quantity * unitPrice;;
        double VAT= price * 10/100;
        System.out.println("Tên sản phẩm: " + productName + " Đơn giá: " + unitPrice + " Số lượng: " + quantity);
        System.out.println("Giá tiền của sản phẩm là:" + price);
        System.out.println("Thuế giá trị gia tăng của sản phẩm là:" + VAT);
        System.out.println("--------------------");

        //Bai 7
        float diemToan = 9.5f;
        float diemLy = 7.5f;
        float diemHoa = 6;
        float diemTB;
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
        diemTB = (diemHoa + diemLy + diemHoa)/3;
        System.out.println("Điểm trung bình là: " + diemTB);
        System.out.println("--------------------");

        //Bai 8
        int r = 7;
        final float PI = 3.14f;
        float p = r * 2 * PI;
        float t = r * r * PI;
        System.out.println("PI: " + PI);
        System.out.println("Bán kính hình tròn: " + r +" cm");
        System.out.println("Chu vi hình tròn: " + p +" cm");
        System.out.println("Diện tích hình tròn: " + t +" cm2");
        System.out.println("--------------------");

        //Bài 9
        int soXe1 = 5;
        int soXe2 = 3;
        int soXe3 = 4;
        int soXe4 = 4;
        int soXe5 = 9;
        int soNut = (soXe1+soXe2+soXe3+soXe4+soXe5)%10;
        System.out.println("Biển số xe là: " + soXe1+soXe2+soXe3+soXe4+soXe5);
        System.out.println("Số nút của biển số xe là: " + soNut);
        System.out.println("--------------------");

        //Bài 10
        int soA = 6;
        int soB = 9;
        int max = Math.max(soA,soB);
        int min = Math.min(soA,soB);
        System.out.println("Số A: " + soA);
        System.out.println("Số B: " + soB);
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
}

