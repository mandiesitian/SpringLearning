package model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component(value = "userlive")
public class UserBeanLive implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean,
        ApplicationContextAware, BeanPostProcessor {

    //先调用构造方法
    public UserBeanLive() {
        System.out.println("第一个调用UserBeanLive构造方法");
    }

    //设置对象属性
    private String name;

    @Value("userset")  //注入默认值
    public void setName(String name) {
        this.name = name;
    }

    //调用BeanNameAware
    public void setBeanName(String s) {
        System.out.println("BeanNameAware方法被调用:" + s);
    }

    //调用BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware方法被调用:" + beanFactory);

    }

    //调用ApplicationContextAware
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware方法被调用:" + applicationContext);
    }

    //  BeanPostProcessor 接口 两个方法
    //方法一 初始化前调用
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor-->postProcessBeforeInitialization被调用");
        return bean;
    }

    //初始化 InitializingBean  两个方法同一个效果
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean被调用");
    }

        @PostConstruct
    public void myInit() {
        System.out.println("myInit被调用");
    }

    //  BeanPostProcessor 接口 两个方法
    //方法二 初始化后调用
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor-->postProcessAfterInitialization被调用");
        return bean;
    }

    //销毁
    public void destroy() throws Exception {
        System.out.println("DisposableBean被调用");
    }

    public void myDestory() {
        System.out.println("myDestory方法被调用");
    }


}
