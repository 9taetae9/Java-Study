package java_study;

public class Mainclass {

	public static void main(String[] args) {
		NewClass newClass1 = new NewClass();
		NewClass newClass2 = new NewClass();
		
		newClass1.name_referenceType="newClass1";
		newClass2.name_referenceType="newClass2";
		newClass1.primitiveType=1;
		newClass2.primitiveType=2;
		
		newClass1.printInfo();
		newClass2.printInfo();

		NewClass newClass_Defualt = new NewClass();
		NewClass newClass_justname= new NewClass("Taetae");
		NewClass newClass_justtype= new NewClass(10);
		
		newClass_Defualt.printInfo();
		newClass_justname.printInfo();
		newClass_justtype.printInfo();
	}
	
	static class NewClass{
		String name_referenceType;
		int primitiveType;
			
		// Default constructor
	    NewClass() {
	        this("No name", 0); // Calls the parameterized constructor with default values
	    }

	    // Constructor with just a name
	    NewClass(String name) {
	        this(name, 0); // Default value for primitiveType
	    }

	    // Constructor with just a type
	    NewClass(int type) {
	        this("No name", type); // Default value for name_referenceType
	    }

	    // Parameterized constructor
	    NewClass(String name, int type) {
	        this.name_referenceType = name;
	        this.primitiveType = type;
	    }
	    
		public void printInfo() {
			System.out.println("------" + this.name_referenceType+ "------");
			System.out.println(this.name_referenceType+ " : "+this);
			System.out.println(this.name_referenceType+ ".name_referenceType : "+Integer.toHexString(name_referenceType.hashCode()));
			System.out.println(this.name_referenceType+".primitiveType : "+primitiveType);
		}
	}

}
