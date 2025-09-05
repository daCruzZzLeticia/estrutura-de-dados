package atividades_adicionais.algoritmos_de_ordenacao;

public class VetorUtils {

    public static void trocarElementos(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
    }

}
