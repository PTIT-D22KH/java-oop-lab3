/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_lamlaikieukhac;

/**
 *
 * @author P51
 */
public class Schedule {
    private Course course;
    private double standardTime;

    public Schedule(Course course, double standardTime) {
        this.course = course;
        this.standardTime = standardTime;
    }

    public double getStandardTime() {
        return standardTime;
    }
    
    
}
