import javax.swing.JOptionPane;

public class vendas {
    public static void main(String[] args) {

        int totalVendas = 0;
        double somaVendas = 0;
        double maiorVenda = Double.MIN_VALUE;
        double menorVenda = Double.MAX_VALUE;

        while (true) {

            String input = JOptionPane.showInputDialog(
                null,
                "Digite o valor da venda (0 para encerrar):",
                "Registro de Vendas",
                JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) { // Cancelou
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }

            double valor;

            try {
                valor = Double.parseDouble(input);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número.");
                continue;
            }

            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "Valor negativo não é permitido!");
                continue;
            }

            if (valor == 0) {
                break; // encerra
            }

            totalVendas++;
            somaVendas += valor;

            if (valor > maiorVenda) {
                maiorVenda = valor;
            }
            if (valor < menorVenda) {
                menorVenda = valor;
            }
        }

        if (totalVendas == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma venda registrada.");
        } else {
            JOptionPane.showMessageDialog(
                null,
                "RESULTADOS:\n" +
                "Total de vendas: " + totalVendas + "\n" +
                "Soma total: R$ " + somaVendas + "\n" +
                "Maior venda: R$ " + maiorVenda + "\n" +
                "Menor venda: R$ " + menorVenda
            );
        }
    }
}
