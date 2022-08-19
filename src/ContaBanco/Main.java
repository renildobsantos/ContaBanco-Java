package ContaBanco;

public class Main {
    public static void main(String[] args) {

        Conta p1 = new Conta();
        p1.setDono("Paulo");
        p1.setNumConta(1111);
        p1.abrirConta("CC");

        Conta p2 = new Conta();
        p2.setDono("Marcia");
        p2.setNumConta(2222);
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(50);

        p1.sacar(50);
        p2.sacar(50);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
