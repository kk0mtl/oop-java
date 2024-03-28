import java.util.Scanner;

public class int2Hwd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("없음");
			break;
		}
		
		sc.close();
	}

}
