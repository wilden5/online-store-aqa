package com.denis.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {
    public String name;
    private List<Product> productList;

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        List<String> printCategory = new ArrayList<>();
        for (Product product : productList) {
            printCategory.add(product.toString());
        }
        return this.name + " for sale: \n " + String.join(", ", printCategory) + "\n ";
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
