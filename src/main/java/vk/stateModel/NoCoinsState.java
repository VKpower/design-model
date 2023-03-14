package vk.stateModel;

/**
 * 没有硬币状态
 */
public class NoCoinsState implements State {

    Machine machine;

    public NoCoinsState(Machine machine) {
        this.machine = machine;
    }

    /**
     *  没有硬币状态 -> 有硬币状态
     *
     */
    @Override
    public void insertCoin() {
        System.out.println("\033[46m"+"you insert coins"+"\033[m");
        machine.setState(machine.getHasCoinsState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("\033[31m"+" You haven't insert coins!"+"\033[m");
    }

    @Override
    public void confirmOrder() {
        System.out.println ("\033[31m"+"There's no coins ,please insert coins first"+"\033[m");
    }

    @Override
    public void dispense() {
        System.out.println("\033[31m"+"You need to pay first"+"\033[m");
    }
}
