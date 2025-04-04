package ex006;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Float.compare(altura, pessoa.altura) == 0 && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, altura);
    }

    @Override
    public String toString() {
        return "nome='" + nome +
                ", idade=" + idade +
                ", altura=" + altura + "\n";
    }
}

