package vk.singleton;

/**|
 * 饿汉式 单例
 */
public class Singleton {

    private final static Singleton singleton= new Singleton();
    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }




}
