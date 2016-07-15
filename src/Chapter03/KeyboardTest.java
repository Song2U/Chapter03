package Chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
			// system.in : 바이트 기반
			BufferedReader br = new BufferedReader(isr);

			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (UnsupportedEncodingException e) {
			// 인코딩 형태를 지원 하는지의 여부 예외처리
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}