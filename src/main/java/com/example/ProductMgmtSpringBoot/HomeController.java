package com.example.ProductMgmtSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public List<Product> getProduct(@PathVariable String name){
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product p){
        service.saveProduct(p);
    }

    @PostMapping("/delproduct")
    public void delProduct(@RequestBody Product p){
        service.remProduct(p);
    }

     @PostMapping("/delproductbyid")
     public void delProductById(@RequestBody int id){
        service.remProductById(id);
     }


}
