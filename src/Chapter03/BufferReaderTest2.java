package Chapter03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ms949_2.txt");
			// 별도로 인코딩 지정하지 않으면 기본 설정된 인코딩으로 출력
			InputStreamReader isr = new InputStreamReader(fis, "ms949");
			BufferedReader br = new BufferedReader(isr);

			String s = null;

			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}