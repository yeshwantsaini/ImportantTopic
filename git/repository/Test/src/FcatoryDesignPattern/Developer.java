package FcatoryDesignPattern;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Getting tightly coupled so to make it loosely couple we have to make a factory class 
//		which will return the object of an class based on input
		Employee employee = new AndroidDeveloper();
		
		Employee employee1  = DeveloperFactory.getEmployee("Web developer");
		System.out.println(employee1.salary());

	}

}
