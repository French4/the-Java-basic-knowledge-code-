package interfaces;

import java.util.Arrays;

public class Comparator {
	public static void main(String[] args) {
		String[] friends = {"Peter1", "Pa2", "Mamksa3"};
		Arrays.sort(friends, new LengthComparator());  //���ݱȽ���
		for (String string : friends) {
			System.out.println(string); 
		}
	}
}
class LengthComparator  implements java.util.Comparator<String>{
	public int compare(String first, String second){
		return first.length() - second.length(); //������������
	}
}
