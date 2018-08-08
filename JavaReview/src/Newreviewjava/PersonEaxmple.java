package Newreviewjava;

public class PersonEaxmple {

	public static void main(String[] args) {
		Personutil Personutil = new Personutil();
		person person = new person();
		
		person.name="babrak";
		person.age= 20;
		
		Personutil.printPerson(person);
		System.out.println("name" +person.name + "age" +person.age);
		
		

	}

}
