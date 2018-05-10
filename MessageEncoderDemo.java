
public class MessageEncoderDemo {
	public static void main(String args[]) {
		
		SubstitutionCipher a = new SubstitutionCipher(1); 
		a.encodeShift('f'); // shifts a single character
		
		
		
		
		ShuffleCipher b = new ShuffleCipher(1);
		System.out.println(b.encodeShuffle("abcdefghi")); // shuffles once
		
		
	}
}
