package lylace.adv;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInputStreams {

	public static void main(String[] args) {
		// 바이트기반 스트림
		// 파일에 저장된 객체를 역직렬화를 통해 다시 객체로 변환

		String fpath = "c:/Java/data.dat";

		try (FileInputStream fis = new FileInputStream(fpath); ObjectInputStream ois = new ObjectInputStream(fis);) {
			String name = (String) ois.readUTF();
			Users u = (Users) ois.readObject();
			int age = ois.readInt();

			System.out.println(u.userid);
			System.out.println(u.passwd);
			System.out.println(u.name);
			System.out.println(u.age);

			System.out.println(name);
			System.out.println(age);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
