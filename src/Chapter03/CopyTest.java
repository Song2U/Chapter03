package Chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try { // 파일이 없을수도 있으니 파일이 없을 경우의 예외처리를 해야함 (예외를 던져줌)
			fis = new FileInputStream("phpinfo.php");
			fos = new FileOutputStream("sample.php");

			int data = -1;
			while ((data = fis.read()) != -1) {// 한 바이트씩 읽음
				// IOException이 발생할 수 있으므로 예외 처리 해주어야 함
				fos.write(data);
			}

			/*
			 * fis.close(); //자원 정리위치가 여기면 안됨
			 * fos.close(); // 반드시 실행 되도록 finally 안에 넣어야 한다.
			 */

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다." + e);
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 자원정리
			if (fis != null) {
				try {// close에도 IOException이 일어날 수 있음
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}