package vk.stateModel;

/**
 * 准备售出状态
 */
public class SoldState implements State {
    Machine machine;

    public SoldState(Machine machine) {
        this.machine = machine;
    }

    /**
     * 演示 暂不支持多量操作 简化模型
     */
    @Override
    public void insertCoin() {
        System.out.println("\033[31m"+"you have insertCoins"+"\033[m");
    }

    /**
     * 确认后已经无法退款了
     */
    @Override
    public void ejectCoin() {
        System.out.println("\033[31m"+"........."+"\033[m");
    }

    /**
     * 多次确认 只会做一次操作
     */
    @Override
    public void confirmOrder() {
        System.out.println("\033[31m"+"You confirm twice."+"\033[m");
    }

    /**
     * 发放物品
     */
    @Override
    public void dispense() {
        if(machine.getCount()>0){
//         大于0 有物品发放
            machine.setState(machine.getNoCoinsState());
        }else{
//           没有物品
            System.out.println("\033[46m"+"no goods!"+"\033[m");
            /**
             * 退钱
             */
            machine.getHasCoinsState().ejectCoin();
            machine.setState(machine.getSoldOutState());
        }
        if(machine.getCount()>0) {
            // 机器内还有货物       更新数量
            machine.releaseGoods();
        }
    }
}
