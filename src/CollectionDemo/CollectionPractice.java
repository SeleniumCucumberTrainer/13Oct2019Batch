package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPractice {
	
	
	
	//collection (I)
	//collections (C)
	
	// ArrayList implements List(I) 
	
	public static void main(String[] args) {
		
	
	List<String> abc = new ArrayList<String>(1);
	
//	abc.add(1);
//	abc.add(2);
	abc.add("Akhi");
	abc.add("Akhil");
	abc.add("Syam");
	
	
	//System.out.println(abc.get(0));
	
	/*for(int i=0;i<abc.size();i++){
		System.out.println(abc.get(i));
	}*/
	
	/*for( String x   :  abc    ){
		System.out.println(x);
	}*/
	
	Iterator<String> iter = abc.iterator();
	
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
	
	
	}
}
