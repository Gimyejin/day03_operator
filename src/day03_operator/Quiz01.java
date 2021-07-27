package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int a = input.nextInt();
		if (a % 3 == 0)
			System.out.println(a + "는 3의 배수이다");
		System.out.println("두 수 입력 : ");
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("b : " + b + ", c : " + c);
		if (b > c)
			System.out.println("b가 c보다 크다");
		else if (b < c)
			System.out.println("b가 c보다 작다");
		else if (b == c)
			System.out.println("b가 c와 같다");
	}

}
