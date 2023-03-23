public class Fibonacci {
    public static void main(String[] args) {
        int n = 8; // Quantidade de termos desejada
        int a = 0;
        int b = 1;
        
        System.out.print("0, 1");
        
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
