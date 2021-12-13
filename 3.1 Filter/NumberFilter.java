
public class NumberFilter implements StringFilter {

	public void alphanumericFilter(String characters) {
		// TODO Auto-generated method stub
		String numberOnly = characters.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);
		
	}

}