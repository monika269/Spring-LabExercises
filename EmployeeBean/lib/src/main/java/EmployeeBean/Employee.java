package EmployeeBean;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String BU;
	private int age;
	
	Employee(){}
	
	public Employee(int id, String name, double salary, String bU, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		BU = bU;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getBU() {
		return BU;
	}

	public void setBU(String bU) {
		BU = bU;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
}
