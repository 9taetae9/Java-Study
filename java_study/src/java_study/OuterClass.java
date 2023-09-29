package java_study;

/*중첩 클래스
 * 클래스 내부에 존재하는 클래스
 * 두 클래스가 서로 긴밀한 관계일 때 사용 고려(특히 사용 특정 클래스의 사용범위가
 * 한 클래스 범위뿐일 떄)
 * 
 * -장점
 * 내부 클래스에서 외부 클래스에 쉽게 접근할 수 있다.
 * 외부 클래스 바깐으로는 내부 클래스를 감춰 캡슐화
 */
public class OuterClass {
	
	class InnerClass{
		void print() {
			System.out.println("innerclass!");
		}
	}
	
	static class StaticNestedClass{
		static int add(int a, int b) {
			return a+b;
		}
	}
	//정적 중첩 클래스
	int k = OuterClass.StaticNestedClass.add(1,2); 

    OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

    // Adding a constructor to demonstrate the usage of InnerClass
    public OuterClass() {
        OuterClass.InnerClass innerObject = new InnerClass();
        innerObject.print();

        OuterClass.InnerClass innerObject2 = this.new InnerClass();
        innerObject2.print();
    }
	
	void method() {
		class LocalInnerClass{
			//...
		}
		//...
	}
	
	OuterClass anonymousClass = new OuterClass() { // ...
		
	};

}
/*
 * 컴파일 시 생성 파일
 * OuterClass.class
 * OuterClass$1.class
 * OuterClass$1LocalInnerClass.class
 * OuterClass$InnerClass.class
 * OuterClass$StaticNestedClass.class
 * */
