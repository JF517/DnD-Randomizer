import java.util.ArrayList;
import java.util.Random;

public class LevelHandler {

	private ArrayList<Integer> subClassLevels;
	String bigClass;
	private Reader reader;
	private int charLevel;
	private Random rand;

	LevelHandler(String bigClass) {
		this.bigClass = bigClass;
		this.reader = new Reader();
		this.subClassLevels = new ArrayList<Integer>(0);
		this.charLevel = 0;
		this.rand = new Random();
	}
	LevelHandler(){
		this.bigClass = "";
		this.charLevel = 0;
		this.rand = new Random();
	}

	public int initStartLevel() {
		this.charLevel = 1 + rand.nextInt(20);
		return charLevel;
	}

	public int getLevel() {
		return charLevel;
	}
//TODO: This is code I wrote not realizing it was not needed, but I like it and might use it later, but as of right now it is unused
//	public ArrayList<Integer> initLevelUp() {
//		String lvlSetRaw = "";
//		String[] allClasses = reader.runReadFile("allClass").split("-");
//		for (int i = 0; i < allClasses.length; i++) {
//			if (allClasses[i].contains(bigClass)) {
//
//				lvlSetRaw = allClasses[i].substring(bigClass.length());
//
//			}
//		}
//		String[] levels = lvlSetRaw.split(",");
//		for (int i = 0; i < levels.length; i++) {
//			int toInt = Integer.parseInt(levels[i]);
//			this.subClassLevels.add(toInt);
//		}
//		return subClassLevels;
//	}

}
