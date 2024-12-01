/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_lamlaikieukhac;

import java.util.ArrayList;



/**
 *
 * @author P51
 */
public class Lecturer {
    private String lecturerId, lecturerName;
    private double standardTime;
    private ArrayList<Schedule> schedules;
    public Lecturer(String input) {
        String a[] = input.trim().split("\\s+");
        this.lecturerId = a[0];
        StringBuilder lecturerNameBuilder = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            lecturerNameBuilder.append(a[i]).append(" ");
        }
        this.lecturerName = lecturerNameBuilder.toString().trim();
        this.standardTime = 0;
        this.schedules = new ArrayList<>();
    }
    public void setSchedule(Schedule schedule) {
        schedules.add(schedule);
    }
    public String getLecturerId() {
        return lecturerId;
    }
    public void calStandardTime() {
        for (Schedule x : schedules) {
            this.standardTime += x.getStandardTime();
        }
    }
    @Override
    public String toString() {
        return lecturerName + " " + String.format("%.2f", standardTime);
    }
    
}
