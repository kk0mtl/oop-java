import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nArr = new int [5];
		
		System.out.println("숫자 5개를 입력하세요 : ");
		for(int i = 0; i < nArr.length; i++) {
			nArr[i] = sc.nextInt();
		}
		
		Arrays.sort(nArr);
		
		System.out.println("배열의 가운데 값은 " + nArr[2] + "입니다.");
		
		sc.close();
	}

}
