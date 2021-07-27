package day03_operator;

import java.util.Scanner;

public class Ex08_if {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if (num > 10)
			System.out.println("1종속 문장 실행");
			System.out.println("2종속 문장 실행");//중괄호가 없으면 한문장 종속문장으로 인식함
		System.out.println("다음문정 실행");
	}

}
