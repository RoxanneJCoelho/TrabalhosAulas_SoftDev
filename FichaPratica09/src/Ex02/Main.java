package Ex02;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar 3 contas
        ContaBancaria conta1 = new ContaBancaria("Alice", 1000);
        ContaBancaria conta2 = new ContaBancaria("Bruno", 200);
        ContaBancaria conta3 = new ContaBancaria("Carla", 50);

        // b) Depositar valores
        conta1.depositar(500);  // saldo: 1500
        conta2.depositar(300);  // saldo: 500
        conta3.depositar(100);  // saldo: 150

        System.out.println("\n--- Tentativas de empréstimo ---");
        // c) Empréstimo concedido e depois recusado por dívida ativa
        conta1.pedirEmprestimo(700);  // concedido (limite: 750)
        conta1.pedirEmprestimo(300);  // recusado: dívida ativa

        // c) Empréstimo recusado por valor alto
        conta2.pedirEmprestimo(300);  // limite: 250 -> recusado

        // d) Empréstimo válido
        conta3.pedirEmprestimo(75);   // saldo: 150 -> limite: 75 -> concedido

        System.out.println("\n--- Amortizações ---");
        // Amortização maior que dívida
        conta3.amortizarEmprestimo(100);  // recusado

        // Forçar saldo baixo para testar saldo insuficiente
        conta3.depositar(-130);  // saldo agora 150 - 130 = 20 (simulação de saldo baixo)
        conta3.amortizarEmprestimo(50);  // recusado

        // Amortização válida
        conta3.depositar(130);  // restaurar saldo para 150
        conta3.amortizarEmprestimo(50);  // amortiza com sucesso
    }
}

