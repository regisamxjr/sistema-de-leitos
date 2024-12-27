package backend.Pacientes;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int idade;
    private String cpf;
    private String diagnostico;
    private String telefone;
    private boolean planoDeSaude;

    // Construtor
    public Paciente(String nome, int idade, String cpf, String diagnostico, String telefone, boolean planoDeSaude) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.diagnostico = diagnostico;
        this.telefone = telefone;
        this.planoDeSaude = planoDeSaude;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(boolean planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    // Método toString para exibir informações do paciente
    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", telefone='" + telefone + '\'' +
                ", planoDeSaude=" + planoDeSaude +
                '}';
    }

    // Implementação de Comparable para ordenação por nome
    @Override
    public int compareTo(Paciente outro) {
        return this.nome.compareToIgnoreCase(outro.nome);
    }
}
