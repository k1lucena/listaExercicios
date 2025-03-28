package ex003.agendaTelefonica.modelo;

public class Agenda {

    private String nome;
    private Contato contato;
    private String email;

    public Agenda() {
    }

    public Agenda(String nome, Contato contato, String email) {
        this.nome = nome;
        this.contato = contato;
        this.email = email;
    }

    public void imprimirDados(){
        System.out.println(
                "Nome: " + this.nome + "\n" +
                "Email: " + this.email + "\n" +
                "Contato: " + contato.imprimirDados()

        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getNumero() {
        return contato;
    }

    public void setNumero(Contato contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
