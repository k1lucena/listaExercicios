package ex006;

import java.util.Arrays;

public class Agenda {

    private Pessoa[] pessoas;
    private int quantidade;

    public Agenda() {
        this.pessoas = new Pessoa[10];
        this.quantidade = 0;
    }

    public void armazenaPessoa(String nome, int idade, float altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoas[this.quantidade] = pessoa;
        this.quantidade++;
    };

    public void removerPessoa(String nome){
        int index = 0;

        for(int i = 0; i < this.quantidade; i++){
            if(pessoas[i].getNome().equalsIgnoreCase(nome)){
                pessoas[i] = null;
                index = i;
            }
        }

        for (int i = index; i < this.quantidade; i++){
                pessoas[i] = pessoas[i + 1];
        }

        pessoas[this.quantidade-1] = null;
        this.quantidade -= 1;
    }

    public void imprimirAgendaStream(){
        System.out.println(Arrays.stream(pessoas).toList());
    }

    public void imprimirAgenda(){
        for(Pessoa p: pessoas){
            if(p != null) {
                System.out.print(p);
            }
        }
    }

    public void imprimirPessoaPNome(String nome){
        for (int i = 0; i < this.quantidade; i++){
            if (pessoas[i].getNome().equalsIgnoreCase(nome)){
                System.out.println(pessoas[i]);
            }
        }
    }

    public void imprimirPessoa(int index){
        if (index <= this.quantidade) {
            System.out.println(pessoas[index]);
        } else {
            System.out.println("Pessoa não cadastrada");
        }
    }


    @Override
    public String toString() {
        return "Agenda{" +
                "pessoas=" + Arrays.toString(pessoas) +
                ", quantidade=" + this.quantidade +
                '}';
    }
}
