package day03_operator;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num = input.nextInt();
		if (num % 3 == 0)
			System.out.println(num + "은 3의 배수입니다");
		
		System.out.println("===================================");
		System.out.println("세 수 입력 : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int aa = a < 0 ? a * (-1) : a;
		int bb = b < 0 ? b * (-1) : b;
		int cc = c < 0 ? c * (-1) : c;
		System.out.println(a + "의 절대값: " + aa);
		System.out.println(b + "의 절대값: " + bb);
		System.out.println(c + "의 절대값: " + cc);
		System.out.println("===================================");

		System.out.println("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int print = num1;
		if (print < num2)
			print = num2;

		System.out.println("제일 큰 수" + print);
		System.out.println("===================================");

		System.out.println("세 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		int num3 = input.nextInt();

		print = num1;
		if (print < num2)
			print = num2;
		if (print < num3)
			print = num3;
		System.out.println("제일 큰 수" + print);
		System.out.println("===================================");

		System.out.println("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();

		print = num1;
		if (print < num2)
			print = num2;
		if (print % 2 == 0)
			System.out.println("제일 큰 수이자 짝수" + print);
		System.out.println("===================================");
		System.out.println("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();

		int sum = num1 + num2;
		if (sum % 2 == 0 && sum % 3 == 0)
			System.out.println("짝수이면서 3의 배수: " + sum);

	}

}
