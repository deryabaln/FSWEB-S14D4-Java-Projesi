package com.workintech.main;

import com.workintech.product.Bread;
import com.workintech.product.Chocolate;
import com.workintech.product.Coke;
import com.workintech.product.ProductForSale;

public class Store
{

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Sweet", 15, "Yazılımcı Dostu",  true);
        products[1] = new Bread("Bakery", 12, "Taze ekmek", 6);
        products[2] = new Coke("Drink", 14, "Soguk İçiniz", 7);
        listProducts(products);
        listProducts(null);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                }
            }
        }

    }
}