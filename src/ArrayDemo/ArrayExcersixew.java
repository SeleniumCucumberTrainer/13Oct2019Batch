package ArrayDemo;

import java.util.Arrays;

public class ArrayExcersixew {
	
	
	
	public static void main(String[] args) {
		
		int arr [] = new int[5];
		
		int count =1;
		
		for(int i=0;i<arr.length;i++){
			
			arr[i]=count;
			
			count++;
			
		}
		
		arr[2]=6;
		System.out.println(Arrays.toString(arr));
		
	}

}
