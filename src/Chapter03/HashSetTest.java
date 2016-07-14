package Chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("둘리");
		set.add("마이콜");
		set.add("도우너");
		System.out.println(set.size());

		// 같은 값은 삽입되지않음
		set.add("둘리");
		set.add("도우너");
		System.out.println(set.size());

		System.out.println(set.contains("마이콜"));
		System.out.println(set.contains("고길동"));

		// 전체 가져오기
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}