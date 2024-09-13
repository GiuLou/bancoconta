public class Banco {
    private Conta[] contas;

    
    public Banco(int capacidade) {
        this.contas = new Conta[capacidade];
    }

    
    public void adicionarConta(Conta conta, int posicao) {
        if (posicao >= 0 && posicao < contas.length) {
            contas[posicao] = conta;
        } else {
            System.out.println("Posição inválida para adicionar conta.");
        }
    }

    
    public void exibirContas() {
        for (Conta conta : contas) {
            if (conta != null) { // Verifica se a conta não é nula
                System.out.println(conta);
                System.out.println(); // Linha em branco para melhor visualização
            }
        }
    }

    // Realiza uma transferência entre contas
    public void transferir(double valor, int numeroContaOrigem, int numeroContaDestino) {
        Conta contaOrigem = encontrarConta(numeroContaOrigem);
        Conta contaDestino = encontrarConta(numeroContaDestino);

        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.getSaldo() >= valor) {
                contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
                contaDestino.setSaldo(contaDestino.getSaldo() + valor);
                System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente na conta de origem.");
            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }

    // Calcula o saldo total de todas as contas
    public void calcularSaldoTotal() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            if (conta != null) { // Verifica se a conta não é nula
                saldoTotal += conta.getSaldo();
            }
        }
        System.out.println("Saldo total de todas as contas: R$" + saldoTotal);
    }

    // Encontra uma conta pelo número
    private Conta encontrarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta != null && conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
