package CollectionDemo.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapTutorial {

	public static void main(String[] args) {


		Map<Integer,String>  abc = new HashMap<Integer,String>();
		
		
		abc.put(1001,"Akhilesh1");//entry
		abc.put(1004,"Akhilesh1");//entry
		abc.put(1009,"Akhilesh3");//entry
		abc.put(1010,"Akhilesh4");//entry
		
		//System.out.println(abc.size());
		
		Set<Integer> xyz = abc.keySet();
		
		//Set<Integer> ret = new TreeSet(xyz);
		
		for(int a : xyz){
			
			//System.out.println(a+"   ====   "+abc.get(a));
			
		}
		
		
		
		Collection<String> tap = abc.values();
		
		/*for( String y   :  tap){
			
			System.out.println(y);
			
		}*/
		
		/*System.out.println(abc.get(1));
		
		for(int i=1;i<abc.size();i++){
			
			
		}
*/
		
		Set<Entry<Integer,String>> bcd = abc.entrySet();
		
		for(Entry<Integer,String>  r  :  bcd){
			System.out.println(r.getKey() +"   "+r.getValue());
		}
		
	}

}
