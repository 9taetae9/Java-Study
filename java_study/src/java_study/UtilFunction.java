package java_study;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UtilFunction {

	public static void main(String[] args) {
		Supplier<Integer> s = ()->(int)(Math.random()*100)+1;
		Consumer<Integer> c = i->System.out.print(i+ ", ");
		Predicate<Integer> p = i -> i%2==0;
		Function<Integer, Integer> f = i -> i/10*10; //일의 자리 제거
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		printEvenNum(p, c, list); 
		List<Integer> newList = doSometing(f,list);
		System.out.println(newList);
	}
	
	//Function<Integer, Integer> f = i -> i/10*10; //일의 자리 제거
	static <T> List<T> doSometing(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		return newList;
	}
	
	//Predicate<Integer> p = i -> i%2==0;
	//Consumer<Integer> c = i->System.out.print(i+ ", ");
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T e: list) {
			if(p.test(e)) { //짝수인지 검사
				c.accept(e);
			}
		}
		System.out.print("]");
	}
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			list.add(s.get());
		}
	}
	
}
