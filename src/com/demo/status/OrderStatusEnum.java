package com.demo.status;

/**
 * 订单状态
 *
 * @author LiangJiaMing
 * @since 2020年6月15日
 */
public enum OrderStatusEnum {

    /**
     * 待支付
     */
    orderToPaid("待支付", 0),
    /**
     * 已支付
     */
    orderPaid("已支付", 1),
    /**
     * 待发货
     */
    orderToHarvest("待发货", 2),
    /**
     * 已发货
     */
    orderHarvest("已发货", 5),
    /**
     * 已收货
     */
    orderComplete("已收货", 3),
    /**
     * 已关闭
     */
    orderClose("已关闭", 4),
    /**
     * 已关闭
     */
    error("错误", -1);

    private String status;

    private Integer value;

    OrderStatusEnum(String status, Integer value) {
        this.status = status;
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 根据应用名获取实现方法名
     *
     * @param value 订单状态
     * @return 订单状态枚举
     */
    public static OrderStatusEnum getOrderStatusEnum(Integer value) {
        OrderStatusEnum[] statusEnums = values();
        for (OrderStatusEnum statusEnum : statusEnums) {
            if (statusEnum.getValue().equals(value)) {
                return statusEnum;
            }
        }
        return OrderStatusEnum.error;
    }
}
