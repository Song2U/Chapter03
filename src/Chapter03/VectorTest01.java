package Chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		//Collecttion Framework (jdk 1.2 ����)
		Vector vector = new Vector();
		
		vector.add("�Ѹ�");
		vector.add("������");
		vector.add("�����");
		vector.add("��浿");
		
		vector.remove("������");
		
		//��ȸ 1
		int size= vector.size();
		for(int i=0; i<size;i++){
			String s = (String) vector.elementAt(i);
			System.out.println(s);
		}
		// ��ȸ 2
		Enumeration e = vector.elements();
		while(e.hasMoreElements()){
			String s = (String) e.nextElement();
			System.out.println(s);
		}
	}
}