package lambda;

import java.util.Arrays;
/*
 * ��һ���Ƚ����ͼ�������ʹ��lambda���ʽ
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
		Arrays.sort(planents, (first, second)->first.length()-second.length());//����ʽ�ӿڿ���ʹ��lambda���ʽ����
		//������Ǵ���Ƚ���
		System.out.println(Arrays.toString(planents));
	}
}
