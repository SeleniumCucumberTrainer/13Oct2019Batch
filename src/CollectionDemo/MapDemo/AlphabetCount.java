package CollectionDemo.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCount {

	public static void main(String[] args) {

		Map<Character, Integer> abc = new HashMap<Character, Integer>();

		String name ="abcdababcdef";
		
		char[]  allChar = name.toCharArray();
		
		for( char r  : allChar  ){
			
			if(abc.containsKey(r)){
				
				int y = abc.get(r);
				
				abc.put(r, y+1);
				
			}
			else{
				abc.put(r, 1);
			}
			
			
		}
		
		
		
		
		System.out.println(abc);
		
		
		

	}

}
