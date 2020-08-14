package com.demo.status;

public class BaseOrderClose extends BaseOrderStateEnum {


    @Override
    OrderEnumContext orderClose(OrderEnumContext statusEnum) {
        statusEnum.setAnEnum(OrderStatusEnum.orderHarvest);
        statusEnum.setMessage(null);
        return statusEnum;
    }
}
