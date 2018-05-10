
public class SubstitutionCipher implements MessageEncoder {

	@Override
	public String encode(String plaintext) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int shift;
	
	public SubstitutionCipher(int s) {
		s = shift;
	}
	
	public void encodeShift(char plaintext) {    // method shifts a single character
		char character = plaintext;
		character = (char) (((character - 'a' + 1) % 26) + 'a');
		System.out.println(character);
	}

}
