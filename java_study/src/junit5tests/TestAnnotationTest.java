package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java_study.Calculator;

public class TestAnnotationTest {
	
	@Test
	@DisplayName("Adding 2 positive numbers")
	public void testMethod1() {
		Calculator calc =new Calculator();
		int sum=calc.add(10, 20);
		System.out.println("The total is "+sum);
	}
	@Test
	@DisplayName("Adding 2 negative numbers")
	@Disabled("Not executing as the functionality is not working") //not to execute
	public void testMethod2() {
		Calculator calc=new Calculator();
		int sum=calc.add(-20, -30);
		System.out.println("The toal is "+ sum);
	}
	@Test
	private void testMethod3() {  // private method는 테스트 포함 x
 		Calculator calc=new Calculator();
		int sum=calc.add(-30, -30);
		System.out.println("The toal is "+ sum);
	}
}
