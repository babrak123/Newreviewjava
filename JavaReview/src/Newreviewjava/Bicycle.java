package Newreviewjava;

public class Bicycle extends Mustang {
	
	@Override
	void run() {
		System.out.println("Bicycle is runs");
	}
	
	public static void main(String[] args) {
	  
		Mustang m=new Bicycle();
		m.run();
      
	}

	
    
		
	}


