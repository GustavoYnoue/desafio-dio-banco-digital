package desafio.projeto.banco;

public class Main {
    public static void main(String[] args) {
        Cliente nomeCliente = new Cliente();
        nomeCliente.setNome("Gustavo");

        Conta cc = new ContaCorrente(nomeCliente);
        cc.depositar(100);
        cc.sacar(10);

        Conta poupanca = new ContaPoupanca(nomeCliente);
        cc.transferir(30, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
