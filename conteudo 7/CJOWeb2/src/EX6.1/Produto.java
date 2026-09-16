class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto(1, "Caderno", 20.0);

        p.setNome("Caneta");
        p.setPreco(5.0);

        System.out.println("Código: " + p.getCodigo());
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
    }
}