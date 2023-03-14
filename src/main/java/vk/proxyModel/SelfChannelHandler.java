package vk.proxyModel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SelfChannelHandler implements InvocationHandler {

    Personal personal;

    public SelfChannelHandler(Personal personal) {
        this.personal = personal;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//       自己不能订阅自己
        if (method.getName().equals("setSubscribe")) {
            throw new IllegalAccessException();
        } else if (method.getName().startsWith("get")) {
           return method.invoke(personal, args);
        } else if (method.getName().startsWith("set")) {
          return   method.invoke(personal, args);
        }
        return null;
    }
}
