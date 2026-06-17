import javax.swing.;
import java.sql.;

public class ViewStudent extends JFrame {

JTextArea area;  

ViewStudent() {  
    setTitle("Students");  
    setSize(400, 300);  

    area = new JTextArea();  
    add(new JScrollPane(area));  

    try {  
        Connection con = DBConnection.getConnection();  
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");  

        while(rs.next()) {  
            area.append(  
                rs.getInt(1) + " " +  
                rs.getString(2) + " " +  
                rs.getInt(3) + " " +  
                rs.getString(4) + "\n"  
            );  
        }  
    } catch (Exception e) {  
        e.printStackTrace();  
    }  

    setVisible(true);  

}
}

}
