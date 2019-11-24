package Encapusation;

public class Encapsulation {
	
	private int balance =10000;
	
	private String name ="Akhilesh";
	
	//
	
	public int getBalance(){	
		return balance;
	}
	
    public void setBalance(int newAmmount){
		balance = newAmmount;
	}
    
    public String getName(){
    	return name;
    }
    
    public void setName(){
    	name ="Akhilesh Gupta";
    }
    
    public static void main(String[] args) {
		
    	Encapsulation abc = new Encapsulation();
    	
    	System.out.println(abc.getBalance());
    	abc.setBalance(200000);
    	System.out.println(abc.getBalance());
	}

}
