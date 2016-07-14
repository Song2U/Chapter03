package Chapter03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList();	//임시값을 많이 대입하는 경우 사용
		list.add("둘리");
		list.add("마이콜");
		list.add("고길동");

		list.remove(1);

		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
	}
}