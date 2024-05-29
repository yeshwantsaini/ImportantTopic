package DesignPattern.sinletonDesignPattern;

public class SingletonPattern {
	
	private static SingletonPattern singletonPattern;
	
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getSingletonPattern() {
		
		
		if(singletonPattern == null) {
			
//			synchronized (singletonPattern) {
				singletonPattern = new SingletonPattern();
//			}
			
			 
		}
		
		return singletonPattern;
	}

}
