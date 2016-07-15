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
			while ((data = fr.read()) != -1) {// -1�� �����ϸ� ������ �� ���� ��!
				System.out.print((char) data);
			}

			fr.close();

			System.out.println("");

			FileInputStream fis = new FileInputStream("test.txt");
			while ((data = fis.read()) != -1) {
				System.out.print((char) data); // (or byte�� ĳ����)
				/* ���� �ڵ�� ����ϰԵǸ� �ؽ�Ʈ�� ������ ���� ��
				 * FileInputStream�� Char�� ĳ�����ϰԵǸ�
				 * UTF-8�� ���ڵ� �� ���ڴ� 2Byte�� �����ϱ⶧���� ������ 2Byte�� �о�;��� 
				 * ���� ��� ��Ʈ���� Reader, Writer������ �̸� �ڵ����� ó���ϰ� ���� */
			}
		} catch (FileNotFoundException e) {
			// FileNotFountException�� IOException�� �ڽ��̱� ������
			// IOException �Ʒ� ������ ������ ���� ����
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}