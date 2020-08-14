package com.demo.status;

/**
 * @author Liang
 */
public enum OrderEnum {

    /**
     * 已支付
     */
    orderPaid(OrderStatusEnum.orderToPaid, new BaseOrderPaid()),
    /**
     * 待发货
     */
    orderToHarvest(OrderStatusEnum.orderPaid, new BaseOrderToHarvest()),
    /**
     * 已发货
     */
    orderHarvest(OrderStatusEnum.orderToHarvest, new BaseOrderHarvest()),
    /**
     * 已发货
     */
    orderClose(OrderStatusEnum.orderHarvest, new BaseOrderClose()),
    /**
     * 错误
     */
    error(OrderStatusEnum.error, new BaseOrderError());


    OrderEnum(OrderStatusEnum statusEnum, BaseOrderStateEnum anEnum) {
        this.statusEnum = statusEnum;
        this.anEnum = anEnum;
    }

    OrderStatusEnum statusEnum;

    BaseOrderStateEnum anEnum;

    public OrderStatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(OrderStatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public BaseOrderStateEnum getAnEnum() {
        return anEnum;
    }

    public void setAnEnum(BaseOrderStateEnum anEnum) {
        this.anEnum = anEnum;
    }

    /**
     * 根据枚举状态获取实现方法
     *
     * @param statusEnum 订单状态
     * @return 实现方法
     */
    public static BaseOrderStateEnum getBaseOrderState(OrderStatusEnum statusEnum) {
        OrderEnum[] values = values();
        for (OrderEnum value : values) {
            if (value.getStatusEnum().equals(statusEnum)) {
                return value.getAnEnum();
            }
        }
        return OrderEnum.error.getAnEnum();
    }
}
