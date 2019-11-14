package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    IAir air;
    @Autowired  //构造方法自动装载对象
    public Person(@Qualifier("dirtyair") IAir air){
        this.air=air;
    }
    public void Breath(){
        System.out.println(this.air.toString());
    }
}
