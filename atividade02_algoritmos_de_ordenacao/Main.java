package atividade02_algoritmos_de_ordenacao;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {8, 2, 9, 3, 5, 1, 6, 4, 7};
        int n = vetor.length;

        System.out.print("Vetor Original: ");
        Utils.imprimir(vetor);

        int[] vetorBubbleClassico = vetor.clone();
        int[] vetorBubbleOtimizado = vetor.clone();
        int[] vetorSelectionClassico = vetor.clone();
        int[] vetorInserction = vetor.clone();

        Sort.bubbleClassico(vetorBubbleClassico, n);
        Sort.bubbleOtimizado(vetorBubbleOtimizado, n);
        Sort.selectionClassico(vetorSelectionClassico, n);
        Sort.inserction(vetorInserction, n);

        System.out.print("Vetor Ordenado BubbleSort Clássico: ");
        Utils.imprimir(vetorBubbleClassico);

        System.out.print("Vetor Ordenado BubbleSort Otimizado: ");
        Utils.imprimir(vetorBubbleClassico);

        System.out.print("Vetor Ordenado SelectionSort Clássico: ");
        Utils.imprimir(vetorSelectionClassico);

        System.out.print("Vetor Ordenado InserctionSort Clássico: ");
        Utils.imprimir(vetorInserction);

    }
}
