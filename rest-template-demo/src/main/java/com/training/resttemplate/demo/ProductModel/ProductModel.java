package com.training.resttemplate.demo.ProductModel;

public class ProductModel {
    private String name;
    private int ProductModel_ID;

    public ProductModel(String name, int productModel_ID) {
        this.setName(name);
        setProductModel_ID(productModel_ID);
    }

    public int getProductModel_ID() {
        return ProductModel_ID;
    }

    public void setProductModel_ID(int productModel_ID) {
        this.ProductModel_ID = productModel_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}