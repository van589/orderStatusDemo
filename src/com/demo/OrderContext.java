package com.demo;

class OrderContext {
    OrderState state = null;

    //新建订单设为已预定状态
    OrderContext() {
        this.state = new OrderedState();
    }

    public OrderContext(OrderState state) {
        this.state = state;
    }

    void setState(OrderState state) {
        this.state = state;
    }

    public void confirm() {
        state.confirm(this);
    }

    public void modify() {
        state.modify(this);
    }

    public void pay() {
        state.pay(this);
    }
}
