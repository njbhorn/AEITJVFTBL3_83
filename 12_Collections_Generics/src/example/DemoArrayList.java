package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DemoArrayList {

	public static void main(String[] args) {
		HashMap<String, ArrayList<Car>> hm = new HashMap<>() ;
		ArrayList<Car> al ;
		
		// Fred has two cars
		al = new ArrayList<Car>() ;
		al.add(new Car ("Ford")) ;
		al.add(new Car ("BMW")) ;
		hm.put ( "Fred", al ) ;
		// Mary has one car
		al = new ArrayList<Car>() ;
		al.add(new Car ("Ford")) ;
		hm.put ("Mary", al ) ;
		
		displayCars ( hm ) ;
		
		addCar ( hm, "Mary", new Car ( "Mercedes")) ;
		
		displayCars ( hm ) ;
		
		addCar ( hm, "Fred", new Car ( "VW")) ;
		
		displayCars ( hm ) ;
		
	}
	
	private static void addCar(HashMap<String, ArrayList<Car>> hm, String key, Car car) {
		hm.get(key).add(car) ;
		
	}

	private static void displayCars(HashMap<String, ArrayList<Car>> hm) {
		Set<String> keys = hm.keySet() ;
		for ( String key : keys ) {
			ArrayList<Car> al = hm.get(key) ;
			System.out.printf("%s :\t", key);
			for ( Car c : al ) {
				System.out.printf("%s\t",c.getModel() );
			}
			System.out.printf("\n");
		}
		
	}

	static class Car {
		String model ;
		
		Car ( String model ) {
			this.model = model ;
		}
		
		String getModel () {
			return this.model ;
		}
	} 
}


