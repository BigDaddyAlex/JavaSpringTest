package com.training.resttemplate.demo.ProductModel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class ProductDao{
    private static List<ProductModel> products=new ArrayList<>();

    static {
        products.add(new ProductModel("Condoms",1));
        products.add(new ProductModel("Beds",2));
    }
    
    public List<ProductModel> listAll(){
        return products;
    }
}