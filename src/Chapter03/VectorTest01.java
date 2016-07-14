package Chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		//Collecttion Framework (jdk 1.2 이전)
		Vector vector = new Vector();
		
		vector.add("둘리");
		vector.add("마이콜");
		vector.add("도우너");
		vector.add("고길동");
		
		vector.remove("마이콜");
		
		//순회 1
		int size= vector.size();
		for(int i=0; i<size;i++){
			String s = (String) vector.elementAt(i);
			System.out.println(s);
		}
		// 순회 2
		Enumeration e = vector.elements();
		while(e.hasMoreElements()){
			String s = (String) e.nextElement();
			System.out.println(s);
		}
	}
}