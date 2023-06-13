public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Tron - o Legado";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.duracaoEmMinutos = 140;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.duracaoEmMinutos);
    }
}
