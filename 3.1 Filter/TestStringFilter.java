
public class TestStringFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFilter sf1 = new NumberFilter();
		StringFilter sf2 = new CharacterFilter();
		
		sf1.alphanumericFilter("Kr1it1i");
		sf2.alphanumericFilter("Kr1it1i");

	}

}