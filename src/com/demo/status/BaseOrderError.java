package com.demo.status;

/**
 * 假设该状态为订单错误
 */
public class BaseOrderError extends BaseOrderStateEnum {

    String message = "该订单未处于" + OrderStatusEnum.error.getStatus() + "状态";

}