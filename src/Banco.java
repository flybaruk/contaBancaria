import chequeEspecial.ConsultarCheque;
import movimentacaoDeDinheiro.Deposito;
import movimentacaoDeDinheiro.PagarBoleto;
import movimentacaoDeDinheiro.Saque;
import saldo.Saldo;

public class Banco {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        Saque saque = new Saque();
        PagarBoleto pagar = new PagarBoleto();
        ConsultarCheque cheque = new ConsultarCheque();
        Saldo saldo = new Saldo();

        System.out.println("Valor inicial: "+saldo.getSaldo());
        
        saldo.setSaldo(deposito.movimentacao(2000));
        System.out.println("Primeiro deposito: "+ saldo.getSaldo());
        System.out.println(cheque.getLimite());
        saldo.setSaldo(saque.movimentacao(1000));

    }
}
