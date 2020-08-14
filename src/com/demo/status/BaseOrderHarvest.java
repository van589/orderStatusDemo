package com.demo.status;

/**
 * 假设该状态为已发货阶段
 */
public class BaseOrderHarvest extends BaseOrderStateEnum {

    private String message = "该订单未处于" + OrderStatusEnum.orderHarvest.getStatus() + "状态";

    @Override
    OrderEnumContext orderHarvest(OrderEnumContext statusEnum) {
        String result = OrderStatusEnum.orderToHarvest.equals(statusEnum.anEnum) ? null : message;
        statusEnum.setAnEnum(OrderStatusEnum.orderHarvest);
        statusEnum.setMessage(result);
        return statusEnum;
    }

}
