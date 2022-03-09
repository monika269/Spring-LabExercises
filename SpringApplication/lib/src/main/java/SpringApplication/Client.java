package SpringApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID");
		int id=sc.nextInt();
		
		List<Employee> employeeList=new ArrayList<>(); 
		
		
		Resource resource = new ClassPathResource("employeeConstructor.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp1=(Employee) factory.getBean("emp1");
		Employee emp2=(Employee) factory.getBean("emp2");
		Employee emp3=(Employee) factory.getBean("emp3");
		
		ApplicationContext anContext = new ClassPathXmlApplicationContext("employeeAnnotation.xml");
		Employee emp4 = anContext.getBean(Employee.class);
		//System.out.println(std1);
		
		emp4.setId(1007);
		emp4.setName("Raj");
		emp4.setSalary(55000.0);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeSetterInjection.xml");
		Employee emp5 = (Employee)context.getBean("emp5");
		Employee emp6 = (Employee)context.getBean("emp6");
		
		//add all employees
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		
		for(Employee e:employeeList) {
			if(e.getId()==id) {
				System.out.println("Employee Info: ");
				System.out.println("Employee ID : " +e.getId());
				System.out.println("Employee NAME: "+ e.getName());
				System.out.println("Employee SALARY: "+ e.getSalary());
			}
		}
		
		
		
		
		
	}

}
