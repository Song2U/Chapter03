package Chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ms949.txt");
			//별도로 지정하지 않으면 기본 설정된 인코딩으로 출력
			InputStreamReader isr = new InputStreamReader(fis,"ms949");

			int data = -1;
			while ((data = isr.read()) != -1) {
				System.out.print((char) data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}