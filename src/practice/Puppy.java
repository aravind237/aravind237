package practice;

/*public class Puppy {

	public Puppy(String name) {
		System.out.println("Passed Name is :" + name);
	}

	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("tommy");
		
	}
}

*/

/**
 * @author sivakuar
 *
 */
public class Puppy{

	int puppyAge;
	
	public Puppy(String name){
		System.out.println("Name chosen is: "+name);
	}
	
	public void setAge(int age){
		puppyAge=age;
	}
	
	
	public int getAge(){
		System.out.println("Puppy's age is: "+puppyAge);
		return puppyAge;
	}
	public static void main(String[]args){
	Puppy myPuppy=new Puppy("tommy");
	myPuppy.setAge(2);
	myPuppy.getAge();
	System.out.println("Variable value: " +myPuppy.puppyAge);
}
}
	
	