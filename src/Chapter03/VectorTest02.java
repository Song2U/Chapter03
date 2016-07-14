package Chapter03;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class VectorTest02 {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();// 내부에 동기화 처리가 되어있음
		list.add("둘리");
		list.add("마이콜");
		list.add("고길동");
		list.add(2, "도우넛");

		list.remove(1);

		// 순회 1
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		//순회 2
		/*Iterator<String> it = list.iterator();
		while()
		*/
		for(String s:list){
			System.out.println(s);
		}
	}
}