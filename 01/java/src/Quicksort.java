public class Quicksort {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9, 4, 3};
        
        quicksort(numeros, 0, numeros.length - 1);
        
        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
    
    public static void quicksort(int[] numeros, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particionar(numeros, esquerda, direita);
            quicksort(numeros, esquerda, pivo - 1);
            quicksort(numeros, pivo + 1, direita);
        }
    }
    
    public static int particionar(int[] numeros, int esquerda, int direita) {
        int pivo = numeros[direita];
        int i = esquerda - 1;
        
        for (int j = esquerda; j < direita; j++) {
            if (numeros[j] < pivo) {
                i++;
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
        
        int temp = numeros[i + 1];
        numeros[i + 1] = numeros[direita];
        numeros[direita] = temp;
        
        return i + 1;
    }
}