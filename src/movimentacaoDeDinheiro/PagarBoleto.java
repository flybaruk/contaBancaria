package movimentacaoDeDinheiro;

public class PagarBoleto extends MovimentacaoDeDinheiro{
    private double conta;

    public double getConta() {
        return conta;
    }
    public void setConta(double conta) {
        this.conta = conta;
    }
    public double movimentacao(double saldo) {
        return saldo - conta;
    }
}
