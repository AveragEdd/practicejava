import javax.swing.JOptionPane;

public class problema8 {
    public static void main(String[] args) {
      
        String input = JOptionPane.showInputDialog(null, "Ingrese un número binario de 5 dígitos:");

       
        if (input.length() != 5) {
            JOptionPane.showMessageDialog(null, "Error: El número debe tener exactamente 5 dígitos.");
            return;
        }

        // Verificar si el número es binario
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '0' && c != '1') {
                JOptionPane.showMessageDialog(null, "Error: El número debe ser binario .");
                return;
            }
        }

       
        int decimal = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '1') {
                decimal += Math.pow(2, input.length() - 1 - i);
            }
        }

        
        JOptionPane.showMessageDialog(null, "El número decimal es: " + decimal);
    }
}
