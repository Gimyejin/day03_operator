package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int a = input.nextInt();
		if (a % 3 == 0)
			System.out.println(a + "�� 3�� ����̴�");
		System.out.println("�� �� �Է� : ");
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("b : " + b + ", c : " + c);
		if (b > c)
			System.out.println("b�� c���� ũ��");
		else if (b < c)
			System.out.println("b�� c���� �۴�");
		else if (b == c)
			System.out.println("b�� c�� ����");
	}

}
