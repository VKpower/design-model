package vk.stateModel;

/**
 * 有硬币状态
 */
public class HasCoinsState implements State {
    Machine machine;

    public HasCoinsState(Machine machine) {
        this.machine = machine;
    }

    /**
     * 演示 暂不支持多量操作 简化模型
     */
    @Override
    public void insertCoin() {
        System.out.println("\033[31m"+"You can't insert another coins"+"\033[m");
    }

    /**
     * 有硬币状态 -> 无硬币状态
     */
    @Override
    public void ejectCoin() {
        System.out.println("\033[46m"+"coins returned"+"\033[m");
        machine.setState(machine.getNoCoinsState());
    }

    /**
     * 有硬币状态 -> 可售卖状态
     */
    @Override
    public void confirmOrder() {
        System.out.println("\033[46m"+"to dispense.."+"\033[m");
        machine.setState(machine.getSoldState());
    }

    /**
     * 此状态 请先确认
     */
    @Override
    public void dispense() {
        System.out.println("\033[31m"+"confirm first..."+"\033[m");
    }
}
