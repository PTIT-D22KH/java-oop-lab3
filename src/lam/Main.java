/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lam;

import java.util.*;
import java.io.*;
import java.text.ParseException;

/**
 *
 * @author P51
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc1=new Scanner(new File("src/file_storing/lam/BAITAP.in"));
        Scanner sc2=new Scanner(new File("src/file_storing/lam/BAOCAO.in"));
        ArrayList<SinhVien> sinhViens=new ArrayList<>();
        while(sc1.hasNextLine()){
            SinhVien tmp=new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
            sinhViens.add(tmp);
        }
        while(sc2.hasNextLine()){
            String svId=sc2.nextLine();
            String hourString=sc2.nextLine();
            for(int i=0;i<sinhViens.size();i++){
                if(sinhViens.get(i).getMsv().equals(svId)){
                    sinhViens.get(i).setTgian(hourString);
                    
                }
            }
        }
        for(SinhVien x:sinhViens){
            System.out.println(x);
        }
    }
}
