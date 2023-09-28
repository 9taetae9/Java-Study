package java_study;

public class ReferenceType {

	public static void main(String[] args) {
		
		class Member{
			private int id;
			private String name;
			
			public Member(int id, String name) {
				this.id=id;
				this.name=name;
			}
		}
		
		int num=10;
		String string = "Reference Type";
		int[] arr = {0,1,2,3,4};
		Member member=new Member(1,"Kim a");
		
		System.out.println("string: "+Integer.toHexString(string.hashCode()));
		System.out.println("arr: "+arr);
		System.out.println("member: "+member);
		/*
	    string: 4f81572f
		arr: [I@3cda1055
		member: java_study.ReferenceType$1Member@7a5d012c */
	}

}
