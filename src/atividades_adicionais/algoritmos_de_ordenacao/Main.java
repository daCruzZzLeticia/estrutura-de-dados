package atividades_adicionais.algoritmos_de_ordenacao;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {8, 9, 3, 5, 1};

        System.out.print("Vetor Original: ");
        VetorUtils.imprimirVetor(vetor);

        int[] vetorBubbleClassico = vetor.clone();
        BubbleSort.bubbleSortClassico(vetorBubbleClassico);

        System.out.print("Vetor Ordenado BubbleSort: ");
        VetorUtils.imprimirVetor(vetorBubbleClassico);

    }
}
