package TutorialStringAndArray;

public class ArrayDemo {
	
static int alphbet =0;
static int inte =0;
	
public static void main(String[] args) {
	
	
	String name ="akhi5lesh6";
	
	  boolean flag =false;  //flag =true
	
	for(int i=0;i<name.length();i++){
		
		char ch = name.charAt(i);
		
		if(Character.isDigit(ch)){
			
			
			inte++;
		}
		
       if(Character.isAlphabetic(ch)){
			
    	   alphbet++;
		}
		
	
	}
	
	
	System.out.println(alphbet +"  "+inte);
	
	
}	

}
