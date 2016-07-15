package Chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		try {
			/*
			 * FileOutputStream fis = new FileOutputStream("123.txt");
			 * BufferedOutputStream bos = new BufferedOutputStream(fis);
			 */
			// 변수를 만들지 않고 BufferedOutputStream에 직접 파일 이름 대입가능
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("123.txt"));

			// for(int i='1';i<'9';i++)
			for (int i = 49; i < 57; i++) { // '1'~'9'까지의 ASCII 코드
				bos.write(i);
			}
			bos.flush(); // 내부 버퍼의 내용을 파일에 쓰기
			bos.close(); // 닫을 때 자동으로 flush가 일어남
			System.out.println("기록되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}