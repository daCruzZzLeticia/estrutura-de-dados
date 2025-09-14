package atividade02_algoritmos_de_ordenacao;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {8, 2, 9, 3, 8, 3, 5, 1, 6, 4, 7};
        int n = vetor.length;

        // para counting
        int k = n + 1;
        int[] vetorSaidaCouting = new int[n];

        System.out.print("Vetor Original: ");
        Utils.imprimir(vetor);

        int[] vetorBubbleClassico = vetor.clone();
        int[] vetorBubbleOtimizado = vetor.clone();
        int[] vetorSelectionClassico = vetor.clone();
        int[] vetorSelectionEstavel = vetor.clone();
        int[] vetorInserction = vetor.clone();
        int[] vetorQuick = vetor.clone();

        Sort.counting(vetor, vetorSaidaCouting, n, k);

        System.out.println("\nPassos BubbleSort Clássico:");
        Sort.bubbleClassico(vetorBubbleClassico, n);
        System.out.println("\nVetor Ordenado BubbleSort Clássico:");
        Utils.imprimir(vetorBubbleClassico);

        System.out.println("\nPassos BubbleSort Otimizado:");
        Sort.bubbleOtimizado(vetorBubbleOtimizado, n);
        System.out.println("\nVetor Ordenado BubbleSort Otimizado:");
        Utils.imprimir(vetorBubbleClassico);

        System.out.println("\nPassos SelectionSort Clássico:");
        Sort.selectionClassico(vetorSelectionClassico, n);
        System.out.println("\nVetor Ordenado SelectionSort Clássico:");
        Utils.imprimir(vetorSelectionClassico);

        System.out.println("\nPassos SelectionSort Estável:");
        Sort.selectionEstavel(vetorSelectionEstavel, n);
        System.out.println("\nVetor Ordenado SelectionSort Estável:");
        Utils.imprimir(vetorSelectionEstavel);

        System.out.println("\nPassos InserctionSort:");
        Sort.inserction(vetorInserction, n);
        System.out.println("\nVetor Ordenado InserctionSort:");
        Utils.imprimir(vetorInserction);

        System.out.println("\nPassos QuickSort:");
        Sort.quick(vetorQuick, 0, n - 1);
        System.out.println("\nVetor Ordenado QuickSort:");
        Utils.imprimir(vetorQuick);

        System.out.println("\nVetor Ordenado CountingSort:");
        Utils.imprimir(vetorSaidaCouting);
    }
}
