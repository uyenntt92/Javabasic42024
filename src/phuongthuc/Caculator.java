package phuongthuc;

public class Caculator {

        public static int tinhtong(int a, int b) {
            return(a+b) ;
        }
        public static float tinhtich(float x, float y) {
            return(x*y) ;
        }
        public static void main(String[] args) {
            System.out.println(tinhtong(20, 12));
            System.out.println(tinhtich(20.21f, 12.45f));
}}