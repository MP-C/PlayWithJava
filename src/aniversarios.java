import java.util.List;

public class aniversarios {



    public static void main(String[] args) {
        System.out.println("Exame Grupo2 exercicio 3: ");

        Agenda agenda1 = new Agenda();
        agenda1.adicionarPessoa(Pessoa);

        System.out.println("****FIM****");
    }

    public static class Pessoa {
        private String nome;
        private String dataNascimento;
        private String contacto;
        private String email;

        //Constructor
        public Pessoa(String nome, String dataNascimento, String contacto, String email) {
            this.nome = nome;
            this.dataNascimento = dataNascimento;
            this.contacto = contacto;
            this.email = email;
        }

        public Pessoa() {
        }

        // Getters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDataNascimento() {
            return dataNascimento;
        }

        //Setters
        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public String getContacto() {
            return contacto;
        }

        public void setContacto(String contacto) {
            this.contacto = contacto;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
    public static class Agenda {
        private int refPessoa;

        private boolean status;

        private String dataInclusao;

        private List<Agenda> agendas;

        public Agenda(List<Agenda> x) {
            this.agendas = x;
        }

        //Constructor
        public Agenda(int refPessoa, boolean status, String dataInclusao) {
            this.refPessoa = refPessoa;
            this.status = status;
            this.dataInclusao = dataInclusao;
        }

        public Agenda() {
        }

        public void adicionarPessoa(Pessoa novaPessoa) {
            pessoas.add(novaPessoa);
        }

        // Getters

        public int getRefPessoa() {
            return refPessoa;
        }

        public boolean isStatus() {
            return status;
        }

        public String getDataInclusao() {
            return dataInclusao;
        }

        //Setters

        public void setRefPessoa(int refPessoa) {
            this.refPessoa = refPessoa;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public void setDataInclusao(String dataInclusao) {
            this.dataInclusao = dataInclusao;
        }
    }
}
