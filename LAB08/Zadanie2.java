import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 {
    private JRadioButton poniedzialekRadioButton;
    private JPanel panel1;
    private JRadioButton wtorekRadioButton;
    private JCheckBox javaCheckBox;
    private JCheckBox cCheckBox;
    private JButton okButton;

    public Zadanie2() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectOption;
                if(poniedzialekRadioButton.isSelected()) selectOption = "Poniedziałek";
                if(wtorekRadioButton.isSelected()) selectOption = "Wtorek";

                JOptionPane.showMessageDialog(Zadanie2.this,"Wybrano :"+selectOption);

                
            }
        });
    }
}
