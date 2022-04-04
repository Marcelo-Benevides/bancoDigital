public class ContaPoupanca extends Conta {

    public <Cliente> ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        super.imprimirInfoComuns();
    }

}
