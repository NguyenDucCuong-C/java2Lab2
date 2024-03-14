/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String name;
    private double marks;
    private String course;
    

    public Student(String name, double marks, String course) {
        this.name = name;
        this.marks = marks;
        this.course = course;
        
    }

    public Student() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    
    
    public String getGrade(){
        if (this.marks < 3) {
            return "kem";
        }
        if (this.marks < 5) {
            return "Yeu";
        }
        if (this.marks < 6.5) {
            return "Trung binh";
        }
        if (this.marks < 7.5) {
            return "Kha";
        }
        if (this.marks < 9) {
            return "Gioi";
        }
        return "Xuat sac";
    }
    
    
    public boolean getisBonus(){
        return this.marks >= 7.5;
    }
    
}
