package Newreviewjava;

public class IoDemo {
    int i;
    
    
    
	
	




	public IoDemo() {
		System.out.println("i value is "+i);
	
	}

	{
		i=258;System.out.println( "is   intance initalizer block get invoked first ..");
	}







	public static void main(String[] args) {
		IoDemo i1= new IoDemo();
		IoDemo i2= new IoDemo();

	}

}
