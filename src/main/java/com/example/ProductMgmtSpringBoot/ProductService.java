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

    public List<Product> getProduct(String name){
        return db.findByName(name);
    }

    public void saveProduct(Product p){
        db.save(p);
    }

    public void remProduct(Product p){
        db.delete(p);
    }

    public void remProductById(int id){

        db.deleteById(id);
    }


}
