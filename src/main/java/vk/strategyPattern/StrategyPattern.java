package vk.strategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Car racingCar = new RacingCar();
        racingCar.performove();
        racingCar.setMoveWay(new FastMove());
        racingCar.performove();
    }
}
