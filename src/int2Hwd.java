import java.util.Scanner;

public class int2Hwd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
			break;
		}
		
		sc.close();
	}

}
