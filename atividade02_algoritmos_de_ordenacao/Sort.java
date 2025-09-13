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

    public static void bubbleOtimizado(int[] vetorA, int n) {

        boolean trocou;
        for (int i = 0; i < n - 1; i++) {

            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (vetorA[j] > vetorA[j + 1]) {
                    Utils.troca(vetorA, j, j + 1);
                    trocou = true;
                }
            }

            if (!trocou)
                break;
        }
    }

    public static void selectionClassico(int[] vetorA, int n) {

        for (int i = 0; i < n - 1; i++) {

            int menorIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetorA[j] < vetorA[menorIndex]) {
                    menorIndex = j;
                }
            }

            Utils.troca(vetorA, i, menorIndex);
        }

    }

    public static void inserction(int[] vetorA, int n) {

        for (int i = 1; i < n; i++) {

            int key = vetorA[i];
            int j = i - 1;

            while (j >= 0 && vetorA[j] > key) {
                vetorA[j + 1] = vetorA[j];
                j--;
            }

            vetorA[j + 1] = key;
        }

    }

    public static void counting(int[] vetorA, int[] vetorB, int n, int k) {
        int[] vetorC = new int[k];

        for (int j = 0; j < n; j++) {
            vetorC[vetorA[j]]++;
        }

        for (int i = 1; i < k; i++) {
            vetorC[i] += vetorC[i - 1];
        }

        for (int j = n - 1; j >= 0; j--) {
            vetorB[vetorC[vetorA[j]] - 1] = vetorA[j];
            vetorC[vetorA[j]]--;
        }
    }

}
