package ex003.agendaTelefonica.visao;

import ex003.agendaTelefonica.modelo.Agenda;
import ex003.agendaTelefonica.modelo.Contato;
import ex003.agendaTelefonica.modelo.TipoNumero;

public class Principal {

    public static void main(String[] args) {
        Contato contato1 = new Contato(TipoNumero.Celular, "98 98765-4321");

        Agenda agenda1 = new Agenda("Yudi", contato1, "yudi@email.com");

        System.out.println("--- Agenda ---");
        agenda1.imprimirDados();

        Contato contato2 = new Contato();
        contato2.setTipo(TipoNumero.Telefone);
        contato2.setNumero("4002-8922");

        agenda1.setContato(contato2);

        System.out.println("--- Agenda ---");
        agenda1.imprimirDados();

    }



}
