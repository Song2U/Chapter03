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
			// ������ ������ �ʰ� BufferedOutputStream�� ���� ���� �̸� ���԰���
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("123.txt"));

			// for(int i='1';i<'9';i++)
			for (int i = 49; i < 57; i++) { // '1'~'9'������ ASCII �ڵ�
				bos.write(i);
			}
			bos.flush(); // ���� ������ ������ ���Ͽ� ����
			bos.close(); // ���� �� �ڵ����� flush�� �Ͼ
			System.out.println("��ϵǾ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}