/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_02;

/**
 *
 * @author imal
 */
public class ProductBill {
    private final String priceText;
    private final String quantityText;

    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    public double calculateTotal() {
        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);
        return price * quantity;
    }
}