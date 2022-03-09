package SBUBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("sbuBean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee emp1 = (Employee)factory.getBean("emp1");
		
		System.out.println(emp1);

	}

}
