package entities;

public class BusinessAccount {
   private int numero;
   private String titular;
   private double saldo;
   private double limiteEmprestimo;

   public BusinessAccount(){

   }

    public BusinessAccount(int numero, String titular, double saldo, double limiteEmprestimo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public int getNumero() {
        return numero;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void deposito (double quantia){
       saldo += quantia;
    }
    public void saque (double quantia){
       saldo -= quantia + 5.0;
    }
}
