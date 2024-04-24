// Xoulou Theodora, 4452

public class RacingGame {
    
    public static void main(String[] args){
        
        RaceTrack raceTrack = new RaceTrack(10);
        RaceParticipants raceParticipants = new RaceParticipants();

        int startIndex = 0;
        //while-loop until the track is reached
        while (!raceTrack.reachedEnd(startIndex)) {
            System.out.println("Remaining track: ");

            raceTrack.printRemainingTrack(startIndex);

            raceParticipants.refuelTheVehicles();

            

            for (Racer racer : raceParticipants.getParticipants()) {
                racer.race(raceTrack.nextSegment(startIndex));
            }

            System.out.println("Vehicle status: ");
            raceParticipants.printResults();

            startIndex++;
        }

        System.out.println("Race is over! ");
        System.out.println("The winner is: " + raceParticipants.getWinner());
    }
}
