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