package vk.observeModel;

import java.util.Date;

/**
 * 观察者 模式  让观察者自己订阅各主题。每个主题发生改变，则通知自己的订阅者
 */
public class ObserveModel {
    public static void main(String[] args) throws InterruptedException {
        StudySubject studySubject = new StudySubject();
        /**
         * 订阅主题
         */
        LixiObserver lixiObserver = new LixiObserver(studySubject);
//      主题发生改变
        studySubject.setTime(new Date());
        Thread.sleep(1000);
        ZhangsanObserver zhangsanObserver = new ZhangsanObserver(studySubject);
        studySubject.setTime(new Date());


    }
}
