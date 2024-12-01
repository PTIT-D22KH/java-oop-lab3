/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Worker implements Comparable<Worker>{
    private String id, name, workingTimeString;
    private Date inDate, outDate;
    private long workingTime;
    private boolean isEnough;
    private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    
    public Worker(String id, String name, String inString, String outString) throws ParseException{
        this.id = id;
        this.name = name;
        this.inDate = formatter.parse(inString);
        this.outDate = formatter.parse(outString);
        calWorkingTimeString();
    }
    private void calWorkingTimeString(){ 
        this.workingTime = outDate.getTime() - inDate.getTime() - 3600*1000;
        if (workingTime < 8 * 3600000) {
            isEnough = false;
        } else {
            isEnough = true;
        }
        long workingHours = workingTime / 3600000;
        long workingMinutes = (workingTime - workingHours * 3600000) / (60 * 1000);
        this.workingTimeString = String.format("%d gio %d phut", workingHours, workingMinutes);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + workingTimeString + " " + (isEnough ? "DU" : "THIEU");
    }
    @Override
    public int compareTo(Worker other) {
        if (this.workingTime == other.workingTime) {
            return this.id.compareTo(other.id);
        }
        return Long.compare(other.workingTime, this.workingTime);
    }
}
