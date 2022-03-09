package EmployeeBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("employee.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee emp1=(Employee)factory.getBean("emp1");
		
		System.out.println("Employee Details");
		System.out.println("------------------------");
		System.out.println("Employee ID : "+emp1.getId());
		System.out.println("Employee Name : "+emp1.getName());
		System.out.println("Employee Salary : "+emp1.getSalary());
		System.out.println("Employee BU : " + emp1.getBU());
		System.out.println("Employee Age : " + emp1.getAge());
		
	}

}
