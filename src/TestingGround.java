import java.util.ArrayList;
public class TestingGround {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			Character r = new Character();
			r.displayChar();
		}
		MiscHandler misc = new MiscHandler();
		ArrayList<String> output = misc.randLang(5);
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}

//		Character r = new Character();
//		r.displaySortedStats();
	}
}
