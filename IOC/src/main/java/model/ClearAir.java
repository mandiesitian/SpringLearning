package model;

import org.springframework.stereotype.Component;

@Component  //将类注解为组件
public class ClearAir implements IAir{
    @Override
    public String toString() {
        return "CleanAir";
    }
}
