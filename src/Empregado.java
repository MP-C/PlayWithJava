public class Empregado {
    //private final double VARIVELCONSTANTE =0;
    private String nome;
    private String funcao;
    private String dataPagamento;
    private double salarioBruto;
    private double descontos;
    private double contribuinteFiscal;
    private double segSocial;
    private double abonos;

    //constructor
    public Empregado(String nome, String funcao, String dataPagamento, double salarioBruto, double contribuinteFiscal, double segSocial, double abonos) {
        this.nome = nome;
        this.funcao = funcao;
        this.dataPagamento = dataPagamento;
        this.salarioBruto = salarioBruto;
        this.contribuinteFiscal = contribuinteFiscal;
        this.segSocial = segSocial;
        this.abonos = abonos;
        setDescontos();
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getDescontos() {
        return descontos;
    }

    public double getContribuinteFiscal() {
        return contribuinteFiscal;
    }

    public double getSegSocial() {
        return segSocial;
    }

    public double getAbonos() {
        return abonos;
    }

    //set Descontos para alterar o valor que directamente na instância do objeto
    private void setDescontos() {
        descontos = contribuinteFiscal + segSocial;
    }

    public void setContribuinteFiscal(double contribuinteFiscal) {
        this.contribuinteFiscal = contribuinteFiscal;
        setDescontos();
    }

    public void setSegSocial(double segSocial) {
        this.segSocial = segSocial;
        setDescontos();
    }
    public double salarioLiqTotal(){
        return (salarioBruto - descontos + abonos);
    }

    //setters mesmo não precisando deles
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setAbonos(double abonos) {
        this.abonos = abonos;
    }
}
