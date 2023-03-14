package vk.stateModel;

/**
 * 售罄状态
 */
public class SoldOutState implements State {
    Machine machine;

    public SoldOutState(Machine machine) {
        this.machine = machine;
    }

    /**
     * 不做任何操作
     */
    @Override
    public void insertCoin() {
        System.err.println("\033[31m"+"the machine is sold out!"+"\033[m");
    }

    @Override
    public void ejectCoin() {
        System.err.println("\033[31m"+"You haven't insert coins!"+"\033[m");
    }

    @Override
    public void confirmOrder() {
        System.err.println("\033[31m"+"There's no coins ,please insert coins first"+"\033[m");
    }

    @Override
    public void dispense() {
        System.err.println("\033[31m"+"the machine is sold out!"+"\033[m");
    }
}
