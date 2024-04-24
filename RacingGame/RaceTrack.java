// Xoulou Theodora, 4452

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceTrack {
	
	private List<Road> trackSections; //trackSegments

	private int size;
	
	public RaceTrack(int size) {
		this.size = size;
		trackSections = new ArrayList<>();
		Random random = new Random();
		
		for(int i = 0; i < size; i++) {
			int roadType = random.nextInt(3);
			int lengthOfSection = random.nextInt(51) + 50;
			
			if (roadType == 0) {
				trackSections.add(new Road(lengthOfSection));
			} else if (roadType == 1) {
				trackSections.add(new DirtRoad(lengthOfSection));
			} else if (roadType == 2) {
				trackSections.add(new RockyRoad(lengthOfSection));
			
				
			}
		}
		
		
	}

	/* Road nextSegment(List<Road> completedSegments) {
		for (Road segment : trackSections) {
			if (!completedSegments.contains(segment)) {
				return segment;
			}
		}
		return null;  
	}*/

	public Road nextSegment(int currentIndex){
		if (trackSections.get(currentIndex) != null){
			return trackSections.get(currentIndex);
		}
		
		return null;
		
	}

	public boolean reachedEnd(int currentIndex){  ///maybe change currentIndex to a private field and not pass as parameter
		return currentIndex == trackSections.size();
	}

	public void printRemainingTrack(int currentIndex) {
		
		//System.out.println("Remaining Track: ");

		for (int i = currentIndex; i < trackSections.size(); i++){
			Road currentSegment = trackSections.get(i);
			System.out.println("Segment " + (i+1) + ": " + currentSegment);
		}
	}

	
	

}
