package Chapter03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();

		// map.put("둘리", new Integer(100)); - AutoBoxing 됨
		map.put("둘리", 100);
		map.put("마이콜", 50);
		map.put("도우넛", 80);

		System.out.println(map.get("마이콜")); // AutoUnboxing

		// 전체 순회
		Set<String> set = map.keySet(); // 키를 저장하고 있는 집합
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
	}
}