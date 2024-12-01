/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author P51
 */
public class Product {
    private String productId, productName;
    private int buyPrice, warrantyMonths;

    public Product(String productId, String productName, int buyPrice, int warrantyMonths) {
        this.productId = productId;
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.warrantyMonths = warrantyMonths;
    }

    public String getProductId() {
        return productId;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
    
    
    @Override
    public String toString(){
        return productId;
    }
}
