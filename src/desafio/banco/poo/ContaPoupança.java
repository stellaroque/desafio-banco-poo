package desafio.banco.poo;

public class ContaPoupança extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        super.imprimirInfosComuns();
    }
}
