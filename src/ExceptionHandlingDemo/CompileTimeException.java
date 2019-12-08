package ExceptionHandlingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class CompileTimeException {
	
	public static void main(String[] args) {
		
		
		File a = new File("C:\\Users\\akhilesg\\Desktop\\FSDFile.txt");
		
		try{
		FileInputStream fis = new FileInputStream(a);
		
		}
		catch(FileNotFoundException t){
			
		}
        catch(IOException t){
			
		}
		catch(Exception t){
			
		}
		
		//Final, finally , finalize
		
		
	}
	

}
