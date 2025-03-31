package ex006;

public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.imprimirAgenda();

        agenda.armazenaPessoa("Kauan", 20, 1.80f);
        agenda.armazenaPessoa("Maria", 25, 1.65f);
        agenda.armazenaPessoa("João", 30, 1.75f);
        agenda.armazenaPessoa("Ana", 22, 1.70f);


        agenda.removerPessoa("Maria");

        agenda.imprimirAgenda();

        agenda.imprimirPessoa(10);
        agenda.imprimirPessoa(0);



    }

}
