package ex004.filmes;

public class Principal {

    public static void main(String[] args) {

        Filme f1 = new Filme("Homem Aranha 2", "promoção");
        Locacao l1 = new Locacao(f1);
        Locacao l2 = new Locacao(f1);

        l1.alugarFilme(5);
        l2.alugarFilme(5);

    }

}
