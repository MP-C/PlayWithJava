import java.util.ArrayList;
import java.util.List;

public class Pauta {
    private List<Aluno> alunos;

    //Constructor
    public Pauta(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Pauta(){
        this.alunos=new ArrayList<>();
    }

    public void adicionarAluno(Aluno novoAluno) {
        alunos.add(novoAluno);
    }

    //getter
    public List<Aluno> getAlunos() {
        return alunos;
    }

    //setter
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    private void imprimirHeader(){
        System.out.println("Numero Aluno" + " \t| " + "Nome" + " \t\t\t\t\t| " + "Nota"  + " \t\t| " + "Resultado Final");
    }
    public void imprimirLinhas(){
        for(Aluno resultado : alunos){
            System.out.println(resultado.getNumero()+ " \t\t| " + resultado.getNome() + " \t\t| " + resultado.getNota() + " \t\t| " + resultado.getResultadoFinal() );
        }
    }
    public void totalAlunosReprovados(){
        int totalAlunos = 0;
        for(Aluno reprovado:alunos){
            if(reprovado.getNota() <= 10) {
                totalAlunos += 1;
            }
        }
        System.out.println("Total alunos Reprovados: " + " \t\t\t\t| " + " \t\t\t| " + totalAlunos);
    }
    public void totalAlunosInscritos(){
        int totalAlunos = 0;
        for(Aluno inscrito:alunos){
            if(inscrito.getNumero() != "") {
                totalAlunos += 1;
            }
        }
        System.out.println("Total alunos Inscritos: " + " \t\t\t\t| " + " \t\t\t| " + totalAlunos);
    }

    public void mediasTurma(){
        double soma=0;
        double somaAprovados=0;
        double totalAprovados=0;

        for(Aluno inscrito:alunos){
            if(inscrito.getNota() != 0 ) {
                soma += inscrito.getNota();
            }
        }

        for(Aluno inscrito:alunos){
            if(inscrito.getResultadoFinal() == "Aprovado"){
                somaAprovados += inscrito.getNota();
                totalAprovados++;
            }
        }

        double mediaAll = soma / alunos.size();
        double mediaAprovados = somaAprovados /totalAprovados;
        System.out.println("Media de notas da Turma: " + " \t\t\t\t| " + mediaAll);
        System.out.println("Media de notas dos Aprovados da Turma:  | " + mediaAprovados);
    }

    public void imprimirPauta(){
        imprimirHeader();
        imprimirLinhas();
        totalAlunosReprovados();
        totalAlunosInscritos();
        mediasTurma();
    }
}
