import java.util.Scanner;

public class Fibonacci {
    public void sequence(){
        int numero, n =0, d =1 , i =2;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos termos?");
        numero = input.nextInt();
        while (i<numero){
            System.out.println(n + " , " + d + " , ");
            n = n +d;
            d = n +d;
            i = i+2;


        }
        if(i == numero){
            System.out.println(n+" , " + d);
        }else {
            System.out.println(n);
        }
    }
}
