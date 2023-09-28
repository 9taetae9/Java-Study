package junit5tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
	/*
	 * 1. Condition on Operating System
	 * 2. Condition on pariticular JRE
	 * 3. Condition on JRE reange
	 * 4. Condition on System Properties
	 */
	@Test
	@EnabledOnOs(OS.MAC)
	public void conditionOnOS() {
		System.out.println("Execute this test only in MAC machine");
	}
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void conditionOnOS2() {
		System.out.println("Execute this test only in WINDOWS machine");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	public void conditionOnJRE() {
		System.out.println("Execute this test only for Java 11.");
	}
	
	@Test
	@EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_10)
	public void conditionOnJreRange() {
		System.out.println("Excute this test only for range 8-10");
	}

	@Test
	@EnabledForJreRange(min=JRE.JAVA_12, max=JRE.JAVA_22)
	public void conditionOnJreRange2() {
		System.out.println("Excute this test only for range 12-22");
		
	}
	
	@Test
	@EnabledIfSystemProperty(named="user.dir",matches="C:\\\\Users\\\\USER\\\\git\\\\Java-Study\\\\Java-Study\\\\java_study")
	public void conditionOnSystemProperty() {
		System.out.println(System.getProperty("user.dir"));
	}
}
