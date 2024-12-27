package backend.Pacientes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadordePacientes {
    private List<Paciente> listaDePacientes;

    // Construtor
    public GerenciadordePacientes() {
        this.listaDePacientes = new ArrayList<>();
    }

    // Adicionar paciente
    public void adicionarPaciente(Paciente paciente) {
        if (paciente != null && buscarPacientePorCpf(paciente.getCpf()) == null) {
            listaDePacientes.add(paciente);
        } else {
            System.out.println("Paciente já cadastrado ou inválido.");
        }
    }

    // Remover paciente pelo CPF
    public boolean removerPaciente(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("CPF inválido.");
            return false;
        }
        boolean removido = listaDePacientes.removeIf(p -> p.getCpf().equals(cpf));
        if (!removido) {
            System.out.println("Paciente com o CPF " + cpf + " não encontrado.");
        }
        return removido;
    }

    // Buscar paciente pelo CPF
    public Paciente buscarPacientePorCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("CPF inválido.");
            return null;
        }
        for (Paciente paciente : listaDePacientes) {
            if (paciente.getCpf().equals(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    // Listar todos os pacientes em ordem alfabética
    public void listarPacientes() {
        if (listaDePacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }
        Collections.sort(listaDePacientes); // Ordena a lista antes de exibir
        System.out.println("Lista de pacientes (em ordem alfabética):");
        for (Paciente paciente : listaDePacientes) {
            System.out.println(paciente);
        }
    }

    // Obter a quantidade total de pacientes
    public int obterQuantidadeDePacientes() {
        return listaDePacientes.size();
    }
}
