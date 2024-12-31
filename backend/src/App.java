package backend.src;

import backend.Leito.GerenciamentoLeitos;
import backend.Leito.Locacao;
import backend.Pacientes.GerenciadordePacientes;
import backend.Pacientes.Paciente;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoLeitos gerenciamentoLeitos = new GerenciamentoLeitos();
        GerenciadordePacientes gerenciadorPacientes = new GerenciadordePacientes();

        while (true) {
            System.out.println("\n--- Sistema Hospitalar ---");
            System.out.println("1. Gerenciar Leitos");
            System.out.println("2. Gerenciar Pacientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Gerenciamento de Leitos ---");
                    System.out.println("1. Adicionar Leito");
                    System.out.println("2. Alterar Estado de Leito");
                    System.out.println("3. Listar Leitos");
                    System.out.println("4. Buscar Leito");
                    System.out.println("5. Remover Leito");
                    System.out.print("Escolha uma opção: ");
                    int opcaoLeito = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoLeito) {
                        case 1:
                            System.out.print("Código do Leito: ");
                            int codigo = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Estado (DISPONIVEL/OCUPADO): ");
                            Locacao estado = Locacao.valueOf(scanner.nextLine().toUpperCase());
                            System.out.print("Tipo do Leito: ");
                            String tipo = scanner.nextLine();
                            gerenciamentoLeitos.adicionarLeito(codigo, estado, tipo);
                            break;
                        case 2:
                            System.out.print("Código do Leito: ");
                            int codigoAlterar = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Novo Estado (DISPONIVEL/OCUPADO): ");
                            Locacao novoEstado = Locacao.valueOf(scanner.nextLine().toUpperCase());
                            gerenciamentoLeitos.alterarEstadoLeito(codigoAlterar, novoEstado);
                            break;
                        case 3:
                            gerenciamentoLeitos.listarLeitos();
                            break;
                        case 4:
                            System.out.print("Código do Leito: ");
                            int codigoBuscar = scanner.nextInt();
                            scanner.nextLine();
                            gerenciamentoLeitos.buscarLeito(codigoBuscar);
                            break;
                        case 5:
                            System.out.print("Código do Leito: ");
                            int codigoRemover = scanner.nextInt();
                            scanner.nextLine();
                            gerenciamentoLeitos.removerLeito(codigoRemover);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Gerenciamento de Pacientes ---");
                    System.out.println("1. Adicionar Paciente");
                    System.out.println("2. Remover Paciente");
                    System.out.println("3. Listar Pacientes");
                    System.out.print("Escolha uma opção: ");
                    int opcaoPaciente = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoPaciente) {
                        case 1:
                            System.out.print("Nome: ");
                            String nome = scanner.nextLine();
                            System.out.print("Idade: ");
                            int idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("CPF: ");
                            String cpf = scanner.nextLine();
                            System.out.print("Diagnóstico: ");
                            String diagnostico = scanner.nextLine();
                            System.out.print("Telefone: ");
                            String telefone = scanner.nextLine();
                            System.out.print("Plano de Saúde (true/false): ");
                            boolean planoDeSaude = scanner.nextBoolean();
                            Paciente paciente = new Paciente(nome, idade, cpf, diagnostico, telefone, planoDeSaude);
                            gerenciadorPacientes.adicionarPaciente(paciente);
                            break;
                        case 2:
                            System.out.print("CPF do Paciente: ");
                            String cpfRemover = scanner.nextLine();
                            gerenciadorPacientes.removerPaciente(cpfRemover);
                            break;
                        case 3:
                            gerenciadorPacientes.listarPacientes();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
