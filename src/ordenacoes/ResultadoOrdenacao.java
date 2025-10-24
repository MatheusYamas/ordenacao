package ordenacoes;

public class ResultadoOrdenacao {
    long trocas;
    long comparacoes;

    public ResultadoOrdenacao(long trocas, long comparacoes){
        this.trocas = trocas;
        this.comparacoes = comparacoes;
    }

    @Override
    public String toString() {
        return "Trocas: " + trocas + " | Comparações: " + comparacoes;
    }
}
