// Xoulou Theodora, 4452

import java.util.Scanner;

public class HumanRacer extends Racer{
	
	private Scanner scanner;

	public HumanRacer(String participantName, Vehicle vehicle) {
		super(participantName, vehicle);
		scanner = new Scanner(System.in);
	}

	@Override
	public double getFuel(){
		System.out.println("Enter the amount of fuel to use: ");
		double fuelToUse = scanner.nextDouble();
		return fuelToUse;
	}

}
