package lambda;

import java.util.Arrays;
/*
 * 在一个比较器和监听器中使用lambda表达式
 * */
public class LambdaTest {
	public static void main(String[] args) {
		String[] planents = new String[] {"Merry", "Venus", "Earth", "Mars", "Jupter", "Saturn"};
		System.out.println(Arrays.toString(planents));
		System.out.println("Sorted:");
		Arrays.sort(planents);
		System.out.println(Arrays.toString(planents));
		System.out.println("Sorted By Length:");
		String second;
		String first;
		Arrays.sort(planents, (first, second)->first.length()-second.length());//函数式接口可以使用lambda表达式代替
		//这里就是代替比较器
		System.out.println(Arrays.toString(planents));
	}
}
