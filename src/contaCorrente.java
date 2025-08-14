public class contaCorrente extends ContaBancaria {
    private double limiteEspecial;

    public contaCorrente(String titular, double saldo, double limiteEspecial) {
        super(titular, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && getSaldo() + limiteEspecial >= valor){
            depositar(-valor);
            System.out.println(getTitular() + " sacou R$" + valor + " (usando limite especial se necessário)");
        }else{
            System.out.println("Limite insuficiente");
        }
    }
}
