package IOC;

import model.Person;
import model.UserBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        //  通过反射得到配置信息
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});

        BeanFactory factory=context;
        /*  案例一
        //通过反射得到类信息
        Person person = (Person) factory.getBean("person");
        person.Breath();
         */

        // 案列二
        UserBean user= (UserBean) factory.getBean("user");
        user.destroy();
    }
}
