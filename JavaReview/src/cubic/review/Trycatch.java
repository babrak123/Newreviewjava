package cubic.review;

public class Trycatch {

	public static void main(String[] args) {
		/*try {
			
		int marks=100/0;
		System.out.println(marks);
		} catch(ArithmeticException e) {
			System.out.println("100 divided by zero happen"+e);
        	
        }
		         //Rest of the code will print \\
        	System.out.println("my name is babrak");
        	System.out.println("my last name is hamdard");
        }
       }*/
		
		try {
			int marks=10/0;
			System.out.println("marks");
			
			
		}finally {
			System.out.println("finally block always excute no matter whats going on");
		} 
               //Rest of  the code will not print		
		   System.out.println(" i am rest of the code");
		   System.out.println("i am rest of the code");
	    }
        }
                
               
   