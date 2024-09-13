public class Conta {
    public double saldo;
    public int numeroConta;

    
    public Conta(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   
    public int getNumeroConta() {
        return numeroConta;
    }

    @Override
    public String toString() {
        return "CONTA:\n" + 
               "NUMERO DA CONTA: " + this.numeroConta + "\n" + 
               "SALDO: R$" + this.saldo;
    }
}