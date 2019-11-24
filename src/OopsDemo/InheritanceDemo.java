package OopsDemo;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		int a =10;
		
		double b = (double)a;

		GrandChild grandchild = new GrandChild();
		
		//grandchild.read()/dance/sing
		
		Child child = new GrandChild();
		
		//child.sing()/dance
		
		Parent parent = new GrandChild();
		
		//parent.sing();
		
		Object object = new GrandChild();
		
		
		grandchild.sing();	
	}
}
class Parent{
	
	public void sing(){
		System.out.println("Singing");
	}
}
class Child extends Parent{
	
	
	
	public void dance(){
		
	}
}
class GrandChild extends Child{
	
	GrandChild(){
		super();
		System.out.println("GrandChild");
		return;
	}
	
    public void read(){
		
	}
	
}
