package vk.strategyPattern;

/**
 * 赛车
 */
public class RacingCar extends Car{

    public RacingCar(){
//      默认整行移动
        moveWay=new NomarMove();
    }
    
    @Override
    public void display() {
        System.out.println("racingCar..");
    }
    public void test(){
        System.out.println("test");
    }
}
