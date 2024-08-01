import java.util.ArrayList;
import java.util.Random;

public class RaceHandler {

	private ArrayList<String> subRaces;
	private Random rand;
	private Reader reader;
	private String raceData;
	private String race;
	private String[] statMods;
	private int raceIndex;
	private int subRaceIndex;

	public RaceHandler() {

		this.raceData = " ";
		this.race = " ";
		this.statMods = new String[2];
		this.subRaces = new ArrayList<String>();
		this.rand = new Random();
		this.reader = new Reader();
		this.raceIndex  = 0;
		this.subRaceIndex = 0;

	}

	public String initRace() {

		String[] allRaces = reader.runReadFile("allRaces").split("-");
		int randIndex = rand.nextInt(allRaces.length);
		this.race = allRaces[randIndex];
		this.raceIndex = randIndex;
		// parseRaceData();
		return race;
	}

	public String initSubRace() {
		String subRace = "";
		int randIndex = rand.nextInt(subRaces.size());
		subRace = subRaces.get(randIndex);
		this.subRaceIndex = randIndex;
		return subRace;
	}

	public int getRaceIndex() {
		return this.raceIndex;
	}

	public int getSubRaceIndex() {
		return this.subRaceIndex;
	}

//	public void parseRaceData() {
//		int breakIndex = 0;
//		int subClassIndex = 0;
//		for (int i = 0; i < raceData.length(); i++) {
//			if (raceData.charAt(i) == '|') {
//				breakIndex = i;
//			}
//
//			else if (raceData.charAt(i) == '{') {
//				subClassIndex = i;
//			}
//		}
//		this.race = raceData.substring(breakIndex, subClassIndex);
//		String[] statMods = raceData.substring(0, breakIndex).split("|");
//		this.statMods = statMods;
//		String[] subraces = raceData.substring(subClassIndex).split("/");
//		for (int i = 0; i < subraces.length; i++) {
//			this.subRaces.add(subraces[i]);
//		}
//	}
}
