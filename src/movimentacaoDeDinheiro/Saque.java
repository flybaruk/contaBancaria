package movimentacaoDeDinheiro;

public class Saque extends MovimentacaoDeDinheiro{
    private double saque;

    public void setSaque(double saque) {
        this.saque = saque;
    }
    public double getSaque() {
        return saque;
    }

    public double movimentacao(double saldo){
        return saldo - saque;
    }
}
