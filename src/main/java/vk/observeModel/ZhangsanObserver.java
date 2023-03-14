package vk.observeModel;


import java.util.Date;

public class ZhangsanObserver implements Observer{

    private Observeable observeable;
    /**
     * 订阅主题
     * @param observeable
     */
    public ZhangsanObserver(Observeable observeable){
        this.observeable=observeable;
        observeable.registerObserver(this);
    }
    @Override
    public void update(Date time) {
        System.out.println("张三接到通知："+ time.toString());
    }
}
