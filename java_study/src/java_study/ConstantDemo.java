package java_study;

/*class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}
*/
//class Company{
//public static final Company APPLE = new Company();
//public static final Company GOOGLE = new Company();
//public static final Company ORACLE = new Company();
//}

enum Fruit{
	APPLE("RED"), PEACH("PINK"), BANANA("YELLOW");
	private String color;
	
	public String getColor() {
		return this.color;
	}
	
	Fruit(String color) { //enum도 역시 생성자이므로 생성자 생성가능
		System.out.println("Call Constructor : "+this); //상수가 3개라 3번 생성됨
		this.color = color; //지역변수가 전역변수보다 우선순위 높다 this 명시안하면 지역변수.
	}
}
enum Company{
	GOOGLE,APPLE,ORACLE;
}

/*enum: 열거형(enumerated type)라고한다. 열거형은 서로 연관된 상수들의 집합이라 할 수 있음.
 * 
 * enum의 사용의 장점
 * 
 * 코드가 단순해진다
 * 인스턴스 생성과 상속을 방지한다
 * 키워드 enum을 사용하기 떄문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
 * */
public class ConstantDemo {

	public static void main(String[] args) {
		
		for(Fruit f: Fruit.values()) {
			System.out.println(f);  
			//values =>APPLE, PEACH, BANANA
			//배열처럼 저장된 상수 가져올수있음
		}
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(type.getClass().getName());
			System.out.println("apple! "+type.getColor());
			break;
		case PEACH:
			System.out.println("peach!"+type.getColor());
			break;
		case BANANA:
			System.out.println("banana!"+type.getColor());
			break;
			
		}
	}
 
}
