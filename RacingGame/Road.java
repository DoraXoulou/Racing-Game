// Xoulou Theodora, 4452


import java.util.Random;

public class Road {
	 private int km;
	 private boolean hasTurns;
	 
	public Road(int km) {
		 this.km = km;
		 this.hasTurns = new Random().nextBoolean();
		
		 
	 }
	 
	public int getKm() {
		 return km;
	 }
	 
	public boolean hasTurns() { //change to getHasTurns
		 return hasTurns;
	 }
	 
	public void setKm(int km) {
		 this.km = km;
		 
	 }
	 
	public void setHasTurns(boolean hasTurns) {
		 this.hasTurns = hasTurns;
	 }
	 
	public int getType() {
		 return 0;
	 }
	 
	public String toString() {
		 return ( km + " km. Has Turns: " + hasTurns);
	 }
	 
	public double updateConsumptionFactor(double fuelConsumptionFactor) {
		 if (hasTurns) {
			fuelConsumptionFactor *= 1.1;
		 }
		 return fuelConsumptionFactor;
	 }
	 
	 
	 

}
