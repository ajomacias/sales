import javax.swing.JOptionPane;

public class SwingMessages {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Hola java",
                "Mi mensaje",
                JOptionPane.ERROR_MESSAGE);
        String msj = JOptionPane.showInputDialog(null,
                "ingrese texto",
                "entrada",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "el texto es" + msj,
                "ver",
                JOptionPane.PLAIN_MESSAGE);

    }

}
