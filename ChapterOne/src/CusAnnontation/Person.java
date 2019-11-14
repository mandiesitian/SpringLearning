package CusAnnontation;

//加两个自定义注解
@CustomDescription(decription = "基类")
@CustomDescription(decription = "人")  //复制属性
public class Person {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
