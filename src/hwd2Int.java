import java.util.Scanner;

public class hwd2Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱ��� �Է��Ͻÿ�: ");
		String n = sc.next();
		
		switch(n) {
		case "�ϳ�":
			System.out.println(1);
			break;
		case "��":
			System.out.println(2);
			break;
		case "��":
			System.out.println(3);
			break;
		default:
			System.out.println("����");
			break;
		}
		
		sc.close();

	}

}
