// Xoulou Theodora, 4452


public class Racer {
	
	
	private String participantName;
	
	private Vehicle vehicle;
	
	private double totalTime;
	
	public Racer(String participantName, Vehicle vehicle) {
		this.participantName = participantName;
		this.vehicle = vehicle;
		this.totalTime = 0.0; 
	}
	
	public String getParticipantName() {
		return participantName;
	}
	
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public double getTotalTime() {
		return totalTime;
	}
	
	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	public double getFuel(){
		return getVehicle().getFuel();
	}
	
	
	public void race(Road road){
		double fuelToUse = getFuel();
		double raceTime = getVehicle().race(road, fuelToUse);
		totalTime += raceTime;
	}

	
	public void refuel() {
		getVehicle().refuel();
	}
	
	
	@Override
	public String toString() {
		return "Participant Name: " + participantName + "\nTotal Time: " + totalTime + "\n" +vehicle.toString();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	


