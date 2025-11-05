import javax.swing.JOptionPane;

public class usando {
    public static void main(String[] args) {
        
        double soma = 0; // variável para acumular as notas

        for (int i = 1; i <= 3; i++) {
            double nota = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota " + i + ":")
            );
            soma += nota; // soma as notas digitadas

        }

        double media = soma / 3;
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
    }
}