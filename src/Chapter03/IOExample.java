package Chapter03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		byte[] src = { 0, 1, 2, 3, 4, 5 };

		ByteArrayInputStream bais = new ByteArrayInputStream(src);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int data = -1;
		while ((data = bais.read()) != -1) { // read : 하나씩 읽어나감
			baos.write(data);
		}
		byte[] dest = baos.toByteArray();

		System.out.println(Arrays.toString(src)); // Arrays.toString(배열); -> 배열을 모두 String 형식으로 바꿔서 출력
		System.out.println(Arrays.toString(dest));

		// IO를 사용할 때는 Stream만 만들어주면 됨!!
	}
}