import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int a = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int b = sc.nextInt();
		
		if(a > b) System.out.println("ū ���� " + a + "�Դϴ�.");
		else if(a == b) System.out.println("�� ���� �����ϴ�.");
		else System.out.println("ū ���� " + b + "�Դϴ�.");

		sc.close();
	}

}
