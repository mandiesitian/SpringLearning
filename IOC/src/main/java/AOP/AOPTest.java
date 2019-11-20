package AOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"ApplicationContextThree.xml"});
        BeanFactory factory=context;
        IAOPServices services= (IAOPServices) factory.getBean("aopService");
        services.withAopMethod();
        services.wihtNoAopMethod();
    }
}
