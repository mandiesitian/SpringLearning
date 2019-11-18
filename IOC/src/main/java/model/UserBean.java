package model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value = "user")
public class UserBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Value("123")
    public void setBeanName(String s) {
        System.out.println(s);
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitalizingBean");
    }
}
