package ex002;

public class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 50.0, 10);
        Produto p2 = new Produto("Sapato", 150.0, 100);

        System.out.println(p1.comprarProduto(5));
        System.out.println(p2.comprarProduto(11));
        System.out.println(p2.comprarProduto(10));

    }





}
