import java.util.Scanner;

public class Fibonacci {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos que você deseja na série de Fibonacci: ");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println("A série de Fibonacci com " + n + " termos é:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
