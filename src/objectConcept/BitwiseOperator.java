package objectConcept;

public class BitwiseOperator {

	public static void main(String[] args) {
		int bitmask = 0x000F;
		int val = 0x2222;
		
		//work like And operator
		System.out.println(val & bitmask);

	}

}
