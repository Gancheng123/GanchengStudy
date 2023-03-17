package com.example.demoxx.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("order")
public class Order {
    public int id;
    public String ordertime;
    public String total;
    public String uid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime='" + ordertime + '\'' +
                ", total='" + total + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
