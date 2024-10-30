package view;

import model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sales= new Sale();
        
        sales.addItem("Product A", 10.0, 2);
        sales.addItem("Product B", 15.0, 3);
        
        sales.printSale();
    }
}
