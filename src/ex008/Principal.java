package ex008;

public class Principal {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora(15, 5);

        calc.somar(5, 7);

        System.out.println(calc);

        calc.dividir();

        System.out.println(calc);

        System.out.println(calc.multiplicar(5,5));

        calc.subtrair();
    }

}
