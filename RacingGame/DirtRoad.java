// Xoulou Theodora, 4452

import java.util.Random;

public class DirtRoad extends Road {
	
	private double levelOfRain;
	
	public DirtRoad(int km) {
		super(km);
		this.levelOfRain = new Random().nextDouble();
	}
	
	public double getLevelOfRain() {
		return levelOfRain;
	}
	
	@Override
	public double updateConsumptionFactor(double fuelConsumptionFactor) {
		double fuelConsumptionFactor2 = super.updateConsumptionFactor(fuelConsumptionFactor);
		
		if(levelOfRain >= 0.8 && levelOfRain <= 1.0) {
			fuelConsumptionFactor2 *= 1.2;
		} else if (levelOfRain > 0.5 && levelOfRain < 0.8) {
			fuelConsumptionFactor2 *= 1.1;
		}
		
		return fuelConsumptionFactor2;
		
	}
	
	@Override
	public String toString() {
		return(super.toString() +"\n Type: DirtRoad, " + "Level of rain: " + levelOfRain);
	}
	
	@Override
	public int getType() {
		return 1;
	}
	
	

}






