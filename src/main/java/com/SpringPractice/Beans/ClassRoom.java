package com.SpringPractice.Beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ClassRoom {
    private String name;
    private int roll_No;
    private List<String> Student_names;
    private Map<String,Integer> marks;
    private Set<String> subject;
    private Properties properties;
    public ClassRoom() {
        super();
        System.out.println("Hello From ClassRoom Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public List<String> getStudent_names() {
        return Student_names;
    }

    public void setStudent_names(List<String> student_names) {
        Student_names = student_names;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public Set<String> getSubject() {
        return subject;
    }

    public void setSubject(Set<String> subject) {
        this.subject = subject;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", roll_No=" + roll_No +
                ", Student_names=" + Student_names +
                ", marks=" + marks +
                ", subject=" + subject +
                ", properties=" + properties +
                '}';
    }
}
