package day03_operator;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int num = input.nextInt();
		if (num % 3 == 0)
			System.out.println(num + "�� 3�� ����Դϴ�");
		
		System.out.println("===================================");
		System.out.println("�� �� �Է� : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int aa = a < 0 ? a * (-1) : a;
		int bb = b < 0 ? b * (-1) : b;
		int cc = c < 0 ? c * (-1) : c;
		System.out.println(a + "�� ���밪: " + aa);
		System.out.println(b + "�� ���밪: " + bb);
		System.out.println(c + "�� ���밪: " + cc);
		System.out.println("===================================");

		System.out.println("�� �� �Է� : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int print = num1;
		if (print < num2)
			print = num2;

		System.out.println("���� ū ��" + print);
		System.out.println("===================================");

		System.out.println("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		int num3 = input.nextInt();

		print = num1;
		if (print < num2)
			print = num2;
		if (print < num3)
			print = num3;
		System.out.println("���� ū ��" + print);
		System.out.println("===================================");

		System.out.println("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();

		print = num1;
		if (print < num2)
			print = num2;
		if (print % 2 == 0)
			System.out.println("���� ū ������ ¦��" + print);
		System.out.println("===================================");
		System.out.println("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();

		int sum = num1 + num2;
		if (sum % 2 == 0 && sum % 3 == 0)
			System.out.println("¦���̸鼭 3�� ���: " + sum);

	}

}
