public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFicha(){
        System.out.println("Nome Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos.");
        System.out.println("Nota: " + avaliacao);
        System.out.println("Total de Avaliações: " + totalDeAvaliacoes);
        System.out.println("Incluido no plano: " + incluidoNoPlano);

    }
}
