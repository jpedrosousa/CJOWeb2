
public class Tarefa {
    private int codigo;
    private String titulo;

    public Tarefa(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return codigo + " - " + titulo;
    }
}