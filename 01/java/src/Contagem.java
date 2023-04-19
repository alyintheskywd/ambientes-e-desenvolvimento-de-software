import java.util.Scanner;

public class Contagem {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a contagem: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}