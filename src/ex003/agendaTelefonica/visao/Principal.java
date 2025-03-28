package ex003.agendaTelefonica.visao;

import ex003.agendaTelefonica.modelo.Agenda;
import ex003.agendaTelefonica.modelo.Contato;
import ex003.agendaTelefonica.modelo.TipoNumero;

public class Principal {

    public static void main(String[] args) {
        Contato c1 = new Contato(TipoNumero.Celular, "98 9 9999999");
        Agenda a1 = new Agenda("Kauan", c1, "email@email.com");

        a1.imprimirDados();

    }



}
