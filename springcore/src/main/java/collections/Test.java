package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext ct = new ClassPathXmlApplicationContext("collections/collectionConfig.xml");
	     Employee emp = (Employee) ct.getBean("employee");
	        
	     System.out.println(emp.getName());
	     System.out.println(emp.getProps());

	}

}
