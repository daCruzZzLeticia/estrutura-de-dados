package atividade02_algoritmos_de_ordenacao;

public class Sort {

    public static void bubbleClassico(int[] vetorA, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (vetorA[j] > vetorA[j + 1]) {
                    Utils.troca(vetorA, j, j + 1);
                }
            }
        }

    }
}
