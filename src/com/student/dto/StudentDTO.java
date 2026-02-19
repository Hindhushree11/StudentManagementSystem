package com.student.dto;

public class StudentDTO {

    private int id;
    private String name;
    private double marks;
    private String course;

    public StudentDTO(int id, String name, double marks, String course) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }
    public String getCourse() { return course; }
}
