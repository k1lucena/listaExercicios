package ex001;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Objects;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private Character sexo;
    private int anoNascimento;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String telefone, Character sexo, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    public void imprimirDados(){
        System.out.println(
                "Cliente: \n" +
                        " Nome: " + nome + '\n' +
                        " Cpf: " + cpf + '\n' +
                        " Telefone: " + telefone + '\n' +
                        " Sexo: " + sexo + '\n' +
                        " Ano de Nascimento: " + anoNascimento
        );
    }

    public int calcularIdade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - this.anoNascimento;
    }

    public Boolean maiorIdade(){
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - this.anoNascimento;
        if (idade >= 18){
            return true;
        } else {
            return false;
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
