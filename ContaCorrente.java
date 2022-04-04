public class ContaCorrente extends Conta {

    public <Cliente> ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
       super.imprimirInfoComuns();
        
    }
    
}