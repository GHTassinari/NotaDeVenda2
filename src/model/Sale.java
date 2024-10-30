package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SaleItem> saleItems;

    public Sale() {
        this.saleItems = new ArrayList<>();
    }

    public void addItem(String productName, Double productPrice, int quantity) {
        Product product = new Product(productName, productPrice);
        SaleItem saleItem = new SaleItem(product, quantity);
        saleItems.add(saleItem);
    }
    
    public Double calculateTotal() {
        Double total = 0.0;
        for (SaleItem item : saleItems) {
            total += item.calculateTotal();
        }
        return total;
    }

    public void printSale() {
        for (SaleItem item : saleItems) {
            Product product = item.getProduct();
            System.out.println("-----------------------------------");
            System.out.printf("Product: %s\n", product.getName());
            System.out.printf("Price: %.2f\n", product.getPrice());
            System.out.printf("Quantity: %d\n", item.getQuantity());
            System.out.printf("Total Price: %.2f\n", item.calculateTotal());
            System.out.println("-----------------------------------");
        }
        System.out.printf("Total Sale Price: %.2f\n", calculateTotal());
    }
    
    public List<SaleItem> getSaleItems() {
        return saleItems;
    }
}
