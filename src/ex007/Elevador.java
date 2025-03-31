package ex007;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador() {
    }

    public void inicializar(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void entrar(int quantidadePessoas){
        if (quantidadePessoas <= (this.totalAndares - this.quantidadePessoas)){
            this.quantidadePessoas = quantidadePessoas;
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public void sair(){
        if (this.quantidadePessoas != 0){
            this.quantidadePessoas -= 1;
        } else {
            System.out.println("O elevador está vazio!");
        }
    }

    public void subir(){
        if (this.andarAtual < this.totalAndares){
            this.andarAtual++;
        } else {
            System.out.println("Você está no ultimo andar!");
        }
    }

    public void desce(){
        if (this.andarAtual != 0){
            this.andarAtual--;
        } else {
            System.out.println("Você está no térreo!");
        }
    }

    public void imprimeStatus() {
        System.out.println(
                        "Andar atual: " + andarAtual + "\n" +
                        "Total de andares: " + totalAndares + "\n" +
                        "Capacidade: " + capacidade + " pessoas" + "\n" +
                        "Pessoas presentes: " + quantidadePessoas + "\n"
        );
    }

    public void andarAtual(){
        System.out.println(this.andarAtual);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int gettotalAndares() {
        return totalAndares;
    }

    public void settotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getcapacidade() {
        return capacidade;
    }

    public void setcapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
}
