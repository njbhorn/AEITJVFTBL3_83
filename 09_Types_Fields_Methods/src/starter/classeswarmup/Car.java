package starter.classeswarmup;

public class Car {
	
	private String model ;
	private int numDoors ;
	
    // author a constructor that receives a model and stores it
    
	public Car(String model) {
		this ( model, 5) ;
	}
	
	public Car ( String model, int numDoors ) {
		this.model = model;
		this.numDoors = numDoors ;
	}
    public String getModel()
    {
        return model ;
    }
    
    public static String getDVLALocation () {
    	return "Swansea" ;
    }

	@Override
	public String toString() {
		return "Car [model=" + model + ", numDoors=" + numDoors + "]";
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
}
