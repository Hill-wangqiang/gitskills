public Test {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
	class TestFactory {
		public Test getInstance() {
			return new Test();
		}
	}
	
	class TestFuther1 {
		System.out.println("just test ");
	}
}