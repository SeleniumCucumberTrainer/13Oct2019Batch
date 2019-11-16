package ArrayDemo;

import java.util.Arrays;

public class ArrayTutorial {

	public static void main(String[] x) {
		
		
		int a =10;
		int b =20;
		int c =30;
		int d =40;
		
		final int AGE =10;
		
		
		int[] arr1  = new int[3];
		
		String[]  stringArray = new String[20];
		
		
		arr1[0]  = 10;
		arr1[1]  = 20;
		arr1[2]  = 30;
		
		
		
		for(int i=0;i<arr1.length;i++){
			
			//System.out.println(arr1[i]);
			
		}
		
		
		
		int[] arr2  = {11,21,31,41};
		
		int arr4 []  = {};
		
        for(int i=0;i<arr2.length;i++){
			
        	//System.out.println(arr2[i]);
			
			
			if(arr2[i]%2==0){
				
				//arr2[i] = arr2[i]*arr2[i];
				
			}
			
			//System.out.println(arr2[i]);
			
		}//{1,4,3,16};
		
		
		String[] abc = {"Akhilesh","Ram","sita","Lux","Sita"};
		
		
		 String y =abc[0];
		
		
		for(int i=0;i<abc.length;i++){
			
			if(abc[i].equalsIgnoreCase("siTa")){
				
				abc[i] = "Sita Kumari";
			}
			
			//System.out.println(abc[i]);
		}
		
		
		
		
		int[] xyz = {1,2,3,4,};
		
		int[] xy1 = new int[5];
		
		//System.out.println(abc.length);
		//System.out.println(xyz.length);
		
		
		int[] re = {4,5,6,7,8}; //{8,7,6,5,4}
		
		System.out.println(Arrays.toString(re));
		
		/*int temp = re[0]; //4
		int temp2 =re[1];
		
		re[1]  = re[2];	
		
		re[2]  = temp2;
		re[0]=re[3];      // 7
		
		re[3] =temp;*/
		
		
		for(int i=0;i<re.length/2;i++){
			
			int temp = re[i];     //5
			
			re[i] = re[re.length-1-i];    // re[1] = re[2]
			
			re[re.length-1-i] =temp;      // re[2] = 5;
			
		}
		
		System.out.println(Arrays.toString(re));
        

	}
	

}
