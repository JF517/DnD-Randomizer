import java.util.ArrayList;
import java.util.Scanner;
public class TestingGround {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Character chara = new Character();
		boolean running = true;

		while(running){
			System.out.println("Ready...");

			switch(scanner.nextLine().toLowerCase()){
				case "exit": 
			{
				running = false;
				break;
			}

			case "generate":
			{
				chara = new Character();
				System.out.println("New Character Generated!");
				break;
			}

			case "print":
			{
				chara.displayChar();
				break;
			}

			case "save":
			{
				chara.saveToFile();
				System.out.println("Saved!");
				break;
			}

			case "raceindex":
			{
				System.out.println("Race Index: " + chara.getRaceIndex());
				System.out.println("SubRace Index: " + chara.getSubRaceIndex());
				break;
			}

			case "classindex":
			{
				System.out.println("Class Index: " + chara.getBigClassIndex());
				System.out.println("SubClass Index: " + chara.getSubClassIndex());
				break;
			}

			case "statcode":
			{
				System.out.println(chara.getStatCode());
				break;
			}

			case "encode":
			{
				System.out.println(chara.encodeCharacter());
			}	
			}

		
		}
		scanner.close();

	}
}

// 		for (int i = 0; i < 5; i++) {

// 			Character r = new Character();
// 			r.displayChar();
// 			r.saveToFile();
// 		}
// 		MiscHandler misc = new MiscHandler();
// 		ArrayList<String> output = misc.randLang(5);
// 		for (int i = 0; i < output.size(); i++) {
// 			System.out.println(output.get(i));
// 		}

// //		Character r = new Character();
// //		r.displaySortedStats();

