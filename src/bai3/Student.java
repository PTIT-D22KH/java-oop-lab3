/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author P51
 */
public class Student implements Comparable<Student>{
    private String id, name, className, email, phoneNumber;

    public Student(String id, String name, String className, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNumber = "0" + phoneNumber;
    }
    @Override
    public int compareTo(Student other) {
        int cmpClassName = this.className.compareTo(other.className);
        if (cmpClassName == 0) {
            return this.id.compareTo(other.id);
        }
        return cmpClassName;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + className + " " + email + " " + phoneNumber;
    } 
}
