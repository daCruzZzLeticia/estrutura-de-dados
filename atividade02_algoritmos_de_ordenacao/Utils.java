package atividade02_algoritmos_de_ordenacao;

public class Utils {

    public static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];

        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void imprimir(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
    }

}
