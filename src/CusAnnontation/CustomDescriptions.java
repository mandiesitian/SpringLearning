package CusAnnontation;

import java.lang.annotation.*;

@Documented  //可以生成API文档
@Retention(RetentionPolicy.RUNTIME)  //运行时存在
@Target(ElementType.TYPE)
@Inherited
public @interface CustomDescriptions {
    CustomDescription[] value();  //放置CustomDescription对象
}
