package Exception_Ex;

import java.io.*;

class MethodException2 {
	public static void main(String[] args) {
			File f = createFile("");
			System.out.println( f.getName()+"파일이 성공적으로 생성되었습니다.");
	}	// main 메서드 끝.

	static File createFile(String fileName) { // throws Exception {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");

		} catch (Exception e) {
			fileName = "제목없음.txt";
		}		
	
		File f = new File(fileName);		//  File클래스의 객체를 만든다.
     	// File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;		// 생성된 객체의 참조를 반환한다.
	}	// createFile메서드 끝.
}	// 클래스 끝.