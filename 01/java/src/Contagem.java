import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print("Digite o valor do primeiro dado: ");
        int primeiroDado = scanner.nextInt();
        
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= primeiroDado && numero <= n) {
                contador++;
            }
        }
        
        System.out.println("Existem " + contador + " valores inteiros entre o primeiro dado (" + primeiroDado + ") e N (" + n + ").");
    }
}