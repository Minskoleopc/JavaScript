
public class dayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonB  amol  = new PersonB("amol","rao");
		amol.displayName();
		
	}
	
}

class PersonB {

	String firstName;
	String lastName;
	
	public PersonB(String fn , String ln){
			this.firstName = fn;
		    this.lastName = ln;
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

