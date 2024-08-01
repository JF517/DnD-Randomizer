
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Class: Character
 * @author J Freyne
 * Purpose: Encapsulates the functionality of creating, updating, and displaying a D&D player character.
 */
public class Character {

	private ClassHandler setClass;
	private StatHandler stats;
	private String bigClass;
	private String subClass;
	private int level;
	private RaceHandler raceHandler = new RaceHandler();
	private String race;
	private String encodedChar;

	/**
	 * Creates a new Character with random values for race, class, stats, and level.
	 */
	public Character() {

		this.raceHandler = new RaceHandler();
		this.setClass = new ClassHandler();
		this.stats = new StatHandler();
		this.encodedChar = "";

		stats.setAll(stats.initStatList());

		this.race = raceHandler.initRace();
		this.bigClass = setClass.initBigClass();
		this.subClass = setClass.initSubClass();
		this.level = setClass.initStartLevel();

		stats.doRaceStats(race);
		stats.doASI(level);

		encodeCharacter();
	}

	/**
	 * Prints the character's level, race, class, and stats to standard output.
	 */
	public void displayChar() {
		System.out.println("Lvl " + level + " " + race + " " + subClass + " " + bigClass);
		System.out.println();
		System.out.println("Str: " + stats.str + " Dex: " + stats.dex + " Con: " + stats.con);
		System.out.println("Int: " + stats.intel + " Wis: " + stats.wis + " Cha: " + stats.cha);
		System.out.println();
	}

	public int getRaceIndex() {
		return this.raceHandler.getRaceIndex();
	}

	public int getSubRaceIndex() {
		return this.raceHandler.getSubRaceIndex();
	}

	public int getBigClassIndex() {
		return this.setClass.getBigClassIndex();
	}

	public int getSubClassIndex() {
		return this.setClass.getSubClassIndex();
	}

	public String getStatCode() {
		return this.stats.getStats();
	}
	
	public String encodeCharacter() {
		String code = 
			this.level + ":" +
			this.raceHandler.getRaceIndex() + ":" +
			this.raceHandler.getSubRaceIndex() + ":" +
			this.setClass.getBigClassIndex() + ":" +
			this.setClass.getSubClassIndex() + ":" +
			this.stats.getStats();
		
		this.encodedChar = code;
		return code;	
	}

	//Debug Commands
	
	public void displaySortedStats() {
		System.out.println(stats.statSort());
	}

	// public void saveToFile() {
	// 	 try{
	// 	BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\J\\Programming\\DnD-Randomizer\\Saved Chars.txt", true));
	// 	writer.append("Lvl " + level + " " + race + " " + subClass + " " + bigClass + "\n");
	// 	writer.append("\n");
	// 	writer.append("Str: " + stats.str + " Dex: " + stats.dex + " Con: " + stats.con + "\n");
	// 	writer.append("Int: " + stats.intel + " Wis: " + stats.wis + " Cha: " + stats.cha + "\n");
	// 	writer.append("\n");
	// 	writer.close();
	// 	}
	// 	catch(IOException e){
	// 		e.printStackTrace();
	// 	}
	// }

	public void saveToFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\J\\Programming\\DnD-Randomizer\\Saved Chars.txt", true));
	 		writer.append(this.encodedChar + "\n");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
