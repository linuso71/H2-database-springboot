package com.linus.myWebApp.service;

import com.linus.myWebApp.model.Product;
import com.linus.myWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"Iphone",50000), new Product(2,"Ipad",800000)));
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public void addProduct(Product prod){
        System.out.println(prod.toString());
        repo.save(prod);
    }

    public Product getProduct(int id){
//        for (int i=0;i<products.size();i++){
//            if (products.get(i).getProdId() == id){
//                return products.get(i);
//            }
//        }
//        return new Product(-1,"null",0);
        return repo.findById(id).orElse(new Product());
    }

    public void updateProduct(Product prod){
//        int index = 0;
//        for (int i=0;i<products.size();i++){
//            if (products.get(i).getProdId() == prod.getProdId()){
//                index = i;
//                break;
//            }
//
//        }
//        products.set(index,prod);
        repo.save(prod);
    }

    public void deleteProduct(int id){
//        int index = 0;
//        for (int i=0;i<products.size();i++){
//            if (products.get(i).getProdId() == id){
//                index = i;
//                break;
//            }
//        }
//        products.remove(index);
    repo.deleteById(id);
    }

}
