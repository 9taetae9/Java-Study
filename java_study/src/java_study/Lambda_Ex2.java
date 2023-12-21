package java_study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda_Ex2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		
		Collections.sort(list, new Comparator<String>() {
									public int compare(String s1, String s2) {
										return s2.compareTo(s1);
									}
								});  // too long => use functional interface!
		
		List<String> list2 = Arrays.asList("abc","aaa", "bbb", "ddd", "aaa");
		System.out.println(list2);
		
		Collections.sort(list2, (s1, s2)->s1.compareTo(s2));//오름차순
		
		System.out.println(list2);
	
		Collections.sort(list2, (s1, s2)->s2.compareTo(s1));//내림차순
		
		System.out.println(list2);  
		
		Myfunction f = ()->System.out.println("myMethod()");
		aMethod(f);
		
		aMethod(()->System.out.println("MyMethod"));
		
		
		
	}
	static void aMethod(Myfunction f) {
		f.myMethod(); // Myfunction에 정의된 메서드 호출
	}
	
	@FunctionalInterface
	interface Compartor<T>{
		int compare(T o1, T o2);
	}

	@FunctionalInterface
	interface Myfunction{
		void myMethod();
	}
	
}
