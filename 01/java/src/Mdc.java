public class Mdc {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int mdc = 1;
        
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                mdc = i;
            }
        }
        
        System.out.println("O máximo divisor comum de " + a + " e " + b + " é " + mdc);
    }
}