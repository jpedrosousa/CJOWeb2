import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(15, 8, 2026);

        int dia = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o dia:"));

        int mes = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o mês:"));

        int ano = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o ano:"));

        try {
            data.alterarData(dia, mes, ano);

            JOptionPane.showMessageDialog(
                null, "Nova data: " + data.getData());

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(
                null, "Data inválida!");
        }
    }
}