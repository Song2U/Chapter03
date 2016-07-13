package Chapter03;

public class LangCalssTest {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(50, 100);
		Point p3 = p1;
		//Object의 기본 메서드 테스트
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1); // println에서 출력을 하면 기본적으로 toString을 호출해서 출력함
		
		System.out.println("================");
		
		String s = new String("Hello");
		// System.out.println(s); // String 내부에 있는 버퍼 내용 출력
		System.out.println(s.toString());

		//==객체인 경우에는 동일한 객체 여부 검사
		System.out.println(p1 == p2);
		System.out.println(p1 == p3); // identity가 같은지 확인

		System.out.println("================");

		// equals -> 객체의 내용 비교
		Point p4 = new Point(10, 20);
		System.out.println(p1 == p4); // identity가 같은지 확인
		System.out.println(p1.equals(p4)); // 내용이 같은지 확인 - false로 나옴 : equals를 오버라이딩 해야함 (오버라이딩 하지 않으면 부모의 것을 그대로 불러옴)
		
		System.out.println("================");
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(System.identityHashCode(p1));//오버라이드가 되어있어도 기존의 해시값이 출력됨
	}
}