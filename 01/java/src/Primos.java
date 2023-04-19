import java.util.Scanner;

public class Primos {
    public static void executar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        for (int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    System.out.println(i + " não é número primo.");
                }
            }
            if (primo) {
                System.out.println(i + " é número primo.");
            }
        }
    }
}

