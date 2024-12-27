package backend.Leito;

public class Leitos {
    private int codigo;
    private Locacao estado; 
    private String tipo;

    // Construtor para inicializar os atributos
    public Leitos(int codigo, Locacao estado, String tipo) {
        this.codigo = codigo;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Locacao getEstado() {
        return estado;
    }

    public void setEstado(Locacao estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Leito " + codigo + " está " + estado + " (" + tipo + ")";
    }
}
