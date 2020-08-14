package com.demo.status;

/**
 * 假设该状态为已支付阶段
 */
public class BaseOrderPaid extends BaseOrderStateEnum {

    private String message = "该订单未处于" + OrderStatusEnum.orderToPaid.getStatus() + "状态";

    @Override
    OrderEnumContext orderPaid(OrderEnumContext statusEnum) {
        String result = OrderStatusEnum.orderToPaid.equals(statusEnum.anEnum) ? null : message;
        statusEnum.setAnEnum(OrderStatusEnum.orderPaid);
        statusEnum.setBaseOrderStateEnum(OrderEnum.getBaseOrderState(OrderStatusEnum.orderPaid));
        statusEnum.setMessage(result);
        return statusEnum;
    }

}