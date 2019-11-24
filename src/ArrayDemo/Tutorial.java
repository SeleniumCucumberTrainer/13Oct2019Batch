package ArrayDemo;

public class Tutorial {
	
	
	static int l = 10; //class variable
	int b = 20;        // instance varib

	public static void main(String[] args) {
		
		
		String name ="Akhilesh";
		String name1 ="Akhiles";
		
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
			
		
		
		
		
		Tutorial.sum();

		Tutorial firstObj = new Tutorial();
		Tutorial.l++;
		firstObj.b++;
		System.out.println(Tutorial.l);
		System.out.println(firstObj.b);
		System.out.println("=====================================");
        Tutorial secondObj = new Tutorial();
        Tutorial.l++;
        secondObj.b++;
        System.out.println(Tutorial.l);
		System.out.println(secondObj.b);
		
		 Tutorial thirdObj = new Tutorial();
		 System.out.println(Tutorial.l);
		 System.out.println(thirdObj.b);
			
	}
	
	public static void sum(){
		
	}

}
