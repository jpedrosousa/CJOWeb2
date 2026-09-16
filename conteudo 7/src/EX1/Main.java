
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        int opcao;
        int codigo = 1;

        do {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    tarefas.add(new Tarefa(codigo++, titulo));
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    System.out.print("Código da tarefa: ");
                    int cod = sc.nextInt();

                    boolean encontrou = false;

                    for (Tarefa t : tarefas) {
                        if (t.getCodigo() == cod) {
                            tarefas.remove(t);
                            encontrou = true;
                            break;
                        }
                    }

                    if (encontrou)
                        System.out.println("Tarefa removida!");
                    else
                        System.out.println("Tarefa não encontrada.");
                    break;

                case 3:
                    for (Tarefa t : tarefas) {
                        System.out.println(t);
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}