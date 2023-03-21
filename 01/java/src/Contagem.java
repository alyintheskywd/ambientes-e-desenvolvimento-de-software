import java.util.Scanner;

public class Contagem {
    public void contagem(){
        Scanner input = new Scanner(System.in);
        int numero, contInt=0, contFloat = 0, i = 0, aux;
        float valor;
        System.out.println("Quantos elementos?");
        numero= input.nextInt();
        while (i<numero){
            valor= input.nextFloat();
            aux = (int) valor;
            if (aux==valor){
                contInt= contInt+1;

            }else {
                contFloat = contFloat +1;

            }
            i= i + 1;
        }
        System.out.println("Números inteiros: "+contInt);
        System.out.println("Números não inteiros: "+contFloat);
    }
}
