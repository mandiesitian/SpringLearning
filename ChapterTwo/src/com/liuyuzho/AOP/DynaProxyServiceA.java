package com.liuyuzho.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyServiceA implements InvocationHandler {
    private Object target;  //目标对象

    //创建绑定  返回一个代理对象
    public Object bind(Object object) {
        this.target = object;
        //生成代理对象
        Object obj = Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(), this);
        return obj;
    }

    @Override  //InvocatonHandler 自带方法 proxy  method自动获得
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("method:" + method);
        System.out.println("args:" + args);
        System.out.println("target:" + this.target);
        System.out.println("log start");
        try {
            result = method.invoke(this.target, args);  //执行目标对象的方法
        } catch (Exception e) {
            throw e;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        //创建代理对象
        IService service= (IService) new DynaProxyServiceA().bind(new ServiceImplA());
        service.service("125");

    }
}
