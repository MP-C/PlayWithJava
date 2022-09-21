public class Aluno {
    private String numero;
    private String nome;
    private double nota;
    private String resultadoFinal;

    public Aluno(String numero, String nome, double nota) {
        this.numero = numero;
        this.nome = nome;
        this.nota = nota;
        setResultadoFinal();
    }

    //getter
    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    //setter
    public void setNota(double nota) {
        this.nota = nota;
        setResultadoFinal();
    }

    private void setResultadoFinal() {
        if(nota >= 9.5){
            resultadoFinal = "Aprovado";
        }else{
            resultadoFinal = "Reprovado";
        }
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
