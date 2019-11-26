package AspectJDemo;

//要被拦截的方法类
public class AOPServicesImpl implements IAOPServices {
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String withAopMethod() throws Exception {
        System.out.println("AOP函数运行方法：withAopMethod");
        if(description.trim().length()==0){
            throw new Exception("decription属性不能为空");
        }
        return description;
    }

    public String wihtNoAopMethod() throws Exception {
        System.out.println("无AOP函数运行方法：withNoAopMethod");
        return description;

    }
}
