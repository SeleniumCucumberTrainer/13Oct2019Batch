package ExceptionHandlingDemo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		

    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter value of a");
    
    int a = input.nextInt();
    
    System.out.println("Please enter value of b");
    
    int b = input.nextInt();
    
   System.out.println(a);
    
    System.out.println(b);
    
        int c=0;
        int d=0;
		try{
			try{
		 c =a/b;  //critical stm
			}catch(Exception abc){
				
				System.out.println(abc.getStackTrace());
			}
			try{
		 d =b/0;
			}catch(Exception e){
				System.out.println(e.getMessage());
				
			}
		}
		catch(Exception t){
			System.out.println("Hi you have devided with wrong/Zero");
			  System.out.println("Please enter value of b");
			    
			    b = input.nextInt();
			    try{
			   c =a/b; 
			    }catch(Exception y){
			    	System.out.println("Hi you have again devided with wrong/Zero");
			    }
		}
		
        System.out.println(c);
	}

}
