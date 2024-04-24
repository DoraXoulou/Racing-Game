// Xoulou Theodora, 4452

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaceParticipants {
    
    private List<Racer> participants;

    private Scanner scanner;

    public RaceParticipants(){
        
        participants = new ArrayList<>();
        scanner = new Scanner(System.in);

        createComputerControlledVehicles();
        createPlayerControlledVehicles();
    }

    public List<Racer> getParticipants(){
        return participants;
    }

    private void createComputerControlledVehicles(){

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleName("Car Computer");
        vehicle1.setFuelRemained(100.0);

        Vehicle vehicle2 = new Motorbike();
        vehicle2.setVehicleName("Computer Motorbike");
        vehicle2.setFuelRemained(100.0);

        Vehicle vehicle3 = new Jeep();
        vehicle3.setVehicleName("Computer Jeep");
        vehicle3.setFuelRemained(100.0);

        participants.add(new Racer("Computer 1", vehicle1));
        participants.add(new Racer("Computer 2", vehicle2));
        participants.add(new Racer("Computer 3", vehicle3));
        
    }

    private void createPlayerControlledVehicles(){
        
        System.out.println("Choose a vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Motorbike");
        System.out.println("3. Jeep");
        
        System.out.println("Enter your choice: ");

        int selection = scanner.nextInt();

        Vehicle vehicle;

        if (selection == 1){
            vehicle = new Car();
            vehicle.setVehicleName("Player Car");
            vehicle.setFuelRemained(100.0);
        } else if (selection == 2){
            vehicle = new Motorbike();
            vehicle.setVehicleName("Player Motorbike");
            vehicle.setFuelRemained(100.0);
        } else if (selection == 3){
            vehicle = new Jeep();
            vehicle.setVehicleName("Player Jeep");
            vehicle.setFuelRemained(100.0);
        } else {
            throw new IllegalArgumentException("Invalid choice. ");
        }

        participants.add(new HumanRacer("Player", vehicle));
        
        //scanner.close();

    }

    public void startRace(Road road) {
        
        for (Racer racer : participants) {
            racer.race(road);
        }
    }

    public void refuelTheVehicles(){
        
        for (Racer racer : participants){
            racer.refuel();
        }
    }

    public void printResults() {
        
        System.out.println("Race Results: ");

        for (int i = 0; i < participants.size(); i++) {
            Racer currentRacer = participants.get(i);
            boolean isFastest = true;

            for (int j = 0; j < participants.size(); j++) {
                Racer otherRacer = participants.get(j);
                
                if (currentRacer != otherRacer && currentRacer.getTotalTime() > otherRacer.getTotalTime()) {
                    isFastest = false;
                    break;

                }
            }

            if (isFastest) {
                System.out.println((i + 1) + ". " + currentRacer.toString());
            }
        }
    }

    public Racer getWinner() {
        Racer winner = participants.get(0);

        for (int i = 1; i < participants.size(); i++){
            Racer currentRacer = participants.get(i);
            if (currentRacer.getTotalTime() < winner.getTotalTime()){
                winner = currentRacer;
            }
        }

        return winner;
    }
}
