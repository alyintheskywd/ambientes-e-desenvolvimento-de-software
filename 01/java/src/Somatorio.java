import java.util.Scanner;

public class Somatorio {
    public void executar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de números a serem somados: ");
        int quantidade = input.nextInt();

        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número: " + (i+1) + ": ");
            int numero = input.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
