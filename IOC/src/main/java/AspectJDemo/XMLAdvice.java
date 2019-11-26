package AspectJDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*
定义XMLAdvice拦截器方法，用于延时前置 后置 成功返回 异常返回  环绕通知
 */
public class XMLAdvice {
    public void beforeAdvice(){
        System.out.println("前置通知执行了");
    }

    public void afterAdvice(){
        System.out.println("后置通知被执行了");
    }

    public void afterReturnAdvice(String result){
        System.out.println("返回通知执行了"+"运行行业务返回的结果为："+result);
    }

    public  String aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        String result="";
        try {
            System.out.println("环绕通知开始执行了");
            long start=System.currentTimeMillis();
            result= (String) proceedingJoinPoint.proceed();
            long end=System.currentTimeMillis();
            System.out.println("环绕通知执行结束了");
            System.out.println("执行业务方法共计："+(end-start)+"毫秒。");
        }catch (Throwable e){

        }
         return  result;
    }

    public void throwingAdvice(JoinPoint joinpoint,Exception e){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("异常通知执行了。");
        stringBuffer.append("方法：").append(joinpoint.getSignature().getName()).append("出现了异常");
        stringBuffer.append("异常信息为：").append(e.getMessage());
        System.out.println(stringBuffer.toString());
    }


}
