package Chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		try {
			// './' : ���� ������Ʈ ��ġ
			FileReader fr = new FileReader("./src/Chapter03/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);

			String s = null;
			int index = 0;
			while ((s = br.readLine()) != null) {
				String line = String.format("%d: %s", ++index, s);
				System.out.println(line);
			}
			// ��Ʈ���� ���� �� ����� �� �� �ϳ��� ������ �� ����
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