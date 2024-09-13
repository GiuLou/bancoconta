public class App {
    public static void main(String[] args) {
       
        Conta contaGiu = new Conta(100.00, 4);
        Conta contaAle = new Conta(50.00, 5);

       
        Banco banco = new Banco(02);

       
        banco.adicionarConta(contaGiu, 0);
        banco.adicionarConta(contaAle, 1);

        
        System.out.println("Exibir todas as contas:");
        banco.exibirContas();

        
        double valorTransferencia = 30.00;

        // Realiza a transferência
        System.out.println("Realizando transferência de R$" + valorTransferencia + " da conta " + 4 + " para a conta " + 5 + ":");
        banco.transferir(valorTransferencia, 4, 5);

        
        System.out.println("Calculando saldo total:");
        banco.calcularSaldoTotal();
    }
}


        

