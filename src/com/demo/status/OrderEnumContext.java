package com.demo.status;


public class OrderEnumContext {
    OrderStatusEnum anEnum;
    BaseOrderStateEnum baseOrderStateEnum;
    Integer stateValue;
    String message;

    public OrderEnumContext(Integer order) {
        this.stateValue = order;
        this.anEnum = OrderStatusEnum.getOrderStatusEnum(order);
        this.baseOrderStateEnum = OrderEnum.getBaseOrderState(anEnum);
    }

    public OrderStatusEnum getAnEnum() {
        return anEnum;
    }

    public void setAnEnum(OrderStatusEnum anEnum) {
        this.anEnum = anEnum;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BaseOrderStateEnum getBaseOrderStateEnum() {
        return baseOrderStateEnum;
    }

    public void setBaseOrderStateEnum(BaseOrderStateEnum baseOrderStateEnum) {
        this.baseOrderStateEnum = baseOrderStateEnum;
    }

    public OrderEnumContext orderPaid() {
        return baseOrderStateEnum.orderPaid(this);
    }

    public OrderEnumContext orderToHarvest() {
        return baseOrderStateEnum.orderToHarvest(this);
    }

    public OrderEnumContext orderHarvest() {
        return baseOrderStateEnum.orderHarvest(this);
    }

    public OrderEnumContext orderClose() {
        return baseOrderStateEnum.orderClose(this);
    }

}
