package java_study;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		Function<String,Integer> f=(String s) -> Integer.parseInt(s);
		Function<String,Integer> f2=Integer::parseInt; //함수형 인터페이스에 정보가 있기 떄문에 메서드참조가 가능
		
		
		System.out.println(f.apply("100")+200);
		System.out.println(f2.apply("100")+200);
		
		Supplier<MyClass> s= ()->new MyClass();
		Supplier<MyClass> s2= MyClass::new;
		
		MyClass mc = s.get(); //MyClass 객체 반환
		System.out.println(s.get()); 
		
		MyClass mc2 = s2.get(); //MyClass 객체 반환
		System.out.println(s2.get()); 
		
		Function<Integer, MyClass2> f3=(i)->new MyClass2(i);
		Function<Integer, MyClass2> f4=MyClass2::new;
		
		MyClass2 mc3 = f3.apply(100);
		System.out.println(mc3.iv);
		System.out.println(f3.apply(200).iv);
		
		MyClass2 mc4 = f4.apply(200);
		System.out.println(mc4.iv);
		
		Function<Integer, int[]> f5 = (i) -> new int[i];
		System.out.println(f5.apply(100).length);
		
		Function<Integer,int[]> f6 = int[]::new; //메서드 참조
		System.out.println(f6.apply(200).length);
		
		
		
		
	}
}

class MyClass{}

class MyClass2{
	int iv;
	
	MyClass2(int iv) {
		this.iv=iv;
	}
}