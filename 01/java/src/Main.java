import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite somente o número referente ao algoritmo que deseja rodar: ");
        System.out.println("1. Contagem");
        System.out.println("2. Fibonacci");
        System.out.println("3. MDC");
        System.out.println("4. Primos");
        System.out.println("5. Quicksort");
        System.out.println("6. Somatório");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Contagem ex1 = new Contagem();
                ex1.executar();
                break;
            case 2:
                Fibonacci ex2 = new Fibonacci();
                ex2.executar();
                break;
            case 3:
                MDC ex3 = new MDC();
                ex3.executar();
                break;
            case 4:
                Primos ex4 = new Primos();
                ex4.executar();
                break;
            case 5:
                Quicksort ex5 = new Quicksort();
                ex5.executar();
                break;
            case 6:
                Somatorio ex6 = new Somatorio();
                ex6.executar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}