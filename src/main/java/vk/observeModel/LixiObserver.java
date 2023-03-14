package vk.observeModel;

import java.util.Date;

public class LixiObserver implements Observer {

    private Observeable observeable;
    /**
     * 订阅主题
     * @param observeable
     */
    public LixiObserver(Observeable observeable){
        this.observeable=observeable;
        observeable.registerObserver(this);
    }

    @Override
    public void update(Date time) {
        System.out.println("李四接到通知："+ time.toString());
    }
}
