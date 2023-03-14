package vk.stateModel;

/**
 * 机器
 */
public class Machine {
    State noCoinsState;
    State hasCoinsState;
    State soldState;
    State soldOutState;
    State state = soldOutState;
    /**
     * 物品数量
     */
    int count = 0;

    /**
     * 初始化状态
     *
     * @param initialCounts
     */
    public Machine(int initialCounts) {
        noCoinsState = new NoCoinsState(this);
        hasCoinsState = new HasCoinsState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = initialCounts;
        if (initialCounts > 0) {
            state = noCoinsState;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }


    public void ejectCoin() {
        state.ejectCoin();
    }


    /**
     * 确认直接发放糖果  在机器内部是一个整体的工作
     */
    public void confirmOrder() {
        state.confirmOrder();
        state.dispense();
    }

    /**
     * 当前状态
     *
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 更改机器中的物品数量
     */
    public void releaseGoods(){
        System.out.println("\033[46m"+"googs is dispensing......!"+"\033[m");
        if(count>0){
            count=count-1;
        }
    }

    public State getNoCoinsState() {
        return noCoinsState;
    }

    public void setNoCoinsState(State noCoinsState) {
        this.noCoinsState = noCoinsState;
    }

    public State getHasCoinsState() {
        return hasCoinsState;
    }

    public void setHasCoinsState(State hasCoinsState) {
        this.hasCoinsState = hasCoinsState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
