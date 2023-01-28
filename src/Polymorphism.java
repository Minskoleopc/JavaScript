
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a = new Addition();
		a.addtion(12, 13);
		a.addtion(12, 13 ,14);
		a.addtion(12, 13 ,14,15);
		
		AdditionB b  = new AdditionB();
		b.addtion(1, 1, 1 ,1);

	}

	
	// overloading - same class , same methoName , different signature
	// overriding -different class  , same methoName  , same signature
		
	
}

class Addition {
	
	public  void addtion(int x , int y) {
		System.out.println(x+y);
	}
	
	public  void addtion(int x ,int y ,int z) {
		System.out.println(x+y+z);
	}
	
	public  void addtion(int x , int y , int z , int k) {
		System.out.println(x+y+z+k);
	}
}

class AdditionB extends Addition {
	
//	public  void addtion(int x , int y , int z , int k) {
//		System.out.println("hello");
//	}
//	
}





