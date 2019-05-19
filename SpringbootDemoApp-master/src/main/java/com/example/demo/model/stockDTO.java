package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "stock")
public class stockDTO {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "pid")
    private Integer id;
    @Column(name = "pname")
    private String productName;
    @Column(name = "unitPrice")
    private Float unitPrice;
    @Column(name = "qty")
    private Integer quantity;
    @Column(name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) { this.productName = productName; }

    public Float getUnitprice() {
        return unitPrice;
    }

    public void setUnitprice(Float unitPrice) { this.unitPrice = unitPrice; }

    public Integer getQuantity() { return quantity; }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }





}
