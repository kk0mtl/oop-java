import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nArr = new int [5];
		
		System.out.println("���� 5���� �Է��ϼ��� : ");
		for(int i = 0; i < nArr.length; i++) {
			nArr[i] = sc.nextInt();
		}
		
		Arrays.sort(nArr);
		
		System.out.println("�迭�� ��� ���� " + nArr[2] + "�Դϴ�.");
		
		sc.close();
	}

}
