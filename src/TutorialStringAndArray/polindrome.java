package TutorialStringAndArray;

public class polindrome {
	
	public static void main(String[] args) {
		
		int a =12345;    //a=1
		
		int newRevNum =0;  //newRevNum =2
		
		while(a>0){
			
			
			int x = a%10;    //x=2
			
			newRevNum = newRevNum*10 +x;
		      a=a/10;        //a =1
			
			
			
		}
		
		
		System.out.println(newRevNum);
		
		
	}

}
