package ordenacoes;

import java.util.ArrayList;

public class Ordenadores {
    public static ResultadoOrdenacao bubbleSort(int [] vetor){
        long trocas = 0;
        long comparacoes = 0;
        int temp = 0;
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++){
            boolean troca = false;
            for (int j = 1; j < tamanho - i; j++){
                comparacoes++;
                if (vetor[j-1] > vetor[j]){
                    temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                    troca = true;
                    trocas++;
                }
            }
            if (!troca){
                break;
            }
        }
        return new ResultadoOrdenacao(trocas, comparacoes);
    }

    public static ResultadoOrdenacao selectionSort(int [] vetor){
        long trocas = 0;
        long comparacoes = 0;
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++){
            int minIndex = i;
            for (int j=i + 1; j < tamanho; j++){
                comparacoes++;
                if(vetor[j] < vetor[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                trocas++;
            }
        }
        return new ResultadoOrdenacao(trocas, comparacoes);
    }

    public static ResultadoOrdenacao cocktailSort(int [] vetor){
        boolean trocou = true;
        int inicio = 0;
        long trocas = 0;
        long comparacoes = 0;
        int tamanho = vetor.length;
        int fim = tamanho - 1;
        int temp;
        while (trocou){
            trocou = false;
            for (int i = inicio; i < fim; i++){
                comparacoes++;
                if (vetor[i] > vetor[i + 1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                    trocas++;
                }
            }
            if (!trocou){
                break;
            }

            trocou = false;
            fim--;

            for (int i = fim; i > inicio; i--){
                comparacoes++;
                if (vetor[i] < vetor[i - 1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    trocou = true;
                    trocas++;
                }
            }
            inicio++;
        }

        return new ResultadoOrdenacao(trocas, comparacoes);
    }

    public static ResultadoOrdenacao gnomeSort(int [] vetor){
        long trocas = 0;
        long comparacoes = 0;
        int posicao = 0;
        int tamanho = vetor.length;

        while (posicao < tamanho){
            if (posicao == 0){
                posicao++;
            }
            else{
                comparacoes++;
                if (vetor[posicao] >= vetor[posicao-1]){
                    posicao++;
                }
                else{
                    int temp = vetor[posicao];
                    vetor[posicao] = vetor[posicao - 1];
                    vetor[posicao - 1] = temp;
                    trocas++;

                    posicao--;
                }
            }
        }

        return new ResultadoOrdenacao(trocas, comparacoes);
    }

    public static ResultadoOrdenacao combSort(int[] vetor) {
        long trocas = 0;
        long comparacoes = 0;
        int tamanho = vetor.length;
        int gap = tamanho;
        double shrink = 1.3;
        boolean trocou = true;

        while (gap > 1 || trocou == true) {
            gap = (int)(gap / shrink);
            if (gap < 1) {
                gap = 1;
            }
            trocou = false;

            for (int i = 0; i + gap < tamanho; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + gap]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    trocas++;

                    trocou = true;
                }
            }
        }
        return new ResultadoOrdenacao(trocas, comparacoes);
    }

    public static ResultadoOrdenacao bucketSort(int[] vetor) {
        long trocas = 0;
        long comparacoes = 0;
        int tamanho = vetor.length;

        if (tamanho <= 1) {
            return new ResultadoOrdenacao(0, 0);
        }

        int numBaldes = 10;
        ArrayList<ArrayList<Integer>> baldes = new ArrayList<>(numBaldes);
        for (int i = 0; i < numBaldes; i++) {
            baldes.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < tamanho; i++) {
            int valor = vetor[i];
            int indiceBalde = valor / 10;
            if (indiceBalde >= numBaldes) {
                indiceBalde = numBaldes - 1;
            }

            baldes.get(indiceBalde).add(valor);
        }
        for (int i = 0; i < numBaldes; i++) {
            ArrayList<Integer> baldeAtual = baldes.get(i);

            if (baldeAtual.size() > 0) {
                int[] arrayDoBalde = new int[baldeAtual.size()];
                for (int j = 0; j < baldeAtual.size(); j++) {
                    arrayDoBalde[j] = baldeAtual.get(j);
                }

                ResultadoOrdenacao resBalde = selectionSort(arrayDoBalde);
                trocas += resBalde.trocas;
                comparacoes += resBalde.comparacoes;
                baldeAtual.clear();

                for (int j = 0; j < arrayDoBalde.length; j++) {
                    baldeAtual.add(arrayDoBalde[j]);
                }
            }
        }
        int index = 0;
        for (int i = 0; i < numBaldes; i++) {
            ArrayList<Integer> baldeAtual = baldes.get(i);
            for (int j = 0; j < baldeAtual.size(); j++) {
                vetor[index] = baldeAtual.get(j);
                index++;
            }
        }
        return new ResultadoOrdenacao(trocas, comparacoes);
    }
}
