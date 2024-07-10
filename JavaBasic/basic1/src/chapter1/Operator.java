package chapter1;

public class Operator {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 7;
		double c = 15.0;
		double d = 7.0;
		
		int intResult = 0;
		double doubleResult = 0.0;
		
		// 산술 연산자 : 숫자 데이터에 대해 사칙연산을 수행
		// => 정수 + 실수 = 실수;
		
		// 더하기 : +
		// 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		System.out.println(intResult); // 22
		System.out.println(c + d); // 22.0
		System.out.println(a + c); // 30.0 
		
		// 빼기 : -
		// 좌항에 우항을 뺀 값을 반환
		intResult = a - b;
		System.out.println(intResult); // 8
		doubleResult = c - d;
		System.out.println(doubleResult); // 8.0
		doubleResult = a - c;
		System.out.println(doubleResult); // 0.0
		
		// 곱하기 : *
		// 좌항에 우항을 곱한 결과를 반환
		intResult = a * b;
		System.out.println(intResult); // 105
		doubleResult = c * d;
		System.out.println(doubleResult); // 105.0
		doubleResult = a * c;
		System.out.println(doubleResult); // 225.0
		
		// 나누기 : /
		// 좌항에 우항을 나눈 결과를 반환
		b = 2;
		intResult = a / b;
		System.out.println(intResult); // 7 => int라서 나누기는 다 나누지만 실수 나머지를 담지 못해서 버리고 결과 반환
		doubleResult = c / d;
		System.out.println(doubleResult); // 2.142857142857143
		doubleResult = a / d;
		System.out.println(doubleResult); // 2.142857142857143 => double로 값을 받기 때문에 실수 나머지들 다 받아내서 반환

	}

}







