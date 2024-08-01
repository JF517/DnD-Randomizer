
import java.util.Random;

public class ClassHandler {

	String bigClass;
	private Reader reader;
	private Random rand;
	private int subClassLevel;
	private LevelHandler levelHandler;
	private int atLevel;
	private int bigClassIndex;
	private int subClassIndex;

	public ClassHandler() {
		this.bigClass = "";
		this.reader = new Reader();
		this.rand = new Random();
		this.levelHandler = new LevelHandler();
		this.atLevel = levelHandler.initStartLevel();
		this.subClassLevel = 0;
		this.bigClassIndex = 0;
		this.subClassIndex = 0;
	}

	public String initBigClass() {

		String[] allClasses = reader.runReadFile("allClass").split("-");
		int randIndex = rand.nextInt(allClasses.length);
		String cl = String.valueOf(allClasses[randIndex].charAt(0));
		this.subClassLevel = (Integer.parseInt(cl));
		String output = allClasses[randIndex].substring(1);
		this.bigClass = output;
		this.bigClassIndex = randIndex;
		return output;

	}

	public String initSubClass() {
		if (this.subClassLevel > this.atLevel) {
			return "";
		} else {
			String inputFile ="/Classes/" + bigClass + "/subClass";
			String[] allSubs = reader.runReadFile(inputFile).split("-");
			int randIndex = rand.nextInt(allSubs.length);
			this.subClassIndex = randIndex;
			return allSubs[randIndex];
		}
	}

	public void setSubClassLevel(int intake) {
		this.subClassLevel = intake;
	}
	public int getSubClassLevel() {
		return this.subClassLevel;
	}

	public int initStartLevel() {
		this.atLevel = levelHandler.initStartLevel();
		return levelHandler.initStartLevel();
	}

	public int getBigClassIndex(){
		return this.bigClassIndex;
	}

	public int getSubClassIndex() {
		return this.subClassIndex;
	}
	
	public int getAtLevel(){
		return this.atLevel;
	}
}
