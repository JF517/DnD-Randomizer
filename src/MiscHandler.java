import java.util.Random;
import java.util.ArrayList;

public class MiscHandler {

	private Random rand;
	private Reader reader;

	public MiscHandler() {

		this.rand = new Random();
		this.reader = new Reader();

	}


	public ArrayList<String> randRecursiveChoiceHelper(int count, ArrayList<String> toPop,
			ArrayList<String> masterList) {
		if (count == 0) {
			return toPop;
		} else {
			int randIndex = rand.nextInt(masterList.size());
			String toAdd = masterList.get(randIndex);
			toPop.add(toAdd);
			masterList.remove(randIndex);
			return randRecursiveChoiceHelper(count - 1, toPop, masterList);
		}
	}

	public ArrayList<String> randLang(int count) {
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<String> masterList = reader.runReadFileWithSplit("allLang");

		return randRecursiveChoiceHelper(count, output, masterList);
	}
	

}
