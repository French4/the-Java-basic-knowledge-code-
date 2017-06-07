package interfaces;

import java.util.Arrays;
/*
 * 一 java.lang.Comparable<T>
 *    int compareTo(T other):
 *     用这个对象和other对象进行比较，如果这个对象小于other则返回负数，否则返回正数。
 * 二：java.utils.Arrays
 * 		static void sort(Object[] a);数组中的元素必须实现了Comparable接口的类，并且元素之间是可比的。
 * */
public class EmploySortTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Hass", 78);
		staff[1] = new Employee("Hass2", 18);
		staff[2] = new Employee("Hass3", 99);
		
		Arrays.sort(staff);
		
		for (Employee employee : staff) {
			System.out.println("name="+employee.getName()+", salary=" +employee.getSalary());
		}
	}
}
