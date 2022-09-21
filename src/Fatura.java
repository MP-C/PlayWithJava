import java.util.List;

public class Fatura {
    private List<Produto> produtos;

    public Fatura(List<Produto> x) {
        this.produtos = x;
    }

    public Fatura() {
    }

    public void adicionarProduto(Produto novoProduto) {
        produtos.add(novoProduto);
    }

    private double calcularTotalComIVA() {
        double totalCiva = 0;
        for (Produto produto : produtos) {
            totalCiva += produto.calcularPrecoComIva();
        }
        return totalCiva;
    }

    private double calcularTotalIVA() {
        double totalIva = 0;
        for (Produto produto : produtos) {
            totalIva += produto.calcularIva();
        }
        return totalIva;
    }

    public void imprimirHeader(){
        /*for (Produto produto : produtos){
            System.out.println(produto.);
        }*/
        System.out.println("Descricao \t| Quantidade \t| Unidades \t| Preço/Unidade \t| Iva Percentagem \t| Total Iva \t| Total a Pagar");
    }

    public void imprimirProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getDescricao() + "  \t| " + produto.getQuantidade() + "\t\t\t| " + produto.getTipoUnidade() + "\t\t|" +
                    produto.getPreco() + "\t\t\t\t| " + produto.getIvaToPrint() + "\t\t\t| " + produto.calcularIva() + "\t\t\t| " + produto.calcularPrecoComIva());
        }
    }

    public void imprimirTotais(){
            System.out.println("Total IVA\t|"+ " \t\t\t\t| \t\t\t| \t\t\t\t\t|" + "\t\t\t\t\t| " + calcularTotalIVA() + "\t\t\t| " );
            System.out.println("Preco c/ IVA|"+ " \t\t\t\t| \t\t\t| \t\t\t\t\t|" + "\t\t\t\t\t| " + "\t\t\t\t| " + calcularTotalComIVA() );
    }

    public void imprimir(){
        imprimirHeader();
        imprimirProdutos();
        imprimirTotais();
    }
}
