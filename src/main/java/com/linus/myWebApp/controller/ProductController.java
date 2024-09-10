package com.linus.myWebApp.controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.linus.myWebApp.model.Product;
import com.linus.myWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductbyId(@PathVariable int id) {
        return service.getProduct(id);
    }

    @PostMapping("/addproduct")
    public String addProduct(@RequestBody Product prod) {
        System.out.println(prod.toString());
        service.addProduct(prod);
        return "sucessful";
    }

    @PutMapping("/updateproduct")
    public String updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
        return "successful updated";
    }

    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
        return "successfully deleted";
    }
}