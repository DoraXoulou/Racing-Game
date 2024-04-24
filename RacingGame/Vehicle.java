// Xoulou Theodora, 4452

public abstract class Vehicle {
	
	private String vehicleName;
	private double fuel;
	
	public Vehicle(String vehicleName, double fuel) {
		this.vehicleName = vehicleName;
		this.fuel = fuel;
		
	}
	
	public String getVehicleName() {
		return vehicleName;
	}
	
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public void setFuelRemained(double fuel) {
		this.fuel = fuel;
	}
	
	
	public abstract double computeConsumptionFactor(Road road);
	
	
	private double calculateSpeed(double fuel, int km,  double fuelConsumptionFactor) {
		return (fuel / km) / fuelConsumptionFactor;
		
	}
	
	private double calculateTime(int km, double speed) {
		return km / speed;
	}
	
	public double race(Road roadSegment, double fuelToBeConsumed) {
		double speed = calculateSpeed(fuelToBeConsumed, roadSegment.getKm(), computeConsumptionFactor(roadSegment)); //default value for start
	    double time = calculateTime(roadSegment.getKm(), speed);
	    fuel -= fuelToBeConsumed;
		return time;
	    
		
	}
	
	public void refuel() {
		fuel += 10.0;
	}
	
	@Override
	public String toString() {
		return "The name of the vehicle: " + vehicleName + "\nFuel Status: " + fuel;
		
	}
}
