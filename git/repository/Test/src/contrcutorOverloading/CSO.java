package contrcutorOverloading;

public class CSO {
	
	static String name;
	static int count = 0;
	
	//it will execute only once when the class is create 
//	no matter how many you are creating instance of an particular class
	static {
//		name = "Rahul";
		count++;
		System.out.println("Inside static block" +  " "+ count );
	}
	
	
//	it will be called everytime when the instance of an class is created
	public CSO() {
		count++;
		
//		this.name = "ashish";
		System.out.println("Inside contructor" + " " + count );
		
	}

}
