package ArrayDemo;

public class InheritancePractice {

	public static void main(String[] args) {

      B abc = new B();
      
   
      
      A xyz = new B();
           
	}

}

class A{
	
	public void sum(){
		System.out.println("Sum A");
	}
	
	
}
class B  extends A{
	public void sum(){
		System.out.println("Child B");
	}
	
	public void sumOne(){
		System.out.println("SumOne");
	}
	
}
class C  extends  A{

	public void sum(){
		System.out.println("Child C");
	}
	
}
