package Chapter03;

public class StringTest {

	public static void main(String[] args) {
		// �̽������� ���� ���
		char c = '\'';
		String s = "He\"llo\" \tWorld";

		System.out.println(s);

		// + ����
		System.out.println("Hello" + "World" + 2);
		StringBuffer sb = new StringBuffer("Hello").append("World");
		sb.append(" World");
		sb.append(2);
	}
}