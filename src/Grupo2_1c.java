//ALUNO E PAUTA

public class Grupo2_1c {
    public static void main(String[] args) {
        System.out.println("P-FOLIO 2021/2022");
        System.out.println("Grupo 2, alinea X :");
        Aluno Chico = new Aluno("2122123", "Duarte Carvalho", 9.5);
        Aluno Pedro = new Aluno("2000654", "Pedro Capela R.", 9.4);
        Aluno To = new Aluno("2222111", "Antonio Silva ", 7.4);

        Pauta pauta = new Pauta();
        pauta.adicionarAluno(Chico);
        pauta.adicionarAluno(Pedro);
        pauta.adicionarAluno(To);
        pauta.adicionarAluno(new Aluno("2000563", "Mario Carvalho", 15));
        pauta.adicionarAluno(new Aluno("2012222", "Ines Oliveira", 18));
        pauta.adicionarAluno(new Aluno("2022111", "Joana Martins", 18));
        pauta.adicionarAluno(new Aluno("2000100","Marina Baltar ", 19.5));
        pauta.imprimirPauta();

        System.out.println("*****FIM*****");
    }
}
