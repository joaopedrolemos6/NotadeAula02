public class Macas {
    private int quantidade;
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float calculaPreco() {
        if (quantidade >= 12) {
            return 1.00f * quantidade;
        } else {
            return 1.30f * quantidade;
        }
    }
}