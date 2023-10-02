package java_study;

interface Calculable{
	double PI=3.14;
	int sum(int v1, int v2);
}

interface Printable{
	void print();
}


class AdvancedPrintable implements Printable{

	@Override
	public void print() {
		
		
	}
	
}
class RealCal implements Calculable,Printable{
	@Override
	public int sum(int v1,int v2) {
		
		return v1+v2;
	}

	@Override
	public void print() {
		System.out.println("this is real cal");
		
	}
}


class DummyCal implements Calculable{
	public int sum(int v1,int v2) {
		return 3;
	}
}


public class InterfaceApp {

	public static void main(String[] args) {
		
		RealCal realcal = new RealCal();
		System.out.println(realcal.sum(1, 2));
		realcal.print();
		System.out.println(realcal.PI);
		
		Calculable calculable = new RealCal();
		System.out.println(calculable.sum(1, 2));
		//calculable.print();
		System.out.println(calculable.PI);
		
		Printable printable = new RealCal();
		//System.out.println(printable.sum(1, 2));
		printable.print();
		//System.out.println(printable.PI);
		
	}

}
