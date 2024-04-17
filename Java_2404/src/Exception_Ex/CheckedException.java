package Exception_Ex;

class CheckedException {
	public static void main(String[] args) {
		try {
			throw new Exception();		// Exception을 고의로 발생.			
		} catch (Exception e) {}
	}
}
