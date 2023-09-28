package junit5tests;

import org.junit.jupiter.api.*;
import java_study.Calculator;

public class BeforeAndAfterTest {
	
	Calculator calc;	
	int sum;
	
	@BeforeAll
	public static void beforeAllMethod(){
		System.out.println("Establishing connection to the database.");
	}
	@AfterAll
	public static void afterAllMothod() {
		System.out.println("Closing connection to the database.");
	}
	@BeforeEach
	public void init() {
		calc=new Calculator(); //각각의 테스트전 매번 @BeforeEach인 init()호출
		System.out.println("Initializing the calulator instance.");
	}
	
	@Test
	@DisplayName("Adding 2 positive numbers")
	public void testMethod1() {
		sum=calc.add(10, 20);

	}
	@Test
	@DisplayName("Adding 2 negative numbers")
	public void testMethod2() {
		sum=calc.add(-20, -30);

	}
	
	@AfterEach
	public void teatDown() {
		System.out.println("The toal is "+ sum);
		System.out.println("Test Method executed successfully");
	}
}
