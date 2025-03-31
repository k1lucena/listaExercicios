package ex008;

public class Calculadora {

    private double numero1;
    private double numero2;
    private double resultado;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void somar(double numero1, double numero2){
        this.resultado = numero1 + numero2;
    }

    public void dividir() {
        if (this.numero2 != 0) {
            this.resultado = this.numero1 / this.numero2;
        } else {
            System.out.println("Divisão por zero!");
            this.resultado = 0;
        }
    }

    public double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }

    public void subtrair(){
        System.out.println(this.numero1 - this.numero2);
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                ", resultado=" + resultado +
                '}';
    }
}
