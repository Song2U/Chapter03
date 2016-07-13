package Chapter03;

public class StringTest04 {

	public static void main(String[] args) {
		String str = "aBcAbCabcABC";

		System.out.println(str.substring(3));// �ڵ����� �� �ε����� ���������� ����
		System.out.println(str.substring(2, 5));
		System.out.println(str.indexOf("A"));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.length());
		System.out.println(str.replace("a", "R"));
		System.out.println(str.replaceAll("a", "R"));
		System.out.println(str.substring(0, 3));
		System.out.println(str.toUpperCase());

		System.out.println("==================");

		String a = new String(" abcd");
		String b = new String(",efg ");

		a = a.concat(b); // concat�� �� ���ο� ��ü ����
		System.out.println(a);

		a = a.trim(); // �յڰ�������
		System.out.println("---" + a + "---");

		String[] as = "".split(" "); // ����� �������� ��ü�� �������� (null üũ ���ʿ�)
		for (String s : as) {
			System.out.println(s);
		}
	}
}