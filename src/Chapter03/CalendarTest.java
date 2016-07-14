package Chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // calendar�� �߻�Ŭ����
		printDate(calendar);

		//calendar.set(2017, 1, 1);
		//printDate(calendar);
		
		calendar.set(Calendar.YEAR, 2017);
		printDate(calendar);
		
		calendar.set(2012,04,17);
		calendar.add(Calendar.DATE, 1600); //1600�� ��
		printDate(calendar);
		
		//����
		calendar = Calendar.getInstance();
		
		//10�� ��
		calendar.add(Calendar.MONTH, -10);
		printDate(calendar);
		
		//������ ������ ���° �Ǵ� ��?
		calendar = Calendar.getInstance();
		System.out.println("������ �� �� " + calendar.get(Calendar.DAY_OF_YEAR) + "�� ° �Ǵ� ��");
	}

	public static void printDate(Calendar calendar) {
		final String[] DAYS = { "��", "��", "ȭ", "��", "��", "��", "��" };

		System.out.print(calendar.get(Calendar.YEAR) + "-");
		System.out.print(calendar.get(Calendar.MONTH) + 1 + "-");
		System.out.print(calendar.get(Calendar.DATE) + " ");
		System.out.print(DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1] + "����   "); // ���� �迭�� 1���� ����
		System.out.print((calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM") + " ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.print(calendar.get(Calendar.SECOND));
		System.out.print("\n");
	}
}