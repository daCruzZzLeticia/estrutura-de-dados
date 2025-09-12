package atividade02_algoritmos_de_ordenacao;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {8, 2, 9, 3, 5, 1, 6, 4, 7};
        int n = vetor.length;

        System.out.print("Vetor Original: ");
        Utils.imprimir(vetor);

        int[] vetorBubbleClassico = vetor.clone();
        Sort.bubbleClassico(vetorBubbleClassico, n);

        System.out.print("Vetor Ordenado BubbleSort: ");
        Utils.imprimir(vetorBubbleClassico);

    }
}
