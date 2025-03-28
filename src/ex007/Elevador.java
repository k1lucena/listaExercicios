package ex007;

public class Elevador {

    private int andarAtual;
    private int TOTAL_ANDARES;
    private int CAPACIDADE;
    private int quantidadePessoas;

    public Elevador() {
    }

    public void inicializar(int capacidade, int totalAndares){
        this.CAPACIDADE = capacidade;
        this.TOTAL_ANDARES = totalAndares;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void entrar(int quantidadePessoas){
        if (quantidadePessoas <= (this.TOTAL_ANDARES - this.quantidadePessoas)){
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
        if (this.andarAtual < this.TOTAL_ANDARES){
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

    public void andarAtual(){
        System.out.println(this.andarAtual);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTOTAL_ANDARES() {
        return TOTAL_ANDARES;
    }

    public void setTOTAL_ANDARES(int TOTAL_ANDARES) {
        this.TOTAL_ANDARES = TOTAL_ANDARES;
    }

    public int getCAPACIDADE() {
        return CAPACIDADE;
    }

    public void setCAPACIDADE(int CAPACIDADE) {
        this.CAPACIDADE = CAPACIDADE;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
}
