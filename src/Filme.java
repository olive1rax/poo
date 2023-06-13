public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFicha(){
        System.out.println("Nome Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos.");
        System.out.println("Incluido no plano: " + incluidoNoPlano);

    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
