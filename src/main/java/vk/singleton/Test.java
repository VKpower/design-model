package vk.singleton;

public class Test {
    public static void main(String[] args) {
       /* Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1==singleton);*/
        SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy);
        SingletonLazy singletonLazy1 = SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy1==singletonLazy);
    }
}
