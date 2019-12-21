package ExceptionHandlingDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowAndThrows {
	

	public static void main(String[] args) throws NullPointerException, FileNotFoundException {
		
		int age =81;
		
		if(age>=18 && age<60){
			
			System.out.println("Eligble for voting");
			
		}
		else if(age>80){
			
			
				new FileInputStream("File path");
			
			
			
			System.out.println("Not Eligble for voting");
		}
		
		else {
			
			throw new NullPointerException("Hi Throw Demo");
			
		}
		
		
		
		
		

	}

}
