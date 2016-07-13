package Chapter03;

public class LangCalssTest {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(50, 100);
		Point p3 = p1;
		//Object�� �⺻ �޼��� �׽�Ʈ
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1); // println���� ����� �ϸ� �⺻������ toString�� ȣ���ؼ� �����
		
		System.out.println("================");
		
		String s = new String("Hello");
		// System.out.println(s); // String ���ο� �ִ� ���� ���� ���
		System.out.println(s.toString());

		//==��ü�� ��쿡�� ������ ��ü ���� �˻�
		System.out.println(p1 == p2);
		System.out.println(p1 == p3); // identity�� ������ Ȯ��

		System.out.println("================");

		// equals -> ��ü�� ���� ��
		Point p4 = new Point(10, 20);
		System.out.println(p1 == p4); // identity�� ������ Ȯ��
		System.out.println(p1.equals(p4)); // ������ ������ Ȯ�� - false�� ���� : equals�� �������̵� �ؾ��� (�������̵� ���� ������ �θ��� ���� �״�� �ҷ���)
		
		System.out.println("================");
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(System.identityHashCode(p1));//�������̵尡 �Ǿ��־ ������ �ؽð��� ��µ�
	}
}