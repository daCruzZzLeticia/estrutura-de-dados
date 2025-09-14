package atividades_adicionais_em_aula.custo_iteracao_e_recurcao;

public class Iteracao {

    // método que busca e retorna linearmente um valor dentro de um vetor de inteiros
    public static int buscaLinear(int[] vetorA, int valorBuscado) {
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

}
