package Chapter03;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class VectorTest02 {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();// ���ο� ����ȭ ó���� �Ǿ�����
		list.add("�Ѹ�");
		list.add("������");
		list.add("��浿");
		list.add(2, "�����");

		list.remove(1);

		// ��ȸ 1
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		//��ȸ 2
		/*Iterator<String> it = list.iterator();
		while()
		*/
		for(String s:list){
			System.out.println(s);
		}
	}
}