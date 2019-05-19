package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "shipping")

public class shippingDTO
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "sid")
    private Integer shipid;
    @Column(name = "itemname")
    private String name;
    @Column(name = "quantity")
    private Integer qty;
    @Column(name = "paymethod")
    private String paymentmethod;
    @Column(name = "address")
    private String addr;


    public Integer getShipId() { return shipid; }

    public void setShipId(Integer shipid) { this.shipid = shipid; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getPaymentMethod() {
        return paymentmethod;
    }

    public void setPaymentMethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}
