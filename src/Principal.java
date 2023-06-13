public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Tron - o Legado";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.duracaoEmMinutos = 140;

        meuFilme.exibeFicha();

        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota: " + meuFilme.pegaMedia());

    }
}
