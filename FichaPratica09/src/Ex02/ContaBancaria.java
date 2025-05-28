package Ex02;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int anoAbertura = 2025;
    private double margemEmprestimo = 0.5;
    private double valorEmDivida = 0.0;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("[%s] Depósito de %.2f€ efetuado. Saldo atual: %.2f€.%n", titular, valor, saldo);
        } else {
            System.out.printf("[%s] Valor de depósito inválido.%n", titular);
        }
    }

    public void pedirEmprestimo(double valor) {
        double limite = saldo * margemEmprestimo;
        System.out.printf("[%s] Pedido de empréstimo: %.2f€ | Limite disponível: %.2f€%n", titular, valor, limite);

        if (valorEmDivida > 0) {
            System.out.printf("[%s] Empréstimo recusado: já existe um valor em dívida de %.2f€.%n", titular, valorEmDivida);
        } else if (valor > limite) {
            System.out.printf("[%s] Empréstimo recusado: valor pedido excede a margem de empréstimo.%n", titular);
        } else {
            saldo += valor;
            valorEmDivida = valor;
            System.out.printf("[%s] Empréstimo concedido de %.2f€. Novo saldo: %.2f€.%n", titular, valor, saldo);
        }
    }

    public void amortizarEmprestimo(double valor) {
        System.out.printf("[%s] Pedido de amortização de %.2f€.%n", titular, valor);

        if (valor > valorEmDivida) {
            System.out.printf("[%s] Amortização recusada: valor superior à dívida (%.2f€).%n", titular, valorEmDivida);
        } else if (valor > saldo) {
            System.out.printf("[%s] Amortização recusada: saldo insuficiente (%.2f€).%n", titular, saldo);
        } else {
            saldo -= valor;
            valorEmDivida -= valor;
            System.out.printf("[%s] Amortização de %.2f€ efetuada. Saldo: %.2f€, Dívida restante: %.2f€.%n",
                    titular, valor, saldo, valorEmDivida);
        }
    }
}

