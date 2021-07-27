package day03_operator;

public class Ex05_Op {

	public static void main(String[] args) {
		/*
		 논리연산자 
		 -참 또는 거짓 표현
		 - ||(or) : 하나라도 참이 존재하면 결과는 참
		 	-true || false : true 
		 	-false || false : false
		 -&&(and) : 모두가 참일 때 참, 하나라도 거짓이 있으면 거짓
		 -!(not) : 결과를 반전 시켜준다
		 */
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(false && true);
		System.out.println(true && true);
		System.out.println(!true);
	}

}
