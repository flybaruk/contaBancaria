package chequeEspecial;

import movimentacaoDeDinheiro.Deposito;
import saldo.Saldo;

public class ConsultarCheque {
    private double limite = 0;
    private double solicitado = 0;
    private boolean verificador = true;
    private Saldo saldo = new Saldo();
    private Deposito deposito = new Deposito();


    public void definirLimite(double valor){
        
        if (deposito.getPrimeiroDeposito() == true) {

            if (valor <= 500) {
                limite = 50;
            }else {
                limite = valor*0.5;
            }
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setSolicitado(double solicitado) {
        if (solicitado > limite) {
            System.out.println("Voce não pode solicitar esse valor de cheque especial");
        }else if (verificador == false) {
            System.err.println("Voce não pode solicitar o cheque, pois ainda não pagou o ultimo solicitado");
        }else{
            this.solicitado = solicitado;
            saldo.setSaldo(solicitado+saldo.getSaldo());
            }
    }

    

    public double getSolicitado() {
        return solicitado;
    }



}
