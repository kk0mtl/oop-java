package java1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int n = sc.nextInt();
		
		if(n % 2 ==0) System.out.println("�Էµ� ������ ¦���Դϴ�.");
		else System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		
		sc.close();
	}

}
