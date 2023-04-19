import java.util.Scanner;

public class Quicksort {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os valores do array: ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextInt();
        }

        quickSort(array, 0, tamanho - 1);

        System.out.println("Array ordenado: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int indicePivo = particionar(array, esquerda, direita);
            quickSort(array, esquerda, indicePivo - 1);
            quickSort(array, indicePivo + 1, direita);
        }
    }

    public static int particionar(int[] array, int esquerda, int direita) {
        int pivo = array[direita];
        int i = esquerda - 1;

        for (int j = esquerda; j < direita; j++) {
            if (array[j] <= pivo) {
                i++;
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

        int aux = array[i+1];
        array[i+1] = array[direita];
        array[direita] = aux;

        return i + 1;
    }
}
