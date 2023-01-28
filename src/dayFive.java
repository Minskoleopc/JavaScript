
public class dayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father shirish = new Father("Manohar","Deshpande","Shirish");
		shirish.displayName();
		
	}
	
	
	
}

class GrandFather {
	
	String firstName;
	String lastName;
	public GrandFather(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName =  lastName;
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}

class Father  extends GrandFather{
	
	String ffirstName;
	public Father(String firstName , String lastName ,String ffirstName) {
		super(firstName,lastName);
		this.ffirstName = ffirstName;
	}
	
}




