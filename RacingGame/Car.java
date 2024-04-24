// Xoulou Theodora, 4452
public class Car extends Vehicle {
	private static final double [] carFactors = {0.1, 0.35, 0.45};
	public Car() {
		super("Car", 0);
	}
	
	@Override
	public double computeConsumptionFactor(Road road) {
		int roadType = road.getType();
		double fuelConsumptionFactor = road.updateConsumptionFactor(carFactors[roadType]);
		return fuelConsumptionFactor;
	}
			
				
	
}
	