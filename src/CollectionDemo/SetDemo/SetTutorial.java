package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTutorial {
	
	public static void main(String[] args) {
		
		//Set<String> abc = new HashSet<String>();
		
		Set<String> abc = new TreeSet<String>();
		
		System.out.println(abc.size());
		
		abc.add("Akhil1");
		abc.add("Akhil");
		abc.add("Akhil4");
		abc.add("Akhil2");
		
		System.out.println(abc.size());
		
		
		for( String x  :  abc ){
			System.out.println(x);
		}
		
		
	}

}
