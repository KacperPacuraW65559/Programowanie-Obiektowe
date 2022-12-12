import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample extends JFrame {

    private javax.swing.JPanel JPanel1;
    private JButton okButton;
    private JTextField textField1;
    private JButton button1;

    public static void main(String[] args) {
        SwingExample Example1 = new SwingExample();
        Example1.setVisible(true);
    }

    public SwingExample() {
        super("Moje okno");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.pack();
        int width = 300, height = 300;
        this.setSize(width, height);

//        closeButton.addActionListener(new ActionListener() {
//            public void actionPerformed (ActionEvent e){
//                dispose();
//            }
//        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello");
            }
        });
    }
}
