package interfaces;

/*
 *ʹ��Sort()�����������ʵ��Comparable�ӿ�
 * */
public class Employee implements Comparable<Employee> { //ʵ��Comparable����
	
	private String name;
	private double salary;
	
	

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
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



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public int compareTo(Employee o) {  //ʵ��һ��
		return Double.compare(salary, o.salary);//����salary��������
	}

}
