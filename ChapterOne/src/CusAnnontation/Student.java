package CusAnnontation;


@CustomDescription(decription = "学生")
public class Student extends Person{
    private String StudentId;
    public String getStudentId(){
        return StudentId;
    }

    public void setStudentId(String studentId){
        this.StudentId=studentId;
    }

    //通过反射获取注解属性值
    public static void main(String[] args) {
        //得到class 类 然后才能得到程序元素（构造方法 方法等）
        CustomDescriptions customDescriptions=new Student().getClass().getAnnotation(CustomDescriptions.class);
        //得到 value中放置的CustomDescription 注释  是一个CustomDescription数组
        for(CustomDescription h:customDescriptions.value()){
            System.out.println("description:"+h.decription());  //h是一个注释 decription（）类似于成员变量  要加括号
        }
    }
}
