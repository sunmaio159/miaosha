package com.miaoshaproject.miaosha.service.model;

import java.math.BigDecimal;

//用户下单的交易模型
public class OrderModel {
    //2019111200001  订单号
    private String id;

    //用户ID
    private Integer userId;

    //商品ID
    private Integer itemId;

    //商品单价
    private BigDecimal itemPrice;

    //购买数量
    private Integer amount;

    //购买金额
    private BigDecimal orderAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
}
