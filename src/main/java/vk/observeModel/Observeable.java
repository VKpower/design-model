package vk.observeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象
 *
 */
public interface Observeable {



    public void registerObserver(Observer observer);

    public void notifyObserver();

    public void removeObserver(Observer observer);



}
