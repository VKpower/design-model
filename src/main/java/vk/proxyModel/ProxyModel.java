package vk.proxyModel;

import java.lang.reflect.Proxy;

/**
 * 代理模式  对权限的一种控制
 */
public class ProxyModel {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Personal personal = new PersonalChannel();
        personal.setChannelName("vk channel");
        personal.setPush(20);
        personal.setSubscribe(12);

        Personal ownerProxy = getOwnerProxy(personal);
        try {
            ownerProxy.setSubscribe(1);
        } catch (Exception e) {
            System.out.println("can't subscribe to yourself");
        }

        ownerProxy.setPush(ownerProxy.getPush() + 1);
        ownerProxy.setChannelName("vk channel one");
        System.out.println(String.format("ChannelName: %s, Subscribe: %d, Push: %d", ownerProxy.getChannelName(), ownerProxy.getSubscribe(), ownerProxy.getPush()));


        Personal otherProxy = getOtherProxy(personal);

        try {
            otherProxy.setChannelName("other channel");
        } catch (Exception e) {
            System.out.println("others can't change channel name");
        }

        otherProxy.setPush(otherProxy.getPush() + 1);
        otherProxy.setSubscribe(otherProxy.getSubscribe() + 1);
        System.out.println(String.format("ChannelName: %s, Subscribe: %d, Push: %d", ownerProxy.getChannelName(), ownerProxy.getSubscribe(), ownerProxy.getPush()));
    }


    private static Personal getOwnerProxy(Personal personal) {
        return (Personal) Proxy.newProxyInstance(personal.getClass().getClassLoader(),
                personal.getClass().getInterfaces(), new SelfChannelHandler(personal));

    }

    private static Personal getOtherProxy(Personal personal) {
        return (Personal) Proxy.newProxyInstance(personal.getClass().getClassLoader(),
                personal.getClass().getInterfaces(), new OtherChannelHandler(personal));

    }
}
