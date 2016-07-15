package Chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest {

	public static void main(String[] args) {

		try {
			// './' : ���� ������Ʈ ��ġ
			FileReader fr = new FileReader("./src/Chapter03/LineNumberReaderTest.java");
			LineNumberReader lnr = new LineNumberReader(fr);

			String s = null;
			while ((s = lnr.readLine()) != null) {
				String line = String.format("%d: %s", lnr.getLineNumber(), s);
				System.out.println(line);
			}
			// ��Ʈ���� ���� �� ����� �� �� �ϳ��� ������ �� ����
			// fr.close();
			lnr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}