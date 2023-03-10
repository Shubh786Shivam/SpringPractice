package collections;

import java.util.Properties;

public class Employee {
     private String name;
     private Properties props;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Properties props) {
		super();
		this.name = name;
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
     
     
}
