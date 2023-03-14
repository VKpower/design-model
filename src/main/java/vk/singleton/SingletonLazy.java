package vk.singleton;

/**
 * 懒汉式 单例
 */
public class SingletonLazy {

    private static volatile SingletonLazy singletonLazy;

    private SingletonLazy(){}

    public static SingletonLazy getSingletonLazy(){
        if(singletonLazy==null) {
//            外层高效判断 但也带来问题 给属性加上volatile 防止赋值指令重排 先赋值给 singletonLazy 导致获得一个
//            未完全实例化的对象
            synchronized (SingletonLazy.class) {
                if (singletonLazy == null) {
//                  把 对象赋值给 singletonLazy 和 初始化对象赋值 是两个操作 不是原子性
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
