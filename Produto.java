public class Produto {
    private int estoqueAtual;
    private int estoqueMax;
    private int estoqueMin;

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }
    public int getEstoqueAtual() {
        return this.estoqueAtual;
    }
    public void setEstoqueMax(int estoqueMax) {
        this.estoqueMax = estoqueMax;
    }
    public int getEstoqueMax() {
        return this.estoqueMax;
    }
    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
    public int getEstoqueMin() {
        return this.estoqueMin;
    }
    public void calculaEstoqueAtual() {
        int avg = (this.getEstoqueMax() + this.getEstoqueMin()) / 2;
        if (this.getEstoqueAtual() >= avg) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
