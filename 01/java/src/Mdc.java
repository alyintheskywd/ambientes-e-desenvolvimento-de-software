import java.util.Scanner;

public class Mdc {
    public void calcularMdc(){
        int c, d, resto;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        c = input.nextInt();
        System.out.println("Digite o segundo valor:");
        d = input.nextInt();

        while (d != 0){
            resto = c%d;
            c = d;
            d = resto;

        }
        System.out.println("O máximo divisor comum é: " + c);

    }
}
