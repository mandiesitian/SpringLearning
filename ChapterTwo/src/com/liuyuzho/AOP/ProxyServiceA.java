package com.liuyuzho.AOP;

/*
静态代理
 */
public class ProxyServiceA implements IService{  //1、实现相同的接口
    IService service;  //2、代理对象持有目标对象的引用
    public ProxyServiceA(IService service){
        super();
        this.service=service;
    }

    @Override
    public void service(String name) throws Exception {
        System.out.println("log strat：");

        try {
            service.service(name);
        }catch (Exception e){
            throw  e;
        }
        System.out.println("log end：");
    }

    public static void main(String[] args) throws Exception {
        IService service=new ServiceImplA();
        service=new ProxyServiceA(service); //创建代理对象
        service.service("123654");  //使用代理对象的方法


    }
}
