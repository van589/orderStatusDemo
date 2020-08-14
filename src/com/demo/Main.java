package com.demo;

import com.demo.status.OrderEnumContext;
import com.demo.status.OrderStatusEnum;

/**
 * @author Liang
 */
public class Main {

    public static void main(String[] args) {
        Integer value = OrderStatusEnum.orderPaid.getValue();

        OrderEnumContext orderEnumContext = new OrderEnumContext(value);
        System.out.println(orderEnumContext.orderPaid().getMessage() + "  " + orderEnumContext.getAnEnum().getStatus());
//        System.out.println(orderEnumContext.orderToHarvest().getMessage() + "  " + orderEnumContext.getAnEnum().getStatus());
//        System.out.println(orderEnumContext.orderHarvest().getMessage() + "  " + orderEnumContext.getAnEnum().getStatus());
//        System.out.println(orderEnumContext.orderClose().getMessage() + "  " + orderEnumContext.getAnEnum().getStatus());
    }
}
