package Chapter03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList();	//�ӽð��� ���� �����ϴ� ��� ���
		list.add("�Ѹ�");
		list.add("������");
		list.add("��浿");

		list.remove(1);

		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
	}
}