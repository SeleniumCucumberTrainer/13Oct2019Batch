package javaPratice;

public class Box {
	
	int l;
	int b=20;
	int h=30;
	
	
	Box(int x, int y, int z){
		l=x;
		b=y;
		h=z;
	}
	
	Box(){
		
	}
	

	public static void main(String[] args) {
	
	
	/*System.out.println(new Box().l);
	System.out.println(new Box().b);
	System.out.println(new Box().h);*/
	
	Box smalltifin = new Box(20,30,50);

	System.out.println(smalltifin.l);
	System.out.println(smalltifin.b);
	System.out.println(smalltifin.h);

	
	System.out.println("=====================================");
	
	Box mediumTifin = new Box(60,70,80);
	
	System.out.println(mediumTifin.l);
	System.out.println(mediumTifin.b);
	System.out.println(mediumTifin.h);
	
	
	   Box tinnyBox = new Box();
		
		System.out.println(tinnyBox.l);
		System.out.println(tinnyBox.b);
		System.out.println(tinnyBox.h);
	
	
	
	}
	
    
	

}
