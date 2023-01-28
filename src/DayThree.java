
public class DayThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hard coded values
//		Person chinmay = new Person();
//		System.out.println(chinmay.firstName);
//		System.out.println(chinmay.lastName);
//		chinmay.displayName();
//		
//		Person poorva = new Person();
//		System.out.println(poorva.firstName);
//		System.out.println(poorva.lastName);
//		poorva.displayName();
//		
//		poorva.firstName = "poorva";
//		poorva.lastName = "vyas";
//		poorva.displayName();

		// using constructor
//		PersonB mayuri = new PersonB("mayuri","rao");
//		mayuri.displayName();
//	
//		PersonB chinmay = new PersonB("chinmay","deshpande");
//		chinmay.displayName();

		// using get and get method
		
		PersonC amol = new PersonC();
		amol.setFirstName("amol");
		amol.setLastName("rao");
		amol.displayName();
	}

}

class PersonC {

	String firstName;
	String lastName;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

//class PersonB {
//	String firstName;
//	String lastName ;
//	
//	public PersonB(String fn , String ln) {
//		this.firstName = fn;
//		this.lastName = ln;				
//	}
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//		
//}

//class Person {
//	
//	String firstName = "chinmay";
//	String lastName = "deshpande";
//	
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//}