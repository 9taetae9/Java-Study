package java_study;

public class ClassName {
	/*
	 * public class <ClassName>에서 <ClassName>은 소스파일 이름과 일치
	 * 소스파일 1개만 가능
	 * 객체간 역할과 책임, 협력에 따라 객체를 추상화...
	 * 맴버변수
	 * 생성자
	 * 메서드
	 */
}

class ClassName2{//접근 제어자가 package-private(default)일 경우 public class 외 여러개 가능
	//컴파일 시 각 클래스 파일이 따로 생성됨
}
/*톱레벨 클레스(중첩 클래스와 달리 가장 바깥의 클래스)는 접근제어자 public, package-private만 가능
 * public:공개 api가 되며, 클라이언트를 위해 하위 호환 관리 필요
 * package-private: 해당 패키지 내에서만 사용하므로, 클라이언트와 관계 없이 작업 가능
 */


