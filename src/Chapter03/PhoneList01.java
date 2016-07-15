package Chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			System.out.println("================== 파일 정보 ==================");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "byte");
			
			System.out.println("================ 전화 번호 리스트 ================");
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String s = null;
			while ((s = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(s, "\t");
				int index = 0;
				while(st.hasMoreTokens()){
					String token = st.nextToken();
					if(index==0){
						System.out.print("이름 : " + token);
					}else if(index==1){
						System.out.print("\t전화번호 : " + token);
					}else{
						System.out.print("-" + token);
					}
					System.out.print(token);
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}