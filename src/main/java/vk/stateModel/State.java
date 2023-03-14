package vk.stateModel;

/**
 * 状态接口 定义行为
 */
public interface State {
    /**
     * 插入硬币
     */
    public void insertCoin();

    /**
     * 退回硬币
     */
    public void ejectCoin();

    /**
     * 确认购买
     */
    public void confirmOrder();

    /**
     * 出货
     */
    public void dispense();
}
