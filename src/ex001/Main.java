package ex001;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Kauan", "123", "98 999999", 'M', 2004);
        Cliente c2 = new Cliente("Lucas", "321", "98 999999", 'M', 2008);

        c1.imprimirDados();
        System.out.println(c1.calcularIdade() + " anos");
        System.out.println(c1.maiorIdade());

        System.out.println(" ");

        c2.imprimirDados();
        System.out.println(c2.calcularIdade() + " anos");
        System.out.println(c2.maiorIdade());

    }

}
