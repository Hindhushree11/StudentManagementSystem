package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.student.dto.StudentDTO;
import com.student.util.DBConnection;

public class StudentDAOImpl implements StudentDAO {

    public boolean addStudent(StudentDTO student) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO students VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setDouble(3, student.getMarks());
            ps.setString(4, student.getCourse());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
