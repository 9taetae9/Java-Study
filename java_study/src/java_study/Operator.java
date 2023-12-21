package java_study;


class Hello{
	//해당 배열에 들어있는 숫자들은 오직 한 숫자를 제외하고는 모두 두번씩 들어있다.
	//오직 한번만 등장하는 숫자를 찾는 코드를 작성하라. => xor 사용 ! 짝수번씩 들어있는 숫자들은 모두 0이됨.
	private int [] numbers;
	int solution(int [] numbers) {
		int result=0;
		for(int number : numbers) {
			result ^=number; //xor 연산 부호 비트가 같으면 0 다르면 1
		}
		return result;
	}
}
public class Operator {
	
	public static void main(String[] args) {
		Hello hello = new Hello();
		int result=hello.solution(new int[] {5,5,4,4,3,3,2,2,1});
		System.out.println(result);
		
		
		double pi = 3.141592;
		
		double shortPi1=(int)(pi*100*0.5)/100.0;
		double shortPi2=Math.round(pi*100)/100.0;
		
		System.out.println(shortPi1); //3.14
		System.out.println(shortPi2); //3.14
		
		//중간 값 구하기
		int start = 2_000_000_000;
		int end = 2_100_000_000;
		int mid = (start + end)/2; //오버플로우 발생
		System.out.println(mid);
		//위처럼 중간값을 구하는 방식은 괄호 안 계산에서 오버플로우 날 가능성이 있다.
		
		//쉬운 해결법
		mid = start + (end - start) /2;
		System.out.println(mid);
		
		//shift 연산자 활용
		mid = (start + end)>>>1; //>>>n : x의 각 비트가 오른쪽으로 n 비트 이동. 빈자리는 0.
		System.out.println(mid);
		
	}

}
