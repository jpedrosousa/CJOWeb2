import javax.swing.JOptionPane;

class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        alterarData(dia, mes, ano);
    }

    public void alterarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || ano < 1900) {
            throw new IllegalArgumentException("Data inválida");
        }

        int[] dias = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            dias[1] = 29;
        }

        if (dia < 1 || dia > dias[mes - 1]) {
            throw new IllegalArgumentException("Data inválida");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}

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
            JOptionPane.showMessageDialog(null, "Data inválida!");
        }
    }
}