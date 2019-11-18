package model;

import org.springframework.stereotype.Component;

//@Component(value = "ClearAir")  //将类注解为组件  后面可以跟value值  表明其特定身份
public class ClearAir implements IAir{

    @Override
    public String toString() {
        return "CleanAir";
    }
}
