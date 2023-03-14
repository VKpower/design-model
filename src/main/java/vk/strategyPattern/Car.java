package vk.strategyPattern;

/**
 * 汽车
 */
public abstract class Car {

     MoveWay moveWay;

    public void performove(){
        moveWay.move();
    }

    public abstract void display();

    public void setMoveWay(MoveWay moveWay){
        this.moveWay=moveWay;
    }
}
