package javaPratice;

public class MethodReturnType {

	public static void main(String[] args) {
		
		MethodReturnType abc = new MethodReturnType();
		
		String s = abc.getName("Akhilesh");
		
		System.out.println(s);
		
		String y  = abc.getCityName("Gorakhpur", 273002);
		
		System.out.println(y);
		
		
		
		
		
		int x   = abc.sqrt(16);
		
		
		int r = (int) Math.sqrt(16);
		
		
		//System.out.println(r);
		
		//System.out.println(x);
		
		
	}
	
	public int sqrt(int a){
		
		return a/4;	
	}
	
public String getName(String name){
		
		return name+" Gupta";
		
	}
	

public String getCityName(String cityName, int pinCode){
	
	
	return cityName+pinCode;
}

public void getAddress(){
	
	
	return;
}

}
