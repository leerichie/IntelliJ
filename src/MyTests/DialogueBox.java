package MyTests;

import javax.swing.JOptionPane;

public class DialogueBox {
    public static void main(String[] args) {
        String name;
        String surname;
        name = JOptionPane.showInputDialog("Enter name: ");
        surname = JOptionPane.showInputDialog("Enter surname: ");
        JOptionPane.showMessageDialog(null,
                "Hello, " + name + " " + surname);
        System.exit(0);

    }
}
