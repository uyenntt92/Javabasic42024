package ToanTu;

public class MenhDe {
    public static int number = 100;
    public static int n;
    public void SoSanh(int n) {
        this.n = n;
    }
    public static void main(String[] args) {
        MenhDe ThamSo = new  MenhDe();
        ThamSo.SoSanh(25);

        if (n == number) {
            System.out.println("n bang 100");
        } else if (n < number) {
            System.out.println("n nho hon 100");
        } else {
            System.out.println("n lon hon 100");
        }
    }}