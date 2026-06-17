import javax.swing.;
import java.sql.;

public class AddStudent extends JFrame {

JTextField name, age, course;  

AddStudent() {  
    setTitle("Add Student");  
    setSize(300, 250);  
    setLayout(null);  

    name = new JTextField();  
    name.setBounds(100, 20, 150, 25);  
    add(name);  

    age = new JTextField();  
    age.setBounds(100, 60, 150, 25);  
    add(age);  

    course = new JTextField();  
    course.setBounds(100, 100, 150, 25);  
    add(course);  

    JButton btn = new JButton("Add");  
    btn.setBounds(100, 150, 100, 30);  
    add(btn);  

    btn.addActionListener(e -> addStudent());  

    setVisible(true);  
}  

void addStudent() {  
    try {  
        Connection con = DBConnection.getConnection();  
        PreparedStatement pst = con.prepareStatement(  
            "INSERT INTO students(name,age,course) VALUES(?,?,?)"  
        );  

        pst.setString(1, name.getText());  
        pst.setInt(2, Integer.parseInt(age.getText()));  
        pst.setString(3, course.getText());  

        pst.executeUpdate();  

        JOptionPane.showMessageDialog(this, "Added!");  
    } catch (Exception e) {  
        e.printStackTrace();  
    }  
}

}
