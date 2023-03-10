package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("autowiring/autowireConfig.xml");
		
		Employee e = (Employee) ct.getBean("emp");
		
		System.out.println(e);

	}

}
