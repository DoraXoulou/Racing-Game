// Xoulou Theodora, 4452


public class Jeep extends Vehicle {
	private static final double [] jeepFactors = {0.25, 0.3, 0.35};
	public Jeep() {
		super("Jeep", 0);
	}
	
	@Override
	public double computeConsumptionFactor(Road road) {
		int roadType = road.getType();
		double fuelConsumptionFactor = road.updateConsumptionFactor(jeepFactors[roadType]);
		return fuelConsumptionFactor;
	}
			
				
	
}
	