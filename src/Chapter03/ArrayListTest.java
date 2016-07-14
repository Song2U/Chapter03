package Chapter03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("둘리");
		list.add("마이콜");
		list.add("고길동");

		list.remove(1);

		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		for(String s:list){
			System.out.println(s);
		}
	}
}