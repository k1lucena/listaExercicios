package ex003.agendaTelefonica.modelo;

public class Contato {

    private TipoNumero tipo;
    private String numero;

    public Contato() {
    }

    public Contato(TipoNumero tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String imprimirDados(){
        return
                "{Tipo: " + this.tipo + " | " +
                "Número: " + this.numero + "}";

    }

    public TipoNumero getTipo() {
        return tipo;
    }

    public void setTipo(TipoNumero tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "tipo=" + tipo +
                ", numero='" + numero + '\'' +
                '}';
    }
}
