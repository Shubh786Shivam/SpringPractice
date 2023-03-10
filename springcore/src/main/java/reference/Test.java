package reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("reference/refConfig.xml");
		
		A a = (A) ct.getBean("refA");
		
		System.out.println(a.getObj());
	}

}
