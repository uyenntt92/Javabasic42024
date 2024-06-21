package toantu;

public class Menhde {
    static  int number = 100;

    // Hàm kiểm tra số n
    static void checkNumber(int n) {
        if (n == number) {
            System.out.println("n bằng " + number);
        } else if (n < number) {
            System.out.println("n nhỏ hơn " + number);
        } else {
            System.out.println("n lớn hơn " + number);
        }
    }
    public static void main(String[] args) {
        // Gọi hàm để kiểm tra các trường hợp
        // TH1: n == number
        checkNumber(100);
        // TH2: n < number
        checkNumber(50);
        // TH3: n > number
        checkNumber(150);
    }
}
