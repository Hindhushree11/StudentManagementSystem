import javax.swing.;
import java.sql.;

public class LoginPage extends JFrame {

JTextField user;  
JPasswordField pass;  

LoginPage() {  
    setTitle("Login");  
    setSize(300, 200);  
    setLayout(null);  

    user = new JTextField();  
    user.setBounds(100, 30, 150, 25);  
    add(user);  

    pass = new JPasswordField();  
    pass.setBounds(100, 70, 150, 25);  
    add(pass);  

    JButton btn = new JButton("Login");  
    btn.setBounds(100, 110, 100, 30);  
    add(btn);  

    btn.addActionListener(e -> login());  

    setVisible(true);  
}  

void login() {  
    if(user.getText().equals("admin") && new String(pass.getPassword()).equals("admin")) {  
        new Dashboard();  
        dispose();  
    } else {  
        JOptionPane.showMessageDialog(this, "Invalid");  
    }  
}  

public static void main(String[] args) {  
    new LoginPage();  
}

}
