import java.util.Random;

public class ShuffleCipher implements MessageEncoder {

	@Override
	public String encode(String plaintext) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int n;
	
	public ShuffleCipher(int number) {
		n = number;
	}
	
	public StringBuilder encodeShuffle(String plaintext) {  // method shuffles once
		String p = plaintext;
		StringBuilder word = new StringBuilder(p);
		StringBuilder shuffledWord = new StringBuilder();
		while(word.length()!= 0) { 
		    Random rand = new Random();
			int start = rand.nextInt(word.length());
		    char character = word.charAt(start);
		    shuffledWord.append(character);
		    word.deleteCharAt(start);
		}
		return shuffledWord;
		
		
		
		
	}

}

