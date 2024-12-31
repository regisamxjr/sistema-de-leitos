package backend.src;

import backend.Leito.GerenciamentoLeitos;
import backend.Leito.Leitos;
import backend.Leito.Locacao;
import backend.Pacientes.GerenciadordePacientes;
import backend.Pacientes.Paciente;

public class Teste {
    public static void main(String[] args) {
        // Teste de Gerenciamento de Leitos
        GerenciamentoLeitos gerenciamentoLeitos = new GerenciamentoLeitos();
        gerenciamentoLeitos.adicionarLeito(101, Locacao.DISPONIVEL, "Quarto Individual");
        gerenciamentoLeitos.adicionarLeito(102, Locacao.OCUPADO, "UTI");
        gerenciamentoLeitos.listarLeitos();
        gerenciamentoLeitos.alterarEstadoLeito(101, Locacao.OCUPADO);
        gerenciamentoLeitos.buscarLeito(102);
        gerenciamentoLeitos.removerLeito(102);
        gerenciamentoLeitos.listarLeitos();

        // Teste de Gerenciamento de Pacientes
        GerenciadordePacientes gerenciadorPacientes = new GerenciadordePacientes();
        Paciente paciente1 = new Paciente("Alice", 30, "12345678901", "Gripe", "99999-9999", true);
        Paciente paciente2 = new Paciente("Bruno", 40, "98765432100", "Fratura", "88888-8888", false);
        gerenciadorPacientes.adicionarPaciente(paciente1);
        gerenciadorPacientes.adicionarPaciente(paciente2);
        gerenciadorPacientes.listarPacientes();
        gerenciadorPacientes.removerPaciente("12345678901");
        gerenciadorPacientes.listarPacientes();
    }
}
