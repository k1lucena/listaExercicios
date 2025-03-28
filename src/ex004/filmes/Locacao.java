package ex004.filmes;

public class Locacao {

    private Filme filme;
    private double preco = 4.0;

    public Locacao() {
    }

    public Locacao(Filme filme) {
        this.filme = filme;
    }

    public void alugarFilme(int dias){
        if(this.filme.categoria.equalsIgnoreCase("infantil")){
            this.preco = 4.0 + 2.0;
        } else if (this.filme.categoria.equalsIgnoreCase("lançamento")){
            this.preco = 4.0 + 3.0;
        } else if (this.filme.categoria.equalsIgnoreCase("promoção")){
            this.preco = 4.0 - 2.0;
        }


        if (this.filme.getAlugado().equals(false) && dias != 0){
            this.filme.setAlugado(true);
            double precoFinal = this.preco * dias;

            System.out.println(
                    "===== Recibo =====\n" +
                    "Filme: " + this.filme.getTitulo() + "\n" +
                    "Categora: " + this.filme.getCategoria() + "\n" +
                    "Alugado por " + dias + " dias\n" +
                    "========================\n" +
                    "Valor por dia: R$ " + this.preco + "\n" +
                    "Valor final: R$ " + precoFinal + "\n" +
                    "========================="
            );

        } else {
            System.out.println("Filme já alugado ou o número de dias precisa ser maior que zero!");
        }
    }

    public void devolver(){
        this.filme.setAlugado(false);
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


}
