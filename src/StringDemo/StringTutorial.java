package StringDemo;

public class StringTutorial {
	
	int a=10;

	public static void main(String[] args) {


		String abc = new String("Akhilesh");  // heap + String const pool
		
		String bat = new String("Akhilesh");
		
		String xyz = "Akhilesh"; //String const pool
		
		String rat = "Akhilesh"; 
		
		StringBuffer chat = new StringBuffer("Akhilesh"); 
		
		
		if(bat==abc){
			
			//System.out.println(" Both are same using == opr");
			
		}
		
       if(abc.equals(bat)){
    	   
    	   //System.out.println(" Both are same using equal method");
			
		}
       
       rat = rat.concat("Gupta");
       
       chat.append("Gupta");
       
      // System.out.println(rat);
       
       //System.out.println(chat);
		
		
		//System.out.println(rat.length());
		
		//System.out.println(rat.substring(rat.length()-5));
		//System.out.println(rat.charAt(0));
		//System.out.println(rat.substring(0,1));
		
		/*for(int i=1; i<5 ;i++){
			
			for(int j=0;j<i;j++){
				
			    System.out.print("*");
			    
			}
			
			System.out.println();
		}*/
       
       /*for(int i=1; i<=10 ;i++){
			
			for(int j=1;j<=10;j++){
				
			    System.out.print(i*j+" ");
			}
			
			System.out.println();
		}*/
       
       
       for(char i='a';i<='z';i++){
    	   System.out.print(i+" ");
       }
     
	}
	
	

}
