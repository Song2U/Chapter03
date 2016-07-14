package Chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		// simpledateformat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��\ta hh�� mm�� ss��");
		System.out.println(sdf.format(now));
		// �޼��� ���
		printDate(now);

		Date d = new Date(1234567L);
		printDate(d);
	}

	public static void printDate(Date date) {
		System.out.print((date.getYear() + 1900) + "�� "); // 1900~
		System.out.print((date.getMonth() + 1) + "�� "); // 0~
		System.out.print((date.getDate()) + "��\t");
		System.out.print((date.getHours()) + ":");
		System.out.print((date.getMinutes()) + ":");
		System.out.print((date.getSeconds()));
		System.out.println("");
	}
}