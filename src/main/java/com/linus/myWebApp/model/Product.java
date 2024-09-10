package com.linus.myWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;

//    Why we are creating empty constructor
//    When Spring manages your beans (like Product in this case), it often creates bean instances using a no-argument constructor by default. This is required for Spring to be able to instantiate objects and later inject dependencies or set values via setters or reflection.
//    If you only have parameterized constructors and no default constructor, Spring won’t be able to create the bean unless you specify a way to pass those parameters.
    public Product(){

    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
