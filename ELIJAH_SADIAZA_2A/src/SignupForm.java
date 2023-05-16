import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupForm extends JFrame implements ActionListener{
    
    private JLabel header,body;
    private JLabel name,username,password,Confirmpassword;
    private JTextField textFieldname;
    private JTextField textFieldusername;
    private JPasswordField passwordtextFieldpassword;
    private JPasswordField passwordFieldConfirmpassword;

    private JButton exit;
    private JButton buttonSignup;
    private JButton buttonback;

    public SignupForm(){
        
        setTitle("Sign up");
        setSize(350,500); 
        setLocationRelativeTo(null);
        setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


       //Title    
        header = new JLabel("Hi");
        header.setBounds(70, 30, 500, 100);
        header.setFont(new Font("Monospaced", Font.BOLD, 30));
        header.setForeground(new Color(8, 32, 50));

        
        //Body

        body = new JLabel("Create account now.");
        body.setBounds(70, 60, 500, 100);
        body.setFont(new Font("Monospaced", Font.PLAIN, 12));
        body.setForeground(new Color(8, 32, 50));

      

        

        name = new JLabel("Name");
        name.setFont(new Font("ARIAL", Font.PLAIN, 10));
        name.setBounds(80, 150, 280, 30);

        textFieldname = new JTextField(15); 
        textFieldname.setBounds(70, 150, 200, 30);
        textFieldname.setForeground(new Color(255, 76, 41));
        textFieldname.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        

        username = new JLabel("Username");
        username.setFont(new Font("ARIAL", Font.PLAIN, 10));
        username.setBounds(80, 200, 280, 30);
        

        textFieldusername = new JTextField(15); 
        textFieldusername.setBounds(70, 200, 200, 30);
        textFieldusername.setForeground(new Color(255, 76, 41));
        textFieldusername.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
       

        password = new JLabel("Password");
        password.setFont(new Font("ARIAL", Font.PLAIN, 10));
        password.setBounds(80, 250, 280, 30);

        passwordtextFieldpassword = new JPasswordField(15);
        passwordtextFieldpassword.setBounds(70, 250, 200, 30);
        passwordtextFieldpassword.setForeground(new Color(255, 76, 41));
        passwordtextFieldpassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        Confirmpassword = new JLabel("Confirm password");
        Confirmpassword.setFont(new Font("ARIAL", Font.PLAIN, 10));
        Confirmpassword.setBounds(80, 300, 280, 30);
        
        passwordFieldConfirmpassword  = new JPasswordField(15);
        passwordFieldConfirmpassword.setBounds(70, 300, 200, 30);
        passwordFieldConfirmpassword.setForeground(new Color(255, 76, 41));
        passwordFieldConfirmpassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));


        buttonSignup = new JButton("Sign up");
        buttonSignup.setBounds(70, 350, 200, 40);
        buttonSignup.setFont(new Font("ARIAL", Font.PLAIN, 12));
        buttonSignup.setForeground(Color.WHITE);
        buttonSignup.setBackground(new Color(255, 76, 41));
        buttonSignup.setBorder(BorderFactory.createEmptyBorder());
        buttonSignup.setBorder(null);

        buttonback = new JButton("Go back to Login");
        buttonback.setBounds(110, 400, 120, 30);
        buttonback.setFont(new Font("Monospaced", Font.BOLD, 10));
        buttonback.setForeground(Color.DARK_GRAY);
        buttonback.setBackground(new Color(238, 238, 238));
        buttonback.setBorder(BorderFactory.createEmptyBorder());
        buttonback.setBorder(null);

        exit = new JButton("o");
        exit.setBounds(170, 450, 15, 30);
        exit.setFont(new Font("ARIAL", Font.BOLD, 15));
        exit.setForeground(new Color(255, 16, 41));
        exit.setBackground(new Color(238, 238, 238));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBorder(null);




        Container container = getContentPane();
        container.setBackground(new Color(238, 238, 238));
        container.setLayout(null);

        container.add(body);
        container.add(header);
        container.add(name);
        container.add(textFieldname);
        container.add(username);
        container.add(textFieldusername);
        container.add(password);
        container.add(passwordtextFieldpassword);
        container.add(Confirmpassword);
        container.add(passwordFieldConfirmpassword);
        
        container.add(buttonSignup);
        container.add(buttonback);
        container.add(exit);

        buttonback.addActionListener(this);
        buttonSignup.addActionListener(this);
        exit.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String name = textFieldname.getText();
        String username = textFieldusername.getText();
        String password = new String(passwordtextFieldpassword.getPassword());
        String Confirmpassword = new String(passwordFieldConfirmpassword.getPassword());
       
        if(e.getSource().equals(exit)){

          
            dispose();

        }else if(e.getSource().equals(buttonback)){

            new LoginForm();    
            dispose();

        }else if (name.isEmpty() || username.isEmpty() || password.isEmpty() || Confirmpassword.isEmpty()) { 

            JOptionPane.showMessageDialog(this, "Please fill the following");
        
        }else if(password.equals(Confirmpassword)){
            
     
            JOptionPane.showMessageDialog(this,"Signup successful!");

            
        }else{
            JOptionPane.showMessageDialog(this,"Password doesn't match!");
        }


    }  


    public static void main(String[] args){
        new SignupForm();
    }
}
