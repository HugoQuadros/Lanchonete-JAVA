public abstract class Lanche {

    private double preco;
    private int tempoPreparo;
    private int tempoEntrega;


    public Lanche() {
        this.preco=0;
        this.tempoPreparo=0;
        this.tempoEntrega=10;
    }
    public Lanche(double preco, int tempoPreparo, int tempoEntrega) {
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.tempoEntrega = tempoEntrega;
    }


    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getTempoPreparo() {
        return tempoPreparo;
    }
    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }
    public int getTempoEntrega() {
        return tempoEntrega;
    }
    public void setTempoEntrega(int tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }


    public int calcularEntrega(int distancia) {
        return getTempoEntrega()*distancia;
    }

}