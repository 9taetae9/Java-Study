package java_study;

public class DMD {

	public static void main(String[] args) {
		Shape triangle = new Triangle();
		Shape square = new Square();

		triangle.printInfo();
		square.printInfo();
	}
	
	interface Shape{
		public void printInfo();
	}
	
	static class Triangle implements Shape{
		@Override
		public void printInfo() {
			System.out.println("Triangle");
		}
	}
	
	static class Square implements Shape{
		@Override
		public void printInfo() {
			System.out.println("Square");
		}
	}

}
