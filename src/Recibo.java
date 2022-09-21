import java.util.ArrayList;
import java.util.List;

public class Recibo {
    private List<Empregado> empregados;

    //constructor
    public Recibo(List<Empregado> empregados) {
        this.empregados = this.empregados;
    }

    public Recibo() {
        this.empregados = new ArrayList<>();
    }

    //getter
    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void adicionarEmpregado(Empregado novoEmpregado) {
        empregados.add(novoEmpregado);
    }

    public void imprimirSalario(){
        for (Empregado vencimento: empregados) {
            System.out.println(vencimento.getDataPagamento() + " \t\t| " + vencimento.getNome() + " \t\t| " + vencimento.getFuncao()
                    + " \t| " + vencimento.salarioLiqTotal() + " = " + vencimento.getSalarioBruto() + " - "
                    + vencimento.getAbonos());
        }
    }

    //setter
    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }
}
