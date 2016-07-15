package Chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");

			int data = -1;
			while ((data = fr.read()) != -1) {// -1에 도달하면 파일을 다 읽은 것!
				System.out.print((char) data);
			}

			fr.close();

			System.out.println("");

			FileInputStream fis = new FileInputStream("test.txt");
			while ((data = fis.read()) != -1) {
				System.out.print((char) data); // (or byte로 캐스팅)
				/* 위의 코드로 출력하게되면 텍스트가 깨져서 나옴 ↓
				 * FileInputStream을 Char로 캐스팅하게되면
				 * UTF-8로 인코딩 된 문자는 2Byte를 차지하기때문에 읽을때 2Byte씩 읽어와야함 
				 * 문자 기반 스트림인 Reader, Writer에서는 이를 자동으로 처리하고 있음 */
			}
		} catch (FileNotFoundException e) {
			// FileNotFountException이 IOException의 자식이기 때문에
			// IOException 아래 있으면 실행이 되지 않음
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}