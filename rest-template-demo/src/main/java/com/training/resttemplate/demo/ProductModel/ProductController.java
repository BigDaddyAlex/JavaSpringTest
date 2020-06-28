package com.training.resttemplate.demo.ProductModel;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductDao productdao;

    @GetMapping("/hey")
    public List<ProductModel> findAll(){
        return productdao.listAll();
    }
}