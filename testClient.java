package FactoryBeanEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testClient {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("factorybean.xml");
        System.out.println("********************************");
        // IndiansName name=context.getBean("indians",IndiansName.class);
        // UsName name1=context.getBean("us",UsName.class);
        // String[] indiansNames=name.getName();
        // String[] usNames=name1.getName();
        // for (String indianName : indiansNames) {
        //     System.out.println(indianName);
        // }
        // System.out.println("****************************************************************");
        //  for (String usName : usNames) {
        //     System.out.println(usName);
        // }
       MainNamesData data = context.getBean("mainNames", MainNamesData.class);
        data.namesInfo();
    }
}
