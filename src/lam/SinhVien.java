/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P51
 */
public class SinhVien {
    private String msv, ten, topic;
    private Date tgian;
    private final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    public SinhVien(String msv, String ten, String topic){
        //SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");
        this.msv = msv;
        this.ten = ten;
        this.topic = topic;
       // this.tgian = sdf.parse(tgian);
    }

    public Date getTgian() {
        return tgian;
    }

    @Override
    public String toString() {
        long x = 0;
        Date nowDate = null;
        try {
            nowDate = sdf.parse("00:00");
            x =tgian.getTime() - nowDate.getTime();
        } catch (ParseException ex) {
           
        }
        System.out.println(x);
        x/=1000;
        x/=60;
        long gio=x/60;
        long phut=x%60;
        System.out.println(x);
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm");
        return msv+" "+ten+" "+topic+" "+gio+":"+phut;
    }

    public String getMsv() {
        return msv;
    }

    public void setTgian(String tgia) throws ParseException {
        this.tgian = sdf.parse(tgia);
    }
    
    
    
    
}
