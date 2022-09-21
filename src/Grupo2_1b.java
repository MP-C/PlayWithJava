//RECIBO E EMPREGADO
public class Grupo2_1b {
    public static void main(String[] args) {
        System.out.println("P-FOLIO 2021/2022");
        System.out.println("Grupo 2, alinea X :");
        Empregado it = new Empregado("Pedro Capela R.", "Full Stack", "07/06/2022", 17000.00,  114.39, 107.55, 253.12);

        Recibo recibo = new Recibo();
        recibo.adicionarEmpregado(it);
        recibo.adicionarEmpregado(new Empregado("Mario Carvalho", "Enfermeiro", "07/06/2022", 14000.00, 103.39, 97.33, 202.20));
        recibo.imprimirSalario();
    }
}