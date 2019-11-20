package AOP;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/*
拦截器方法
 */
public class AOPInterceptor implements AfterReturningAdvice, MethodBeforeAdvice, ThrowsAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("方法："+method.getName()+"运行结束，返回值为："+o);
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行MethodBeforeAdvice,即将执行的方法："+method.getName());
        if(o instanceof AOPServicesImpl){
            String desceiption =((AOPServicesImpl) o).getDescription();

            if(desceiption==null){
                throw new  NullPointerException("decription 属性不能为空");
            }
        }
    }

    public void afterThrowing(Exception ex){
        System.out.println("抛出了异常："+ex.getMessage());
    }


}
