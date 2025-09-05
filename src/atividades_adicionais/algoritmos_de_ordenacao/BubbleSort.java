package atividades_adicionais.algoritmos_de_ordenacao;

public class BubbleSort {

    public static void bubbleSortClassico(int[] vetor) {
        int n = vetor.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    VetorUtils.trocarElementos(vetor, j, j + 1);
                }
            }
        }

    }

}
