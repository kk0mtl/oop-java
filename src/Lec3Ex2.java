import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int a = sc.nextInt();

		for(int i = 1; i <= a; i++) {
			if(a % i == 0)
				System.out.print(i + " ");
		}
		
		sc.close();
	}

}
