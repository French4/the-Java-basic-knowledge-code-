package interfaces;

import java.util.Arrays;
/*
 * һ java.lang.Comparable<T>
 *    int compareTo(T other):
 *     ����������other������бȽϣ�����������С��other�򷵻ظ��������򷵻�������
 * ����java.utils.Arrays
 * 		static void sort(Object[] a);�����е�Ԫ�ر���ʵ����Comparable�ӿڵ��࣬����Ԫ��֮���ǿɱȵġ�
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
