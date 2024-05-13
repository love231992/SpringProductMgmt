package com.example.ProductMgmtSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ProductService {

    @Autowired
    ProductDB db;

    public List<Product> getAllProducts(){
       return db.findAll();
    }

    public void addProduct(Product p){
        db.save(p);
        System.out.println("Product added in db");
    }


}
