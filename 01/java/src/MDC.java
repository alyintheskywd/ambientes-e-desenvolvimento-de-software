import java.util.Scanner;

public class MDC {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números para calcular o MDC: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int resultado = mdc(numero1, numero2);
        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + resultado);
    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}