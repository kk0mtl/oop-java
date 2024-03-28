import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		int b = sc.nextInt();
		
		if(a > b) System.out.println("큰 수는 " + a + "입니다.");
		else if(a == b) System.out.println("두 수가 같습니다.");
		else System.out.println("큰 수는 " + b + "입니다.");

		sc.close();
	}

}
