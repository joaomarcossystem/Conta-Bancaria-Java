import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Criar a lista de contas (polimorfismo: tipo genérico ContaBancaria)
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        // 2️⃣ Adicionar uma ContaCorrente
        // Formato: novo ContaCorrente(titular, saldoInicial, limiteEspecial)
        contas.add(new contaCorrente("João", 1000, 500));

        // 3️⃣ Adicionar uma ContaPoupanca
        // Formato: novo ContaPoupanca(titular, saldoInicial, taxaRendimento)
        contas.add(new contaPoupanca("Maria", 1000, 0.02));

        // 4️⃣ Percorrer a lista e realizar operações
        for (ContaBancaria conta : contas) {
            System.out.println("\n--- Operações para: " + conta.getTitular() + " ---");

            // Tentativa de saque de 1200 (polimorfismo entra aqui)
            conta.sacar(1200);

            // Depósito de 300
            conta.depositar(300);

            // Mostrar saldo final
            System.out.println("Saldo final de " + conta.getTitular() + ": R$" + conta.getSaldo());
        }
    }
}
