package Chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try { // ������ �������� ������ ������ ���� ����� ����ó���� �ؾ��� (���ܸ� ������)
			fis = new FileInputStream("phpinfo.php");
			fos = new FileOutputStream("sample.php");

			int data = -1;
			while ((data = fis.read()) != -1) {// �� ����Ʈ�� ����
				// IOException�� �߻��� �� �����Ƿ� ���� ó�� ���־�� ��
				fos.write(data);
			}

			/*
			 * fis.close(); //�ڿ� ������ġ�� ����� �ȵ�
			 * fos.close(); // �ݵ�� ���� �ǵ��� finally �ȿ� �־�� �Ѵ�.
			 */

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("������ ã�� �� �����ϴ�." + e);
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // �ڿ�����
			if (fis != null) {
				try {// close���� IOException�� �Ͼ �� ����
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