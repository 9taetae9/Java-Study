package java_study;

public class Lambda_Ex {

	public static void main(String[] args) {
		//Object obj = (a, b) -> a > b ? a:b; //람다식. 익명객체
		Object obj = new Object() {
			int max(int a, int b) {
				return a>b ? a : b;
			}
		};  //자바는 모든 메서드는 객체 내에 있어야한다.
		
		//int value =obj.max(3,5) (x) 
		//=> Object type의 참조변수(obj)에는 max라는 메소드가 존재하지 않기 떄문
		//함수형 인터페이스 사용!
		MyFunction f = new MyFunction() {  //익명클래스 클래스의 선언(객체생성을 동시에)
						public int max(int a, int b) {
							return a > b ? a : b;
							}
						};
				
		int value = f.max(3, 5); //OK. MyFunction에 max()가 있음
		
		//함수형 인터페이스 타입의 참조변수로 람다식을 참조할 수 있음.
		//단, "함수형 인터페이스의 메서드"와 "람다식"의 
		//"매개변수 개수"와 "반환타입"이 일치해야 함.
		//람다식(익명객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 함.
		
		MyFunction f2 = (a, b)-> a > b ? a : b; 
		//람다식. 익명 객체 (람다식의 이름은 함수형 인터페이스에)
		int value2 = f.max(3, 5); //실제로는 람다식(익명함수)가 호출됨.
		System.out.println("value : "+value2); 
	}
	
	
	//함수형 인터페이스 : 단 하나의 추상 메서드만 선언된 인터페이스
	@FunctionalInterface
	interface MyFunction {
		int max(int a, int b);/*public abstract 디폴트=생략*/ 
		//public abstract int max2(int a, int b); => 추상 메서드는 단 하나의 추상 메서드만 가져야한다.
	}
	
	
}
