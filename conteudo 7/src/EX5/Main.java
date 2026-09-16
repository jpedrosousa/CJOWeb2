
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Atualizar estoque");
            System.out.println("4 - Listar estoque baixo");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    boolean existe = false;

                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigo) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("Código já cadastrado!");
                    } else {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Estoque: ");
                        int estoque = sc.nextInt();

                        produtos.add(new Produto(codigo, nome, estoque));
                        System.out.println("Produto adicionado!");
                    }
                    break;

                case 2:
                    System.out.print("Código: ");
                    codigo = sc.nextInt();

                    existe = false;

                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigo) {
                            System.out.println("Nome: " + p.getNome());
                            System.out.println("Estoque: " + p.getEstoque());
                            existe = true;
                            break;
                        }
                    }

                    if (!existe)
                        System.out.println("Produto não encontrado.");
                    break;

                case 3:
                    System.out.print("Código: ");
                    codigo = sc.nextInt();

                    existe = false;

                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigo) {
                            System.out.print("Novo estoque: ");
                            int novoEstoque = sc.nextInt();

                            p.setEstoque(novoEstoque);
                            System.out.println("Estoque atualizado!");
                            existe = true;
                            break;
                        }
                    }

                    if (!existe)
                        System.out.println("Produto não encontrado.");
                    break;

                case 4:
                    for (Produto p : produtos) {
                        if (p.getEstoque() < 5) {
                            System.out.println(
                                p.getNome() + " - " + p.getEstoque());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}