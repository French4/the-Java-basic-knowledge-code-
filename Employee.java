package interfaces;

/*
 *使用Sort()方法的类必须实现Comparable接口
 * */
public class Employee implements Comparable<Employee> { //实现Comparable方法
	
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
	public int compareTo(Employee o) {  //实现一个
		return Double.compare(salary, o.salary);//按照salary进行排序
	}

}
