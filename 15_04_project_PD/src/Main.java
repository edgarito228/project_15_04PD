import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    private JPanel rootPanel;
    private JComboBox <String> titleComboBox;
    private JButton clickMeButton;

    private void createUIComponents() {
        titleComboBox = new JComboBox<>();
        titleComboBox.addItem("Margarita");
        titleComboBox.addItem("Vegetarian");
        titleComboBox.addItem("Hawaii");
        titleComboBox.addItem("California");
        titleComboBox.addItem("American");
        titleComboBox.addItem("Custom");
        String selectedItem = (String) titleComboBox.getSelectedItem();
    }

    public Main() {
        setContentPane(rootPanel);
        setTitle("Los Pollos Hermanos Pizzeria!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setLocationRelativeTo(null);
        setVisible(true);
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
        );
    }

    public static void main(String[] args) {
        new Main();
        Pizza.pizzeria();
    }
}