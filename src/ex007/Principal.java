package ex007;

public class Principal {

    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.inicializar(8, 5);
        elevador.imprimeStatus();


        for (int i = 0; i < 3; i++) {
            elevador.entrar(1);
        }

        elevador.subir();
        elevador.subir();
        elevador.desce();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.andarAtual();

        elevador.sair();
        elevador.sair();
        elevador.sair();

        elevador.imprimeStatus();


    }

}
