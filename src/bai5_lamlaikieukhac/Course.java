/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_lamlaikieukhac;

/**
 *
 * @author P51
 */
public class Course {
    private String courseId, courseName;
    public Course(String input) {
        String a[] = input.trim().split("\\s+");
        this.courseId = a[0];
        StringBuilder courseNameBuilder = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            courseNameBuilder.append(a[i]).append(" ");
        }
        this.courseName = courseNameBuilder.toString().trim();
    }

    public String getCourseId() {
        return courseId;
    }
    
}
