
public class KoreanChar {

	public static void main(String[] args) {
		int[] cons = { 0xB098, 0xB2E4, 0xB77C, 0xB9C8, 0xBC14, 0xC0AC, 
				0xC544, 0xC790, 0xCC28, 0xCE74, 0xD0C0, 0xD30C, 0xD558 };
		
		int start = 0xAC00;
		
		do {
			for(int i : cons) {
				if(start == i) System.out.println("\n----------------");
			}
			System.out.print((char) start);
			start++;
		} while(start <= 0xD7A3);

	}

}
