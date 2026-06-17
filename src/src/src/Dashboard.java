import javax.swing.*;

public class Dashboard extends JFrame {

Dashboard() {  
    setTitle("Dashboard");  
    setSize(400, 300);  
    setLayout(null);  

    JButton add = new JButton("Add Student");  
    add.setBounds(100, 50, 200, 30);  
    add(add);  

    JButton view = new JButton("View Students");  
    view.setBounds(100, 120, 200, 30);  
    add(view);  

    add.addActionListener(e -> new AddStudent());  
    view.addActionListener(e -> new ViewStudent());  

    setVisible(true);  
}

}
