// Xoulou Theodora, 4452

import java.util.Random;

public class RockyRoad extends Road{
	private int roughnessLevel;
	
	public RockyRoad(int km) {
		super(km);
		this.roughnessLevel = new Random().nextInt(3);
	}
	
	public int getRoughnessLevel() {
		return roughnessLevel;
	}
	
	@Override
	public double updateConsumptionFactor(double fuelConsumptionFactor) {
		double fuelConsumptionFactor3 = super.updateConsumptionFactor(fuelConsumptionFactor);
		
		if(roughnessLevel ==2) {
			fuelConsumptionFactor3 *= 1.2;
		} else if (roughnessLevel == 1) {
			fuelConsumptionFactor3 *= 1.1;
		}
		
		return fuelConsumptionFactor3;
		
	}
	
	@Override
	public String toString() {
		return(super.toString() +"\n Type: RockyRoad, Terrain Roughness: " + roughnessLevel);
	}
	
	@Override
	public int getType() {
		return 2;
	}

}
