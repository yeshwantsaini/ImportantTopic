package DesignPattern.sinletonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonImpl {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		SingletonPattern singletonPattern1 = SingletonPattern.getSingletonPattern();
		
		System.out.println(singletonPattern1.hashCode()); 
		
        Constructor<SingletonPattern> constructor = SingletonPattern.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonPattern singletonPattern2 = constructor.newInstance();
        System.out.println(singletonPattern2.hashCode());
        
        
        
        

	}

}
