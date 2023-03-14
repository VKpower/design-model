package vk.proxyModel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OtherChannelHandler implements InvocationHandler {
    Personal personal;

    public OtherChannelHandler(Personal personal) {
        this.personal = personal;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        其他人无法修改频道名称
        if (method.getName().equals("setChannelName")) {
            throw new IllegalAccessException();
        } else if (method.getName().startsWith("get")) {
          return   method.invoke(personal, args);
        } else if (method.getName().startsWith("set")) {
           return method.invoke(personal, args);
        }
//      调用其他方法都不执行
        return null;
    }
}
