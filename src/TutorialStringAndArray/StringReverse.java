package TutorialStringAndArray;

public class StringReverse {
	
	

	public static void main(String[] args) {

       
		String input ="Akhilesh";
		
		//String output ="hselihkA";
		
		String output ="";//hs
		
		
		for(int i=input.length()-1;i>=0;i--){
			
			char ch = input.charAt(i);
			output  = output+ch;
			
		}
		
		System.out.println(output);  
	}

}
