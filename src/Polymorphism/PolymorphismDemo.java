package Polymorphism;

public class PolymorphismDemo {

int b=10;
	
	public static void main(String[] args) {

     // One name many form
				

	}
	public void sum(int b, String a){ // overloaded: static
		System.out.println(++b);
	 }
	public void sum(String b, int x){ // overloaded : 
		// a+b 
	 }
	
	 int sum(int a){ // overloading
		// a+a+a; 
		 return 1;
	 }
	
	void sum(String a){ // overloading
		 // String +int
	 }
	
	
	
	// overloading , overriding: dynamic
	
	// overloading : can happen in same class : same name but diff parameter
    // overriding  : only happen in child class --> same name and same parameter
}

class A{
	
	public Object sum(){// overriden
		return "Akhilesl";
	}
	
  
}

class B extends A{
	
  public String sum(){ // overriding
	  return "Akhilesh Gupta";
	}
	public void sum(int a){
		
	}
}

