//Fatura e Produto
import java.util.Arrays;
import java.util.List;

public class Grupo2_1 {
    public static void main(String[] args) {
        Produto batata = new Produto(10, "kilo", "batata", 1.0, 0.10);
        Produto cenoura = new Produto(20, "kilo", "cenoura", 2.0, 0.10);

        List<Produto> produtos = Arrays.asList(batata, cenoura);

        Fatura fatura = new Fatura(produtos);
        fatura.imprimir();

        //System.out.println(fatura.calcularTotalComIVA());
        //System.out.println(fatura.calcularTotalIVA());

        Fatura fatura2 = new Fatura();
        fatura2.adicionarProduto(batata);
        fatura2.adicionarProduto(new Produto(20, "kilo", "cenoura", 2.0, 0.10));

    }
}

        /*Produto batata = new Produto(10, "kilo", "batata", 1.0, 0.10);
        Produto cenoura = new Produto(20, "kilo", "cenoura", 2.0, 0.10);

        System.out.println("BATATA: " + batata.calcularPrecoComIva() + " Preco to
        tal em euros");
        System.out.println("BATATA: " + batata.calcularIva() + " IVA em euros");

        System.out.println("CENOURA: " + cenoura.calcularPrecoComIva() + " Preco total em euros");
        System.out.println("CENOURA: " + cenoura.calcularIva() + " IVA em euros");*/

