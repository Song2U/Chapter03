package Chapter03;

public class StringTest04 {

	public static void main(String[] args) {
		String str = "aBcAbCabcABC";

		System.out.println(str.substring(3));// 자동으로 끝 인덱스는 마지막으로 지정
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

		a = a.concat(b); // concat이 된 새로운 객체 생성
		System.out.println(a);

		a = a.trim(); // 앞뒤공백제거
		System.out.println("---" + a + "---");

		String[] as = "".split(" "); // 결과가 없을때도 객체를 리턴해줌 (null 체크 불필요)
		for (String s : as) {
			System.out.println(s);
		}
	}
}