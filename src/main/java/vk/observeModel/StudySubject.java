package vk.observeModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 学习通知主题
 */
public class StudySubject implements Observeable{
    private List<Observer> list= new ArrayList<>();
    private Date time;
    @Override
    public void registerObserver(Observer observer) {
            list.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(time);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = list.indexOf(observer);
        if(i>0){
            list.remove(i);
        }
    }

    public void changeHappen(){
        notifyObserver();
    }

    public void setTime(Date time){
        this.time=time;
        changeHappen();
    }

}
