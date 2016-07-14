package Chapter03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();

		// map.put("�Ѹ�", new Integer(100)); - AutoBoxing ��
		map.put("�Ѹ�", 100);
		map.put("������", 50);
		map.put("�����", 80);

		System.out.println(map.get("������")); // AutoUnboxing

		// ��ü ��ȸ
		Set<String> set = map.keySet(); // Ű�� �����ϰ� �ִ� ����
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
	}
}