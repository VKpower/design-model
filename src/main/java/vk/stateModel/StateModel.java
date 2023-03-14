package vk.stateModel;

/**
 * 状态模式：去除if else 并且抽离逻辑到每个状态自身中去控制。
 * 解耦 。
 * 消除了逻辑混淆在一起 不利于后期维护
 * 以及状态与逻辑无法对应，混杂在一起。
 *
 * 售卖机 案例
 */
public class StateModel {
    public static void main(String[] args) {
        Machine machine = new Machine(1);
        System.out.println(machine);

        machine.insertCoin();
        machine.confirmOrder();
        System.out.println(machine);

        machine.ejectCoin();
        System.out.println(machine+"ejectCoins");

        machine.confirmOrder();
        System.out.println(machine+"confirm .....");

        machine.insertCoin();
        machine.ejectCoin();
        System.out.println(machine);
        machine.ejectCoin();
        machine.insertCoin();
        machine.confirmOrder();
        System.out.println(machine);

        machine.insertCoin();

    }
}
