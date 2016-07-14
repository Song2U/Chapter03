package Chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // calendar는 추상클래스
		printDate(calendar);

		//calendar.set(2017, 1, 1);
		//printDate(calendar);
		
		calendar.set(Calendar.YEAR, 2017);
		printDate(calendar);
		
		calendar.set(2012,04,17);
		calendar.add(Calendar.DATE, 1600); //1600잃 후
		printDate(calendar);
		
		//오늘
		calendar = Calendar.getInstance();
		
		//10딜 전
		calendar.add(Calendar.MONTH, -10);
		printDate(calendar);
		
		//오늘은 올해의 몇번째 되는 날?
		calendar = Calendar.getInstance();
		System.out.println("오늘은 올 해 " + calendar.get(Calendar.DAY_OF_YEAR) + "일 째 되는 날");
	}

	public static void printDate(Calendar calendar) {
		final String[] DAYS = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.print(calendar.get(Calendar.YEAR) + "-");
		System.out.print(calendar.get(Calendar.MONTH) + 1 + "-");
		System.out.print(calendar.get(Calendar.DATE) + " ");
		System.out.print(DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1] + "요일   "); // 요일 배열은 1부터 시작
		System.out.print((calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM") + " ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.print(calendar.get(Calendar.SECOND));
		System.out.print("\n");
	}
}