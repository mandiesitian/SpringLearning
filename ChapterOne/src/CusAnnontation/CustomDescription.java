package CusAnnontation;

import java.lang.annotation.*;

@Documented  //可以生成API文档
@Retention(RetentionPolicy.RUNTIME)  //运行时存在
@Target(ElementType.TYPE)
@Inherited
@Repeatable(CustomDescriptions.class)   //此标签可以复制
public @interface CustomDescription {
    String decription() default "";
}
