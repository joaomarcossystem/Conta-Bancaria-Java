public class contaPoupanca extends ContaBancaria {
    private double tavaRendimento;

    public contaPoupanca(String titular, double saldo, double tavaRendimento) {
        super(titular, saldo);
        this.tavaRendimento = tavaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            depositar(-valor);
            System.out.println(getTitular() + " sacou R$" + valor + " da poupança");

        } else {

            System.out.println("Saldo insuficiente para " + getTitular() + " (Poupança)");
        }
    }
}
