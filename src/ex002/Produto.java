package ex002;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto() {
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public double comprarProduto(int quantidade){
        if (quantidade > estoque){
            return 0.0;
        }
        double valorTotal;

        if(quantidade <= 10) {
            estoque -= quantidade;
            valorTotal = this.preco * quantidade;
        } else if (quantidade <= 20) {
            estoque -= quantidade;
            valorTotal = (this.preco * quantidade) * 0.9;
        } else if (quantidade <= 50) {
            estoque -= quantidade;
            valorTotal = (this.preco * quantidade) * 0.8;
        } else {
            estoque -= quantidade;
            valorTotal = (this.preco * quantidade) * 0.75;
        }
        return valorTotal;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
