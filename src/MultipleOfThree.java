import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int n = sc.nextInt();

		if (n % 3 == 0)
			System.out.println(n + "��(��) 3�� ����Դϴ�.");
		else
			System.out.println(n + "��(��) 3�� ����� �ƴմϴ�.");

		sc.close();
	}

}
