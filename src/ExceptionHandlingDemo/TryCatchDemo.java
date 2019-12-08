package ExceptionHandlingDemo;

import java.io.IOException;
import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {


		try{
		int c =10/0;
		Scanner input=null;
		input.next();
		// file reading code
		System.out.println("Hi Try");
		}
		catch(ArithmeticException he){
			System.out.println("Devided by zero");
		}
		catch(NullPointerException y){
			System.out.println("Object Not initalzated");
		}
		catch(Exception h){
			System.out.println("Some issue but need to check");
		}
		finally{
			System.out.println("Hi Finaly");
		}
		
		System.out.println("Hi Outside");
		
		

	}

}
