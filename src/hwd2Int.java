import java.util.Scanner;

public class hwd2Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한글을 입력하시오: ");
		String n = sc.next();
		
		switch(n) {
		case "하나":
			System.out.println(1);
			break;
		case "둘":
			System.out.println(2);
			break;
		case "셋":
			System.out.println(3);
			break;
		default:
			System.out.println("없음");
			break;
		}
		
		sc.close();

	}

}
