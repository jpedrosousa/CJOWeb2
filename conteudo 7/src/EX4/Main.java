
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Musica> playlist = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Adicionar música");
            System.out.println("2 - Buscar música");
            System.out.println("3 - Remover música");
            System.out.println("4 - Listar playlist");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Duração em segundos: ");
                    int duracao = sc.nextInt();

                    playlist.add(new Musica(titulo, artista, duracao));
                    System.out.println("Música adicionada!");
                    break;

                case 2:
                    System.out.print("Título: ");
                    String busca = sc.nextLine();

                    boolean encontrou = false;

                    for (Musica m : playlist) {
                        if (m.getTitulo().equalsIgnoreCase(busca)) {
                            System.out.println(m.getTitulo());
                            System.out.println(m.getArtista());
                            System.out.println(m.getDuracao() + " segundos");
                            encontrou = true;
                        }
                    }

                    if (!encontrou)
                        System.out.println("Música não encontrada.");
                    break;

                case 3:
                    System.out.print("Título: ");
                    String remover = sc.nextLine();

                    encontrou = false;

                    for (Musica m : playlist) {
                        if (m.getTitulo().equalsIgnoreCase(remover)) {
                            playlist.remove(m);
                            encontrou = true;
                            break;
                        }
                    }

                    if (encontrou)
                        System.out.println("Música removida!");
                    else
                        System.out.println("Música não encontrada.");
                    break;

                case 4:
                    int total = 0;

                    for (Musica m : playlist) {
                        System.out.println(
                            m.getTitulo() + " - " + m.getArtista());

                        total += m.getDuracao();
                    }

                    System.out.println("Tempo total: " +
                        (total / 60) + " minutos e " +
                        (total % 60) + " segundos.");
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