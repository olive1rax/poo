package xyz.olive1ra.catalogo.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFicha(){
        System.out.println("Nome xyz.olive1ra.catalogo.modelos.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos.");
        System.out.println("Incluido no plano: " + incluidoNoPlano);

    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
