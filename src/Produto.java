public class Produto {
    private int quantidade;
    private String tipoUnidade;
    private String descricao;
    private double preco;
    private double iva; //0 a 1

    //private double precoComIva; depende da necessidade de se querer ter na instancia do objeto um calculo do preço a ocupar memoria ou não
    //nao criei aqui totais para evitar criar mais objectos em memoria!
    public Produto(int quantidade, String tipoUnidade, String descricao, double preco, double iva) {
        this.quantidade = quantidade;
        this.tipoUnidade = tipoUnidade;
        this.descricao = descricao;
        this.preco = preco;
        this.iva = iva;
        //calculatePrecoComIva(); // em função da criação do parametro anterior
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public double getIva() {
        return iva;
    }

    public double calcularIva() {
        return quantidade * preco * iva;
    }

    public double calcularPrecoComIva() {
        return quantidade * preco + calcularIva();
    }

    public String getIvaToPrint() {
        return String.valueOf(iva * 100) + " %";
    }
}
    /*public void setIva(double iva) {
        this.iva = iva;
        calculatePrecoComIva();
    }

    public void setPreco(double preco) {
        this.preco = preco;
        calculatePrecoComIva();
    }

    private void calculatePrecoComIva() {
        precoComIva = preco * iva * quantidade;
    }*/


