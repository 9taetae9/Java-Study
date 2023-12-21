package java_study;

import java.math.*;

public class FloatingPoint {
	public static void main(String[] args) {
		
		double doubleNum=0.1;
		for(int i=1; i<10; i++) {
			doubleNum+=0.1;
		}
		
		System.out.println(doubleNum);//
		
		BigDecimal bigDecimalNum = new BigDecimal("0.1");
		for(int i=1; i<10; i++) {
			bigDecimalNum= bigDecimalNum.add(new BigDecimal("0.1"));
		}
		System.out.println(bigDecimalNum);
	}
	/*결과
	 * doubleNum: 0.9999999999999999/ 
	 * => 부동 소수점 방식 이용시 지수로 표현되는 값이 0을 나타낼수 없으므로 약간의 오차발생.
	 * bigDecimalNum : 1.0 => 정확한 실수 계산
	 */
}

