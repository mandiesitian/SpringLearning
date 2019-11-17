package model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.*;

public class XmlCollectionsDemo {
    private List<Object> list;

    private Properties pros;

    private Set<Object> sets;

    private Map<String, Object> maps;

    private  String names;

    private Date date;  //需要注入的属性s

    public void setNames(String name) {
        this.names = name;
    }

//    public String getName() {
//        return name;
//    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {  //与bean配置中的name 一一对应 XML属性注入方法的特点
        this.date = date;
    }

    public List<Object> list() {
        return list;
    }


    public void setList(List<Object> list) {
        this.list = list;
    }


    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    //初始化 和销毁
    public void DestoryMethod(){
        System.out.println("销毁");
    }

    public void InitMethod(){
        System.out.println("初始化");
    }

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"ApplicationContextOne.xml"});
        BeanFactory factory=context;

        XmlCollectionsDemo annotationInstance = (XmlCollectionsDemo) factory.getBean("xmlConllectionsDemo");


        System.out.println(annotationInstance.names);
        System.out.println(annotationInstance.list);  //赋值了（注入了） 就有值了  没有注入就是null
        System.out.println(annotationInstance.pros);
        System.out.println(annotationInstance.sets);
        System.out.println(annotationInstance.maps);
        System.out.println(annotationInstance.date);

        annotationInstance.DestoryMethod();

    }


}
