package movimentacaoDeDinheiro;

import chequeEspecial.ConsultarCheque;
import saldo.Saldo;

public class Deposito extends MovimentacaoDeDinheiro{
    private double deposito;
    private boolean primeiroDeposito = true;
    private Saldo saldo = new Saldo();
    

    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        
        setPrimeiroDeposito(false);
        this.deposito = deposito;
    }

    public void setPrimeiroDeposito(boolean primeiroDeposito) {
        this.primeiroDeposito = primeiroDeposito;
    }

    public boolean getPrimeiroDeposito() {
        return primeiroDeposito;
    }

    public double movimentacao(double deposito) {
        
        return this.saldo.getSaldo() + deposito;
    }
}
