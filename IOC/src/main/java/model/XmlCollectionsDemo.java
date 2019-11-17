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

    private  String name;

    private Date date;  //需要注入的属性

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


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


    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"ApplicationContextOne.xml"});
        BeanFactory factory=context;

        XmlCollectionsDemo annotationInstance = (XmlCollectionsDemo) factory.getBean("xmlConllectionsDemo");


        System.out.println(annotationInstance.name);
        System.out.println(annotationInstance.list);  //赋值了（注入了） 就有值了  没有注入就是null
        System.out.println(annotationInstance.pros);
        System.out.println(annotationInstance.sets);
        System.out.println(annotationInstance.maps);
        System.out.println(annotationInstance.date);

    }


}
