package Chapter03;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		String name = "�����";
		int score = 100;

		// String Ŭ������ format static �޼��� ���
		System.out.println(name + ", " + score);
		System.out.println(String.format("�л� %s��(��)���� ������  %d�� �޾ҽ��ϴ�.", name, score));

		// Formatter�� ����ϴ� ���
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter();
		System.out.println(fm.format("�л� %s��(��)���� ������  %d�� �޾ҽ��ϴ�.", name, score));
	}
}