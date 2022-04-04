public class Main {

    public static void main(String[] args) {

        cliente marcelo = new cliente();
        marcelo.setNome("Marcelo");


        IConta cc = new ContaCorrente(marcelo);
        cc.depositar(100);

        IConta poupanca = new ContaPoupanca(marcelo);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}