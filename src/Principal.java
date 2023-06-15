import xyz.olive1ra.catalogo.modelos.Filme;
import xyz.olive1ra.catalogo.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Tron - o Legado");
        meuFilme.setAnoDeLancamento(2006);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota: " + meuFilme.pegaMedia());

        Serie lost = new Seria();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
    }
}
