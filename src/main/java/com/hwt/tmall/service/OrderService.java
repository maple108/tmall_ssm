


package com.hwt.tmall.service;

import java.util.List;

import com.hwt.tmall.pojo.Order;
import com.hwt.tmall.pojo.OrderItem;

public interface OrderService {

    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);
    float add(Order c,List<OrderItem> ois);
    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();
    List list(int uid, String excludedStatus);
}


