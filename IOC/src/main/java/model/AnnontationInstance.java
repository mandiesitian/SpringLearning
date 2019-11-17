package model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AnnontationInstance {
    @Value("abc")  //设置默认值
    private String name;

    @Autowired
    @Qualifier(value = "dirtyAir")
//    @Resource(name = "ClearAir")
    private IAir air;

//    @Resource(name = "ClearAir")
    public void setAir(IAir air) {
        this.air = air;
    }

    public IAir getAir() {
        return air;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
        BeanFactory factory = context;

        AnnontationInstance instance = (AnnontationInstance) factory.getBean("annontationInstance");
        System.out.println(instance.name);

        System.out.println(instance.getAir());

    }

}
