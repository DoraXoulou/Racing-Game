// Xoulou Theodora, 4452


public class Motorbike extends Vehicle {
	private static final double [] motorbikeFactors = {0.05, 0.4, 0.5};
	public Motorbike() {
		super("Motorbike", 0);
	}
	
	@Override
	public double computeConsumptionFactor(Road road) {
		int roadType = road.getType();
		double fuelConsumptionFactor = road.updateConsumptionFactor(motorbikeFactors[roadType]);
		return fuelConsumptionFactor;
	}
			
				
	
}
	
	
			
		

	


