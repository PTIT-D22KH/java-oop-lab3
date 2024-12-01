/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_lamlaikieukhac;

import java.util.Scanner;

/**
 *
 * @author P51
 */
import java.util.*;
import java.io.*;
public class Bai5 {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_storing/bai5_lamlaikieukhac/MONHOC.in"));
//        Scanner input2 = new Scanner(new File("src/file_storing/bai5_lamlaikieukhac/GIANGVIEN.in"));
//        Scanner input3 = new Scanner(new File("src/file_storing/bai5_lamlaikieukhac/GIOCHUAN.in"));
        Scanner input1 = new Scanner(new File("MONHOC.in"));
        Scanner input2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner input3 = new Scanner(new File("GIOCHUAN.in"));
        
        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            courses.add(new Course(input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            lecturers.add(new Lecturer(input2.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        
        for (int i = 0; i < p; i++) {
            String s = input3.nextLine().trim();
            String a[] = s.split("\\s+");
            String lecturerId = a[0];
            String courseId = a[1];
            Schedule schedule = null;
            Double standardTime = Double.parseDouble(a[2]);
            for (Course x : courses) {
                if (x.getCourseId().equals(courseId)) {
                    schedule = new Schedule(x, standardTime);
                    break;
                }
            }
            
            for (Lecturer x : lecturers) {
                if (x.getLecturerId().equals(lecturerId)) {
                    x.setSchedule(schedule);
                    break;
                }
                
            }
            
            
        }
        for (Lecturer x : lecturers) {
            x.calStandardTime();
            System.out.println(x);
        }
    }
}
