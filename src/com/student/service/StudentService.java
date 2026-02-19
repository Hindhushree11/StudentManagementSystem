package com.student.service;

import com.student.dao.*;
import com.student.dto.StudentDTO;

public class StudentService {

    StudentDAO dao = new StudentDAOImpl();

    public boolean registerStudent(StudentDTO student) {
        return dao.addStudent(student);
    }
}
