package Chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		try {
			// './' : 현재 프로젝트 위치
			FileReader fr = new FileReader("./src/Chapter03/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);

			String s = null;
			int index = 0;
			while ((s = br.readLine()) != null) {
				String line = String.format("%d: %s", ++index, s);
				System.out.println(line);
			}
			// 스트림을 닫을 때 연결된 것 중 하나만 닫으면 다 닫힘
			// fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}