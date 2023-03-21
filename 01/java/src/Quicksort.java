import java.util.Scanner;

public class Quicksort {

        Scanner input = new Scanner(System.in);
        int particao(int a[], int baixo, int alto){
            int pivo = a[alto];
            int i =(baixo-1);
            for(int j = baixo; j< alto; j++){
                if(a[j]<pivo){
                    i++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
            int temp = a [i+1];
            a[i+1] = a[alto];
            a[alto] = temp;
            return i+1;
        }
        void quikisorte(int a[], int baixo, int alto){
            if(baixo< alto ){
                int parte = particao(a,baixo,alto);
                quikisorte(a, baixo, parte - 1);
                quikisorte(a, parte+1, alto);

            }
        }
        public void ordenacao(){
            int a[], tamanho,i =0;
            System.out.println("Tamanho da lista: ");
            tamanho= input.nextInt();
            a = new int[tamanho];
            System.out.println("Entrada dos elementos?");
            for(i = 0; i <tamanho; i++){
                a[i] =input.nextInt();

            }
            Quicksort variavel = new Quicksort();
            variavel.quikisorte(a, 0, tamanho-1);
            System.out.println("Ordenacao dos elementos foi: ");
            for (i = 0; i<tamanho; i++){
                System.out.print(a[i]+" ");
            }
        }
    }

