package javaPratice;

public class MethodDemo {

	public static void main(String[] args) {
		
		MethodDemo abc = new MethodDemo();
		
		abc.printName();
		
	}
	
	public  void printName(){
		
		System.out.println("Hi Akhilesh");
		printValue();
	}
	
    public  void printValue(){
		
		System.out.println("Hi Value");
		
		printName();
		
	}
	
	

}
