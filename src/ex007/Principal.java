package ex007;

public class Principal {

    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.inicializar(15, 8);

        elevador.entrar(8);

        elevador.sair();

        elevador.subir();
        elevador.subir();
        elevador.desce();
        elevador.subir();
        elevador.subir();
        elevador.desce();

        elevador.andarAtual();

    }

}
