package java_study;

class Cal{
	int v1,v2;
	Cal(int v1, int v2){
		System.out.println("Cal init!!");
		this.v1=v1; this.v2=v2;
	}
	
	public int sum() {return this.v1+v2;}
}

class Cal3 extends Cal{
	Cal3(int a,int b){
		super(a,b);
		System.out.println("Cal3 init!!");
	}
	public int sub() {return this.v1-v2;}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c1 = new Cal(2,1);
		Cal3 c3 = new Cal3(4,5);
		System.out.println(c3.sum());
		System.out.println(c3.sub());
	}

}