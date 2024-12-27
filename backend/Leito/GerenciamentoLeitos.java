package backend.Leito;

import backend.Leito.Leitos;
import backend.Leito.Locacao;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoLeitos {

    private List<Leitos> listaLeitos;

    public GerenciamentoLeitos() {
        listaLeitos = new ArrayList<>();
    }

    public void adicionarLeito(int codigo, Locacao estado, String tipo) {
        Leitos novoLeito = new Leitos(codigo, estado, tipo);
        listaLeitos.add(novoLeito);
    }

    public void alterarEstadoLeito(int codigo, Locacao novoEstado) {
        for (Leitos leito : listaLeitos) {
            if (leito.getCodigo() == codigo) {
                leito.setEstado(novoEstado);
                System.out.println("Estado do leito " + codigo + " alterado para " + novoEstado);
                return;
            }
        }
        System.out.println("Leito com código " + codigo + " não encontrado.");
    }

    public void listarLeitos() {
        if (listaLeitos.isEmpty()) {
            System.out.println("Não há leitos cadastrados.");
            return;
        }
        for (Leitos leito : listaLeitos) {
            System.out.println(leito);
        }
    }

    public void buscarLeito(int codigo) {
        for (Leitos leito : listaLeitos) {
            if (leito.getCodigo() == codigo) {
                System.out.println(leito);
                return;
            }
        }
        System.out.println("Leito com código " + codigo + " não encontrado.");
    }

    public void removerLeito(int codigo) {
        Leitos leitoParaRemover = null;
        for (Leitos leito : listaLeitos) {
            if (leito.getCodigo() == codigo) {
                leitoParaRemover = leito;
                break;
            }
        }
        if (leitoParaRemover != null) {
            listaLeitos.remove(leitoParaRemover);
            System.out.println("Leito " + codigo + " removido.");
        } else {
            System.out.println("Leito com código " + codigo + " não encontrado.");
        }
    }
}
