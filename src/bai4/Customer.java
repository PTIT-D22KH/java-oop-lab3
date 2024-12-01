/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Customer implements Comparable<Customer>{
    private String customerId, customerName, address;
    private Product product;
    private int numBuy;
    private Date buyDate, warrantyExpiredDate;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Customer(String customerId, String customerName, String address, Product product, int numBuy, String buyDateString) throws ParseException{
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.product = product;
        this.numBuy = numBuy;
        this.buyDate = dateFormat.parse(buyDateString);
        calWarrantyExpiredDate(buyDateString);
    }
    @Override
    public int compareTo(Customer other) {
        int cmpWarrantyDate = this.warrantyExpiredDate.compareTo(other.warrantyExpiredDate);
        if (cmpWarrantyDate == 0) {
            return this.customerId.compareTo(other.customerId);
        }
        return cmpWarrantyDate;
    }
    private void calWarrantyExpiredDate(String buyDateString) throws ParseException{
        String a[] = buyDateString.trim().split("/");
        int month = Integer.parseInt(a[1]);
        int year = Integer.parseInt(a[2]);
        int newMonth = (month + product.getWarrantyMonths());
        int warrantyMonth = newMonth % 12;
        year += newMonth / 12;
        String newWarrantyString = String.format("%s/%02d/%04d", a[0], warrantyMonth, year);
        this.warrantyExpiredDate = dateFormat.parse(newWarrantyString);
        
    }
    @Override
    public String toString() {
        return customerId + " " + customerName + " " + address + " " + product + " "  + numBuy * product.getBuyPrice() + " " + dateFormat.format(warrantyExpiredDate);
    }
    
}
