package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "shoppingcart")
public class shoppingDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "productname")
    private String productname;
    @Column(name = "productid")
    private Integer productid;
    @Column(name = "sellerid")
    private Integer sellerid;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private Float price;


    public String getproductname() {
        return productname;
    }

    public void setproducttname(String productname) {
        this.productname = productname;
    }

    public Integer getproductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getsellerid() {
        return sellerid;
    }

    public void setsellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public Integer getquantity() {
        return quantity;
    }

    public void setquantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getprice() {
        return price;
    }

    public void setprice(Float price) {
        this.price = price;
    }

}
