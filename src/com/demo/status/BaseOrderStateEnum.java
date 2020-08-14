package com.demo.status;

public abstract class BaseOrderStateEnum {

    OrderEnumContext orderPaid(OrderEnumContext statusEnum) {
        statusEnum.setMessage("'" + statusEnum.anEnum.getStatus() + "‘状态不支持‘支付’");
        return statusEnum;
    }

    OrderEnumContext orderToHarvest(OrderEnumContext statusEnum) {
        throw new UnsupportedOperationException();
    }


    OrderEnumContext orderHarvest(OrderEnumContext statusEnum) {
        throw new UnsupportedOperationException();
    }


    OrderEnumContext orderClose(OrderEnumContext statusEnum) {
        throw new UnsupportedOperationException();
    }


}