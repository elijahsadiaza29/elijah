import javax.swing.*;
import java.awt.*;

public class splashform extends JWindow {
    
    public splashform(){

        JLabel label = new JLabel(new ImageIcon("BRAND.png"));
        getContentPane().add(label, BorderLayout.CENTER);
        ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("BRAND.png").getImage().getScaledInstance(350, 500, Image.SCALE_DEFAULT)); 
        label.setIcon(imageIcon1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        try{

            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        dispose();
    
    }

    public static void main(String[] args) {
        new splashform();
        new LoginForm();
    }
}
