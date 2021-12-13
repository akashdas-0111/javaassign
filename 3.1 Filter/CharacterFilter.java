
public class CharacterFilter implements StringFilter {

	public void alphanumericFilter(String characters) {
		
		String characterOnly = characters.replaceAll("[^A-Za-z]", "");
		System.out.println(characterOnly);
	}

}