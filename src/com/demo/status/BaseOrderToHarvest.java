package com.demo.status;


/**
 * 假设该状态为待发货阶段
 */
public class BaseOrderToHarvest extends BaseOrderStateEnum {

    private String message = "该订单未处于" + OrderStatusEnum.orderToHarvest.getStatus() + "状态";

    @Override
    OrderEnumContext orderToHarvest(OrderEnumContext statusEnum) {
        String result = OrderStatusEnum.orderPaid.equals(statusEnum.anEnum) ? null : message;
        statusEnum.setAnEnum(OrderStatusEnum.orderToHarvest);
        statusEnum.setMessage(result);
        return statusEnum;
    }
}

